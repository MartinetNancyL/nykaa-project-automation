/**
 * 
 */
package com.Pkg_Java_Training;

/**
 * @author Nancy Lawrence
 *
 */
public class Reverse_without_fn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Automation";
		char chars[]= str.toCharArray();//converted to char Array
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
	}

}
