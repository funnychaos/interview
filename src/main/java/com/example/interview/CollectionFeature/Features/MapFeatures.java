package com.example.interview.CollectionFeature.Features;

import com.example.interview.CollectionFeature.pojo.Apple;
import com.example.interview.CollectionFeature.pojo.Fruit;
import com.example.interview.CollectionFeature.pojo.Orange;
import com.example.interview.CollectionFeature.pojo.Person;

import java.util.*;

/**
 * @Description: Map使用
 * @Author: solar
 * @Date: 2020-02-16 21:01
 * @Version: 1.00
 */
public class MapFeatures {

	/*记录随机数的出现频率*/
	public static void getFrequency(){
		Random rand = new Random(47);
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<10000;i++){
			int r = rand.nextInt(20);
			Integer feeq = map.get(r);
			map.put(r,feeq==null?1:feeq+1);
		}
		System.out.println(map);
	}

	/*map使用*/
	public static void mapFeature(){
		Map<Person, List<? extends Fruit>> map = new HashMap<Person,List<?extends Fruit>>();
		map.put(new Person("Dawn"), Arrays.asList(new Apple(1),new Apple(2),new Orange(3)));
		map.put(new Person("solar"), Arrays.asList(new Apple(4),new Apple(5),new Orange(6)));

		Set<Person> people = map.keySet();
		System.out.println("person:" + people);
		Collection<List<? extends Fruit>> values = map.values();
		System.out.println("value:" + values);

		for(Person person:people){
			System.out.println("key:" + person);
			for(Fruit f:map.get(person)){
				System.out.println("values:" + f);
			}
		}
	}


	public static void main(String[] args) {
		//getFrequency();
		mapFeature();
	}
}
