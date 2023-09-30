package com.jingdianjichi.user.mapper.service.impl;

import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.po.UserPo;
import com.jingdianjichi.user.mapper.UserMapper;
import com.jingdianjichi.user.mapper.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//实现类 实现service
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        //dto 转化为 po
        //方式：beanutils
        //方式2:mapstruct 效率更高
        BeanUtils.copyProperties(userDto,userPo);
        int count = userMapper.insert(userPo);
        return count;
    }
}
