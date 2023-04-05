package com.example.redisexample.service.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisTemplateImplTest {

    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @DisplayName("레디스 String 값 insert, read 테스트")
    @Test
    public void test(){

        String key = "test";
        String value = "test";

        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();

        valueOperations.set(key, value);

        String result = (String)redisTemplate.opsForValue().get(key);

        assertThat(value).isEqualTo(result);
    }

}