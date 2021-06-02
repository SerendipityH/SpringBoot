package com.serendipity.service;

import java.util.List;

import com.serendipity.pojo.Users;

public interface UsersService {
    /**
     * 添加用户
     * @param users
     */
    void addUser(Users users);
    /**
     * 查找所有用户
     * @return
     */
    List<Users> findAllUsers();
    
    Users findUserById(Integer id);
    
    /*
         * 修改用户
     */
    
    void updateUser(Users user);
    
   /**
        * 删除用户
    * @return 
    */
    
    void deleteUserById(Integer id);
}
