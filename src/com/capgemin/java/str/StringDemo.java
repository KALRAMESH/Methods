package com.capgemin.java.str;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "abcdegsjkk";
		System.out.println(str1);
		System.out.println(str1.charAt(3));
		System.out.println(str1.indexOf('c'));
	
	
String str2 = "Monu, Sonu, Ponu, Ranu";

String[] arr = str2.split(",");

for(String s: arr);
	System.out.println(str2);


String str3 ="abcd&12?";
String str4 =str3.replaceAll("[^a-zA-Z]", "");
System.out.println(str3);
System.out.println(str4);

}
}


