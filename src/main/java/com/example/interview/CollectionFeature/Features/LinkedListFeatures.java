package com.example.interview.CollectionFeature.Features;

import com.example.interview.CollectionFeature.pojo.Fruit;
import com.example.interview.CollectionFeature.pojos.Fruits;

import java.util.LinkedList;

/**
 * @Description: linkedList使用 其物理结构为链表，可以在当作队列、双端队列、栈使用
 * @Author: solar
 * @Date: 2020-02-16 18:55
 * @Version: 1.00
 */
public class LinkedListFeatures {

	public static void main(String[] args) {
		//新建
		int init = 8;
		LinkedList<Fruit> linkedList = new LinkedList<>(Fruits.arrayList(init));
		System.out.println(linkedList);

		System.out.println("first:" + linkedList.getFirst());

		System.out.println("element:" + linkedList.element());

		System.out.println("peek:" + linkedList.peek());

		System.out.println("poll:" + linkedList.poll());

		System.out.println(linkedList);

		System.out.println("remove:" + linkedList.remove());

		System.out.println("removeFirst;" + linkedList.removeFirst());

		System.out.println("poll:" + linkedList.poll());

		System.out.println("linklist:" + linkedList);

		linkedList.add(new Fruit(++init));

		System.out.println("after add:" +linkedList);

		linkedList.offer(new Fruit(++init));

		System.out.println("after offer:" + linkedList);

		linkedList.add(new Fruit(++init));

		System.out.println("after add again:" + linkedList);

		linkedList.addLast(new Fruit(++init));

		System.out.println("after add last:" + linkedList);

		System.out.println("removelast:" + linkedList.removeLast());

		System.out.println(linkedList);


	}
}
