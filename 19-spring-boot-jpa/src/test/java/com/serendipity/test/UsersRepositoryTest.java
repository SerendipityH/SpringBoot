package com.serendipity.test;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.serendipity.App;
import com.serendipity.dao.UsersRepositoryQueryAnnotation;
import com.serendipity.dao.UsersRepository;
import com.serendipity.dao.UsersRepositoryByName;
import com.serendipity.dao.UsersRepositoryCrudRepository;
import com.serendipity.dao.UsersRepositoryPagingAndSorting;
import com.serendipity.pojo.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class UsersRepositoryTest {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersRepositoryByName usersRepositoryByName;


    @Autowired
    private UsersRepositoryQueryAnnotation usersRepositoryQueryAnnotation;

    @Autowired
    private UsersRepositoryCrudRepository usersRepositoryCrudRepository;

    @Autowired
    private UsersRepositoryPagingAndSorting usersRepositoryPagingAndSorting;

    @Test
    public void testSave() {
        Users users = new Users();
        users.setAddress("china");
        users.setAge(20);
        users.setName("tom");
        usersRepository.save(users);
    }

    /**
     * Repository --方法名称命名测试
     */
    @Test
    public void testFindByName() {
        List<Users> list = usersRepositoryByName.findByName("tom");
        for (Users users : list) {
            System.out.println(users.toString());
        }
    }

    @Test
    public void testFindByNameAndAge() {
        List<Users> list = usersRepositoryByName.findByNameAndAge("tom", 20);
        for (Users users : list) {
            System.out.println(users.toString());
        }
    }

    @Test
    public void testfindByNameLike() {
        List<Users> list = usersRepositoryByName.findByNameLike("to%");
        for (Users users : list) {
            System.out.println(users.toString());
        }
    }

    /**
     * Query测试
     */

    @Test
    public void queryByNameUseHQL() {
        List<Users> list = usersRepositoryQueryAnnotation.queryByNameUseHQL("tom");
        for (Users users : list) {
            System.out.println(users.toString());
        }
    }

    @Test
    public void queryByNameUserHQL() {
        List<Users> list = usersRepositoryQueryAnnotation.queryByNameUseSQL("tom");
        for (Users users : list) {
            System.out.println(users.toString());
        }
    }

    @Test
    @Transactional
    public void updateUsersNameById() {
        usersRepositoryQueryAnnotation.updateUsersNameById("tomttt", 1);

    }

    /**
     * CrudRepository测试添加
     */
    @Test
    public void testCrudRepositorySave() {
        Users users = new Users();
        users.setAddress("beijing");
        users.setName("xiaoming");
        users.setAge(10);
        usersRepositoryCrudRepository.save(users);
    }

    /**
     * CrudRepository测试修改
     */
    @Test
    public void testCrudRepositoryUpdate() {
        Users users = new Users();
        users.setId(3);
        users.setAddress("shanghai");
        users.setName("xiaohong");
        users.setAge(10);
        usersRepositoryCrudRepository.save(users);
    }

    /**
     * CrudRepository测试查询
     */
    @Test
    public void testCrudRepositoryFindOne() {

        Optional<Users> users = usersRepositoryCrudRepository.findById(3);
        System.out.println(users);
    }

    @Test
    public void testCrudRepositoryFindAll() {
        Iterable<Users> list = usersRepositoryCrudRepository.findAll();
        for (Users users : list) {
            System.out.println(users);
        }

    }

    @Test
    public void testCrudRepositoryDeleteById() {
        usersRepositoryCrudRepository.deleteById(3);

    }

    /**
     * PagingAndSorting 排序测试
     */
    @Test
    public void testUsersRepositoryPagingAndSorting() {

        // Order定义排序规则
        Order order = new Order(Direction.DESC, "id");
        // Sort对象封装了排序规则
        Sort sort = new Sort(order);
        Iterable<Users> list = usersRepositoryPagingAndSorting.findAll(sort);
        for (Users users : list) {
            System.out.println(users);
        }
    }
    
    
    /**
     * PagingAndSorting 分页测试
     */
    @Test
    public void testUsersRepositoryPagingAndSortingPaging() {
        //Pageable：封装了分页的参数，当前页，每页显示的参数。
        //注意：当前页从0开始
        Pageable pageable=new PageRequest(0, 1);
        Page<Users> page = usersRepositoryPagingAndSorting.findAll(pageable);
        System.out.println("总条数:"+page.getTotalElements());
        System.out.println("总页数"+page.getTotalPages());
        List<Users> content = page.getContent();
        for (Users users : content) {
            System.out.println(users);
        }
    }
}
