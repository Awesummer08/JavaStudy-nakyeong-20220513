package j11_배열;

public class Array02 {

	public static void main(String[] args) {
//		int size = 4;
//		int[] numbers = new int[size];  //size 이건 갯수다! 4개의 공간을 만들어라는 걸로 쓰인다. 
//		                                 // index는 0 1 2 3 4개다.
//
//		System.out.println(numbers.length);
		
		
		/*
		 * for문으로 0~99까지 반복을 한다.
		 * 변수 i의 값이 8의 배수이면 
		 * 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다. 
		 * 그리고나서 8의 배열에 들어있는 배열의 8의 배수들을 모두 출력하시오. 
		 * 
		 */
		
		int size = 0;
		
		
		for(int i = 0; i < 100; i++) {
			if(i !=0 && i % 8 == 0) {
				size++;
			}   //8의 배수일때마다 1씩 증가시키니까 총 8의 갯수가 나온다.
		}
		
		int[] numbers = new int[size];
		// 8의 배수의 객수만큼의 배열을 하나 만들었다. 
		
		for(int i = 0, j =0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) {
				numbers[j] = i;  //numbers배열에 처음에 j는0 . 즉 0번째에 8이들어왔고 1번째에 16이 들어왔다.
				j++;
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		 
		
	}

}
