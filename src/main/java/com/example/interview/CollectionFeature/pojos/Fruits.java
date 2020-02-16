package com.example.interview.CollectionFeature.pojos;

import com.example.interview.CollectionFeature.pojo.Apple;
import com.example.interview.CollectionFeature.pojo.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-16 15:50
 * @Version: 1.00
 */
public class Fruits {

	public static List<Fruit> arrayList(Integer len) {
		List<Fruit> list = new ArrayList<>();
		Apple a = null;
		for (int i = 0; i < len; i++) {
			a = new Apple(i);
			list.add(a);
		}
		return list;
	}

}
