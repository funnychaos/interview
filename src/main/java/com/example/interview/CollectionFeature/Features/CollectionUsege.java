package com.example.interview.CollectionFeature.Features;


import java.util.*;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-16 15:14
 * @Version: 1.00
 */
public class CollectionUsege {

	public static void main(String[] args) {
		Collection <Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		Integer[] integers = {7,8,9,10,11};

		collection.addAll(Arrays.asList(integers));

		Collections.addAll(collection,12,13,14,15);
		Collections.addAll(collection,integers);

		List<Integer> list = Arrays.asList(19,20,21,22);
		list.set(3,99);
	}
}
