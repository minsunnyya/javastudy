class Ex3_14 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}

//'>='와 같이 두 개의기호로 이루어진 연산자는 '=>'와 같이 기호의 순서를 바꾸거나 
//'> ='와 같이 중간에 공백을 두어서는 안된다. 

//만약 a 와 "123"의내용이같아도 ==로 비교하면 false결과를 얻음 내용은같지만 서로 다른 객체라 그럼
//그래서 문자열 비교할때는 항상 equals를사용
//대소문자 구별하지 않고 사용하고 싶으면 equalsignorecase사용

//나눗셈 연산자 반올림하지 않고 버림