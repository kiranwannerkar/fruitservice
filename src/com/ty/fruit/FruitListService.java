package com.ty.fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FruitListService {

	public static List<String> addFruitsToList(String str) {
		String strs = str.toLowerCase();
		String[] str1 = strs.split(",");
		List<String> list = Arrays.asList(str1);
		Set<String> s = new LinkedHashSet<String>(list);
		ArrayList<String> al = new ArrayList<String>(s);

		return al;

	}

	public static int searchFruitInList(List<String> list, String str) {
		int rs = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.contains(str)) {
				rs = list.indexOf(str);

				return rs;
			}

		}

		return -1;
	}

	public static int searchFruitInListIgnoreCase(List<String> list, String str) {
		int rs = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equalsIgnoreCase(str)) {

				return i;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		String str = "apple,mAngo,Mango,Cherry";
		System.out.println(addFruitsToList(str));
		System.out.println("****************************************************");

		String s = "banana";
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("Cherry");
		System.out.println(searchFruitInList(list, s));
		System.out.println("****************************************************");

		String s1 = "Cherry";
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("mango");
		list1.add("cherry");
		System.out.println(searchFruitInListIgnoreCase(list1, s1));

	}

}
