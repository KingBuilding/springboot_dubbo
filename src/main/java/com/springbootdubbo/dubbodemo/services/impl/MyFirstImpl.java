package com.springbootdubbo.dubbodemo.services.impl;

import com.springbootdubbo.dubbodemo.services.MyFirst;
import org.apache.dubbo.config.annotation.Service;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

/**
 * Author: 金🗡
 * Date: 2019/5/23 0:36
 */
@Service(version ="1.0.0",dynamic = true)
public class MyFirstImpl implements MyFirst {

    RocketMQTemplate rocketMQTemplate;

    @Override
    public String first() {

        return "first";
    }
}
