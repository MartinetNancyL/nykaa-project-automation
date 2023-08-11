package com.Collections;

import java.util.HashMap;

public class HashMap_Class23 {
//Key Value Pair|key value will be overridden|does not support dissimilar data type|{}
	//Random Order|maximum speed
	public static void main(String[] args) {
		HashMap<Integer,String> hmp= new HashMap<>();
		hmp.put(-9, null);
		hmp.put(1, "key");
		hmp.put(1, "hash");//overrides key 1
		System.out.println(hmp.put(3,"KVP"));//return type null
		System.out.println(hmp);//Random Order
		HashMap<String,Integer> hmp1= new HashMap<>();
		hmp1.put("Java", -99);
		hmp1.put("Selenium", -99);
		hmp1.put("Selenium", 2019);//value overridden for Key- Selenium
		System.out.println(hmp1);//Random Order
		
		
	}

}
