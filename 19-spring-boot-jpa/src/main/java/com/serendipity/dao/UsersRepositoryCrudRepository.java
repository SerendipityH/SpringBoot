package com.serendipity.dao;

import org.springframework.data.repository.CrudRepository;

import com.serendipity.pojo.Users;

/**
 * CrudRepository接口
 */
public interface UsersRepositoryCrudRepository extends CrudRepository<Users, Integer> {
    
}
