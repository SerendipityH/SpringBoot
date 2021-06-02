package com.serendipity.mapper;

import com.serendipity.pojo.Users;

import java.util.List;

public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectAllUsers();

    Users selectUserById(Integer id);

    void updateUser(Users user);

    void deleteUserById(Integer id);
}
