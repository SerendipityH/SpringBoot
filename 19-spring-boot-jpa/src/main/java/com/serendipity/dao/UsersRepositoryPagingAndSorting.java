package com.serendipity.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.serendipity.pojo.Users;

public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<Users, Integer>{

}
