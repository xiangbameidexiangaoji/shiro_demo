package com.example.shirodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ShiroDemoApplication.class)
@RunWith(SpringRunner.class)
public class ShiroDemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("123");
    }

}
