package com.example.interview.CollectionFeature.pojo;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-16 15:57
 * @Version: 1.00
 */
public class Fruit {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Fruit() {
	}

	public Fruit(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Fruit{" +
				"id=" + id +
				'}';
	}
}
