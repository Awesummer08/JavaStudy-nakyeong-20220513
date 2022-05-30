package j11_배열;

public class Array03 {

	public static void main(String[] args) {
	
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		/*
		 * 1, 2, 3, 4, 5, 6, 7, 8 로 출력되도록
		 */
		
		//내가 푼 것
//		for(int i = 0, j =0; i < 9; i++) {
//			if(i < 8) {
//				numbers[j] = i+1;
//				System.out.print(numbers[j]+", ");
//				j++;
//			}else {System.out.println(i+1);
//				
//			}
//		}
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	
		
		// 조건문 쓰는 방법
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(numbers.length != i) {
				System.out.println(", ");
			}
		}
		
		// 논리 연산자 쓰는 방법
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ? ", " : ""));
		}
		System.out.println();

		
		// for each 문!
		int i = 0;
		for(int num : numbers) {
			System.out.print(num + (numbers.length-1 != i ? ", " : ""));
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
