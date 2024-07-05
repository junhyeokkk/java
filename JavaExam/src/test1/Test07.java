package test1;

/*
 * 날짜 : 2024/07/03
 * 이름 : 최준혁 
 * 내용 : 1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */

public class Test07 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			if(k%3 == 0 || k%2 == 0) {
				total += k;
			}
		}
		System.out.println("1 ~ 10까지 2와 3배수의 정수의 합 : "+total);
	}
}
