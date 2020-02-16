package com.example.interview.CollectionFeature.pojo;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-16 21:19
 * @Version: 1.00
 */
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
