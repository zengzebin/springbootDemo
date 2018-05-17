package com.zeng.demo.mode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 加入这个注解，Demo就会进行持久化了，在这里没有对@Table进行配置，请自行配置。
public class Demo {
	@Id
	@GeneratedValue
	private long id;// 主键.
	private String name;// 测试名称.
}
