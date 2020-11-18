package com.huang.springboot.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DogTest {
    @Autowired
    private Dog dog;

    @Test
    public void test(){
        System.out.println(dog);
    }

}