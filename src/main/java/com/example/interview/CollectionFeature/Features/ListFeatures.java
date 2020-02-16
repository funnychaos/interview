package com.example.interview.CollectionFeature.Features;

import com.example.interview.CollectionFeature.pojo.*;
import com.example.interview.CollectionFeature.pojos.Fruits;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @Description: List相关功能使用
 * @Author: solar
 * @Date: 2020-02-16 15:47
 * @Version: 1.00
 */
public class ListFeatures {

	public static void main(String[] args) {
		Random rand = new Random(47);

		List<Fruit> fruitList = Fruits.arrayList(7);
		System.out.println("1:" + fruitList);

		Orange o = new Orange(8);
		fruitList.add(o);
		System.out.println("2:" + fruitList);
		System.out.println("3" + fruitList.contains(o));
		fruitList.remove(o);


		Fruit fruit = fruitList.get(2);
		System.out.println("4" + fruit +fruitList.indexOf(fruit));

		Fruit grape = new Grape();
		System.out.println("%:" + fruitList.indexOf(grape));
		System.out.println("6:" + fruitList.remove(grape));

		System.out.println("7:" + fruitList.remove(fruit));
		System.out.println("8:" + fruitList);

		fruitList.add(3,new Banana());
		System.out.println("9:" + fruitList);

		List<Fruit> sub = fruitList.subList(1,4);
		System.out.println("subList;" + sub);
		System.out.println("10:" + fruitList.containsAll(sub));

		//Collections.sort((List<T>) sub);
		System.out.println("sorted sub:" + sub);


		//分界线
		System.out.println("------------------------------------------------");
		/**
		 * ListIterator 迭代器
		 * 特点：与普通的迭代器相比，这个迭代器可以双向迭代list列表
		 */
		List<Fruit> fruitList1 = Fruits.arrayList(8);
		ListIterator<Fruit> it = fruitList1.listIterator();
		while (it.hasNext()){
			System.out.println(it.next() + "." + it.nextIndex()+"\n");
		}
		while (it.hasPrevious()){
			System.out.println(it.previous() + "." + it.previousIndex()+"\n");
		}

		it = fruitList1.listIterator(3);
		while (it.hasNext()){
			it.next();
			it.set(new Fruit());
		}
		System.out.println(fruitList1);


	}
}
