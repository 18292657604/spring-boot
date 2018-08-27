package com.musingtec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.musingtec.mapper")
@EnableAutoConfiguration
public class App {
	  public static void main(String[] args) {
	         SpringApplication.run(App.class, args);
	  }
}
