package com.enshub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("test")
@EnableAutoConfiguration
@MapperScan(basePackages = "com.enshub.mapper")
public class JenkinsdemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

	@GetMapping("/demo")
	@Transactional
	public  String info (){
//		personService.txA();
//		personService.txB();
		return "hello";
	}
}
