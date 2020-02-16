package com.example.interview.CollectionFeature.pojo;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-16 14:41
 * @Version: 1.00
 */
public class Orange extends Fruit {

	private int id;

	public Orange(int id) {
		this.id = id;
	}

	public Orange() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Orange{" +
				"id=" + id +
				'}';
	}
}
