package com.itbase.plugin.vo;

import lombok.Data;

@Data
public class UserVo {

	private String name;
	
	private Integer age;

	public UserVo(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
}
