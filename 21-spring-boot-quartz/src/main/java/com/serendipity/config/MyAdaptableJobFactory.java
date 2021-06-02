package com.serendipity.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component("myAdaptableJobFactory")
public class MyAdaptableJobFactory extends AdaptableJobFactory {
    //AutowireCapableBeanFactory 可以将一个对象添加到SpringIOC容器中，并且完成对象注入
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;
    
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        // TODO Auto-generated method stub
        Object object=super.createJobInstance(bundle);
        //将object对象添加到Spring IOC容器中，并完成注入
        autowireCapableBeanFactory.autowireBean(object);
        return object;
    }
    
}
