package com.serendipity.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.serendipity.service.UsersService;

public class QuartzDemo implements Job{
    @Autowired
    private UsersService usersService;
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // TODO Auto-generated method stub
        System.out.println("Execute..."+new Date());
        usersService.addUsers();
    }
    
}
