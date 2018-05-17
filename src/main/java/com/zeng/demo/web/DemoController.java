package com.zeng.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StemQ
 * @version v1.0
 * Blog:http://blog.csdn.net/stemq
 * Web:www.dqiang.com
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	 @RequestMapping("/getDemo")
	public String greeting() {
		 System.out.println(1111);
		return "Hello World!";
	}
	 
	 
	 @RequestMapping("/zeroException")
	    public int zeroException(){
	     return 100/0;

	 }
}
