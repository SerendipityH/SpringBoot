package com.serendipity.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.serendipity.App;
import com.serendipity.dao.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {App.class})
public class UserServiceTest {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Test
    public void testAddUser() {
        userServiceImpl.addUser();
    }
    
}
