package com.Collections;

import java.util.TreeSet;

public class Set_TreeSet_Class22 {
//Ascending order|no Duplicate value|no Null Value
	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<Integer>();
		ts.add(12);
		System.out.println(ts.add(23));
		System.out.println(ts.add(45));
		System.out.println(ts.add(23));//does not allow Duplicate value
		//System.out.println(ts.add(null));//does not allow Null value-throws java.lang.NullPointerException
		System.out.println(ts);//Ascending Order
	}

}
