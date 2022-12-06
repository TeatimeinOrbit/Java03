package java_eclipse_test;

public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいうえお";
		System.out.println(string1 + "の文字数は" + string1.length());
		
		String string2;
		string2 = "";
		System.out.println(string2 + "の文字数は" + string2.length());
		
		string1 = null;
		System.out.println(string1 + "の文字数は" + string1.length());
	}

}
