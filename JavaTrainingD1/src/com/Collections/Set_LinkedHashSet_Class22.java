package com.Collections;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet_Class22 {
//Insertion Order|no Duplicate value|no duplicate null value
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(12);
		System.out.println(lhs.add(23));
		System.out.println(lhs.add(45));
		System.out.println(lhs.add(23));//does not allow Duplicate value
		System.out.println(lhs.add(null));
		System.out.println(lhs.add(null));//does not allow Duplicate null value
		System.out.println(lhs);//Random Order

	}

}
