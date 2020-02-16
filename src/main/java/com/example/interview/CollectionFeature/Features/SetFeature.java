package com.example.interview.CollectionFeature.Features;

import java.util.*;

/**
 * @Description: set的使用
 * @Author: solar
 * @Date: 2020-02-16 19:30
 * @Version: 1.00
 */
public class SetFeature {


	/*新建HashSet*/
	public static void getHashSet(){
		Random rand = new Random(500);
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<10000;i++){
			set.add(rand.nextInt(20));
		}
		System.out.println(set);
	}

	/*新建TreeSet*/
	public static void getTreeSet(){
		Random rand = new Random(500);
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<10000;i++){
			set.add(rand.nextInt(20));
		}
		System.out.println(set);
	}

	/*测试set的功能*/
	public static void testSet(){
		Set<String> set = new HashSet<String>();
		Collections.addAll(set,"a b c d e f".split(" "));
		set.add("m");
		System.out.println("h:" + set.add("h"));
		System.out.println("set:" + set);

		Set<String> set1 = new HashSet<>();
		Collections.addAll(set1,"h a p q r s".split(" "));
		System.out.println("set1 in set:" + set.containsAll(set1));

		set.remove("a");
		System.out.println("set1 in set again:" + set.containsAll(set1));

		set.removeAll(set1);
		System.out.println("set remove from set1：" + set);

		Collections.addAll(set,"x y z".split(" "));
		System.out.println("'x y z' add to set:" + set);
	}

	/*获取硬盘文件*/
	//Set<String> words = new TreeSet<>();




	public static void main(String[] args) {
		//getHashSet();
		//getTreeSet();
		testSet();
	}
}

