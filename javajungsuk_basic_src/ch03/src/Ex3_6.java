class Ex3_6 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b);
	}
}


//피연산자가 정수형일 경우 나누는 수로 0을 사용할수 없음
//나누기 연산자의두 피연산자가 모두 int타입인 경우, 연산 결과 역시 int타입
//어느 한 쪽을 실수형으로 형반환시 다른 한 쪽도 같이 변환
