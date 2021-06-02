package com.serendipity.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.serendipity.App;
import com.serendipity.dao.UsersRepository;
import com.serendipity.pojo.Roles;
import com.serendipity.pojo.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class OneToManyTest {
    @Autowired
    private UsersRepository usersRepository;

    /*
     * 一对多关联关系的添加
     */
    @Test
    public void testSave() {
        // 创建一个用户
        Users users = new Users();
        users.setAddress("guizhou");
        users.setAge(30);
        users.setName("xiaoting");
        
        //创建一个角色
        Roles roles=new Roles();
        roles.setRolename("管理员");
                
        //关联
        roles.getUsers().add(users);
        users.setRoles(roles);
        
        //保存
        usersRepository.save(users);
    }
}
