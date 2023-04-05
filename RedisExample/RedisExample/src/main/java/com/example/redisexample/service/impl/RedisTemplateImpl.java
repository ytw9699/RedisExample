package com.example.redisexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisTemplateImpl {

    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public RedisTemplateImpl(RedisTemplate<String,String> redisTemplate){
        this.redisTemplate = redisTemplate;
    }
    public void test(){
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("test", "test");
    }

}
