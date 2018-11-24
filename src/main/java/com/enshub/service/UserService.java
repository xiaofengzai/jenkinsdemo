package com.enshub.service;

import com.enshub.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaofengzai
 * @since 2018-11-24
 */
public interface UserService extends IService<User> {
    List<User> queryByName(String name);
}
