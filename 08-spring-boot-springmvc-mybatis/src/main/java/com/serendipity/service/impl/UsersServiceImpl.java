package com.serendipity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.serendipity.mapper.UsersMapper;
import com.serendipity.pojo.Users;
import com.serendipity.service.UsersService;


@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    
    @Autowired
   private UsersMapper usersMapper;
    
    @Override
    public void addUser(Users users) {
        // TODO Auto-generated method stub
        usersMapper.insertUser(users);
    }

    @Override
    public List<Users> findAllUsers() {
        return usersMapper.selectAllUsers();
    }

    @Override
    public Users findUserById(Integer id) {
        // TODO Auto-generated method stub
        return usersMapper.selectUserById(id);
    }

    @Override
    public void updateUser(Users user) {
        // TODO Auto-generated method stub
        usersMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        // TODO Auto-generated method stub
        usersMapper.deleteUserById(id);
    }

}
