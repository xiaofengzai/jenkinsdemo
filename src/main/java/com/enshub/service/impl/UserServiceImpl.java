package com.enshub.service.impl;

import com.enshub.entity.User;
import com.enshub.mapper.UserMapper;
import com.enshub.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaofengzai
 * @since 2018-11-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    public List<User> queryByName(String name){
        return this.baseMapper.queryByName(name);
    }
}
