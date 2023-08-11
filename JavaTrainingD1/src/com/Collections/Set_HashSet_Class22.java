package com.Collections;

import java.util.HashSet;

public class Set_HashSet_Class22 {
//Random Order|no Duplicate value|allow single Null value
	public static void main(String[] args) {
		HashSet<Integer> hS = new HashSet<Integer>();
		hS.add(12);
		System.out.println(hS.add(23));
		System.out.println(hS.add(45));
		System.out.println(hS.add(23));//does not allow Duplicate value
		System.out.println(hS.add(null));
		System.out.println(hS.add(null));//does not allow Duplicate null value
		System.out.println(hS);//Random Order

	}

}
