package com.demo.service;

import com.demo.base.SpringTestBase;
import com.demo.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends SpringTestBase{

    @Autowired
    private UserService userService;

    @Test
    public void findUserById() {
        User user = userService.findUserById(1);
        logger.info(user.toString());
    }
}
