package com.Collections;

import java.util.ArrayList;

public class List_ArrayList_Class21 {
	public static void main(String[] args) {
		ArrayList<Object> ar= new ArrayList<Object>();// ar-collection
		//ArrayList ar= new ArrayList<Object>();
		ar.add(23);
		//ar.add('N');
		ar.add("Java");
		ar.add(45);
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.add("obj")); //boolean return type
		//System.out.println(ar.add(0, "index"));-- void return type
		ar.add(0,1);
		System.out.println("ar: "+ar);
		System.out.println(ar.get(0));
		
		ArrayList<Object> ar2= new ArrayList<Object>();
		ar2.add(234);
		ar2.add("two");
		//System.out.println(ar2.addAll(ar));//boolean rt adds ar collections to the last position
		//System.out.println("ar2: "+ar2);
		
		ArrayList<Object> ar3= new ArrayList<Object>();
		ar3.add(2345);
		ar3.add("three");
		System.out.println(ar3.addAll(1,ar));//boolean rt;(index,E) Inserts all of the elements in the specified collection into this list, starting at the specified position.
		System.out.println("ar3: "+ar3);
		
		ar3.clear();//void rt
		System.out.println("ar3: "+ar3);
		
		System.out.println("ar2 clone: "+ar2.clone());// rt Object
		Object cln = ar2.clone();
		System.out.println("ar2 clone cln: " +cln);
		
		System.out.println("ar2 contains two: "+ar2.contains("two"));//rt boolean
		
		System.out.println("get index2: "+ar.get(2));//rt Element-Returns the element at the specified position in this list.
		ar.add('N');
		System.out.println("index of first occurence of 'N': "+ ar.indexOf('N'));// rt Integer
		System.out.println("contains selenium? "+ar.contains("selenium"));// returns Returns the element at the specified position in this list.
		
		System.out.println("ar3 is empty? "+ar3.isEmpty());//rt boolean
		
		System.out.println("last index of 'N': " +ar.lastIndexOf('N'));//rt Integer
		
		System.out.println("ar: "+ar);
		System.out.println("remove index 5: " +ar.remove(5));
		System.out.println("ar: "+ar);
		System.out.println("remove 1 index or E: " +ar.remove(1));//rt E;answer INDEX *************************
		System.out.println("ar: "+ar);
		System.out.println("ar remove object : "+ar.remove("Java"));//rt boolean object removal not working for char 'N'
		System.out.println("ar: "+ar);
		
		System.out.println("ar2: "+ar2);
		System.out.println("ar: "+ar);
		System.out.println("removeAll ar2: "+ar.removeAll(ar2));//rt boolean;Removes from this list all of its elements that are contained in the specified collection.
		System.out.println("ar2: "+ar);
		System.out.println("ar: "+ar2);
	}

}
