package com.training.strings;

public class Assignment3 {
	
	public static void main(String[] args) {
		String msg="the nri college code is 121";
		int countOfVowels=0,spaceCount=0,digitCount=0,ctConst=0;
		
		for(int i=0;i<msg.length();i++) {
			char v=msg.charAt(i);
			if(v == 'a' || v== 'e' || v== 'i' || v=='o' ||v =='u') {
				++countOfVowels;
			}else if(v==' '){
				++spaceCount;
			}else if(v>='0' && v<='9') {
				++digitCount;
			}else {
				++ctConst;
			}
		}
		System.out.println("Vowels Count is : "+countOfVowels);
		System.out.println("DigitCount is : "+digitCount);
		System.out.println("Space Count is : "+spaceCount);
		System.out.println("consonants is : "+ctConst);
		
	}

}
