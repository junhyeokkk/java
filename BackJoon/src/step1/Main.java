package step1;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] result = null;
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			c = b+c;
			result[i] = c;
		}
		
		for(int i=0; i<=result.length; i++) {
			System.out.println(result[i]);			
		}

	}	
}
