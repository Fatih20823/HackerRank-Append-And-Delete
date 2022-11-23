package com.main;

public class Application {

	public static void main(String[] args) {
		String s = "HackerHappy",str1;  // 11 eleman
		String t = "HackerRank",str2; // 10 eleman
		
		int k = 100;
		int kk=k;
		str1 = s; str2=t;
		int toplamUzunluk = s.length()+t.length();
		int fark = s.length()-t.length();
		while (k>toplamUzunluk) k = k-2;
		int sinir = (k-fark)/2 + fark;
		if (k>=Math.abs(fark) & (k-fark)%2==0){
			for(int i = 0; i < sinir ; i++) {
				str1 = str1.substring(0,str1.length()-1);
			}
			str1 = str1 + str2.substring(str1.length());
		}
		String result;
		if (str1.equals(str2) || kk>toplamUzunluk) result = "Yes"; else result = "No";
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("result = " + result);
		

	}

}
