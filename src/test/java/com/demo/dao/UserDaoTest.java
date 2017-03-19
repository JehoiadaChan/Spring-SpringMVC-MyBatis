package com.demo.dao;

import com.demo.base.SpringTestBase;
import com.demo.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/3/19.
 */
public class UserDaoTest extends SpringTestBase {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUserByIdTest() {
        User user = userMapper.selectByPrimaryKey(1);
        logger.info(user.toString());
    }

}
