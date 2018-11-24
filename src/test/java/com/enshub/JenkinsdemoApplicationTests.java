package com.enshub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsdemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("sun.boot.class.path");
		System.out.println(System.getProperty("sun.boot.class.path"));
		System.out.println("java.ext.dirs");
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println("java.class.path");
		System.out.println(System.getProperty("java.class.path"));
	}

}
