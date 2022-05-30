package j06_반복;

public class Star {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.println("*.........");
			}
		}
		
		
		System.out.println();
		
		
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(5-j>i+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}

		
		
		System.out.println();
		
		
		
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j++) {
				if(5-j>i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	

		System.out.println();
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(5-j>5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(5-j > i+1) {
					System.out.print(" ");
				}else if(j>3) {
					System.out.print("*");
				}else {
					System.out.print("**");
				}
				}System.out.println();
			}
		}
		
		
		
		
	}


/*
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *     
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 
 * 위 4가지 만들 수 있는거 숙제!
 * 
 * 
 * 
 * 
 * */

