package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 * 
		 * result = 
		 * 
		 * 년도가 4의 배수이면 True 아니면 False 
		 * 
		 * 
		 * */
		
		
//		int year = 1999;
//		boolean result = year % 4 == 0;
//		System.out.println(result);
//		
//		
		
		

		/*
		 * 
		 * 윤년이면 true 아니면 false
		 * 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수일때 
		 * 
		 * 2000 / 1999
		 * 
		 */
		 
//		int year = 1999;
//		int year2 = 2000;
//		boolean result = (year % 4 == 0) && (year % 100 == 0 ) || (year % 400 == 0);
//		boolean result2 = (year2 % 4 == 0) && (year2 % 100 == 0 ) || (year2 % 400 == 0);
//		
//		System.out.println(result);
//		System.out.println(result2);
//		\
		int year = 2000;
		boolean result = (year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0);
		System.out.println();
		
		
		
		
//		int year = 1999;
//		boolean result = (year%4 ==0 && year%100 != 0) || (year%400 == 0);
//		System.out.println(result);
////				
//		
//		int year = 2000;
//		boolean result1 = year % 4 == 0;
//		boolean result2 = year % 100 != 0;
//		boolean result3 = year % 400 == 0;
//		boolean result4 = result1 && result2 || result3;
//		
//		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//		
//		System.out.println(result4);
//		
//		
    }

}
