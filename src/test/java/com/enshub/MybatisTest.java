package com.enshub;

import com.enshub.entity.User;
import com.enshub.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by fengwen on 23/11/2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JenkinsdemoApplication.class)
public class MybatisTest {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
//        User person=new User();
//        person.setAge(10);
//        person.setName("hhas");
//        System.out.println(userService.save(person));
        List<User> list=userService.queryByName("hhas");
        System.out.println("ss");
    }
}
