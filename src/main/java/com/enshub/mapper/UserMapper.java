package com.enshub.mapper;

import com.enshub.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaofengzai
 * @since 2018-11-24
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> queryByName(String name);

}
