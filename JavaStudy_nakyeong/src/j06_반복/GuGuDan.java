package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		//내가 한것
//		for(int dan =2; dan < 10; dan++) {
//			System.out.println(dan+"단");
//			for(int num =1; num < 10; num++) {
//				System.out.println(dan+" X "+num+" = "+(dan*num));
//			};
//			System.out.println();
//		}
		
		for(int dan = 0; dan < 8; dan++) {
			System.out.println((dan+2) + "단");
			for(int i = 0; i < 9; i++) {
				int result = (dan+2) * (i+1);
				System.out.println((dan+2)+" x "+(i+1)+" = "+result);
			}
			System.out.println();
		}
			

		for(int dan = 0 ; dan < 8; dan++) {
			System.out.println((dan + 2) + "단");
			for(int i = 0; i < 9; i++) {
				int result = (dan + 2)*(i + 1);
				System.out.println((dan+2)+" x "+(i+1)+" = "+result);
			}
		}
		
		

	}

}
