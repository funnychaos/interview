package com.example.interview.CollectionFeature.Features;

import com.example.interview.CollectionFeature.pojo.Apple;
import com.example.interview.CollectionFeature.pojo.Grape;
import com.example.interview.CollectionFeature.pojo.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Description:关于ArrayList的使用：增加、删除、修改、查询
 * 				需要注意ArrayList与LinkedList的区别：
 * 					ArrayList物理的存储上采用连续的物理内存，故更有利于查找而不利于删除和插入
 * 					LinkedList物理存储上采用链表的结构，内存并非连续的片段，故更加有利于插入和删除而不利于查找
 * @Author: solar
 * @Date: 2020-02-16 12:24
 * @Version: 1.00
 */
public class ArraylistUsege {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();


		//注意ArrayList在运行时是不可以新增或者删除的，因为其底层结构为固定的数组

		//新增
		list.add("Hello");
		list.add("world");
		list.add("solar");

		System.out.println("list01:" + list);

		//查询
		boolean isContain = list.contains("solar");
		System.out.println("isContain:" + isContain);

		//通过Iterator来遍历
		ListIterator<String> stringListIterator = list.listIterator();
		while(stringListIterator.hasNext()) {
			String s = stringListIterator.next();
			System.out.println("S:" + s);
		}

		//删除
		list.remove("hell");
		System.out.println("list02:" + list);
		list.remove("Hello");
		System.out.println("list03:" + list);


		//清除全部
		list.clear();
		System.out.println("list04:" + list);


		List l2 = new ArrayList();
		l2.add(new Apple());
		l2.add(new Apple());
		l2.add(new Orange());
		l2.add(new Grape());

		for(int i=0;i<l2.size();i++){
			System.out.println("object:"+l2.get(i));
		}


	}
}
