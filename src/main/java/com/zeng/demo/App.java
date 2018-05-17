package com.zeng.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 启动的程序必须放在需要扫描包的外面
		SpringApplication.run(App.class, args);
	}

	// war 情况下就用这个
	/*
	 * @SpringBootApplication public class App extends
	 * SpringBootServletInitializer {
	 * 
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(App.class); } public static void main(String[] args)
	 * throws Exception { SpringApplication.run(App.class, args); }
	 */

}