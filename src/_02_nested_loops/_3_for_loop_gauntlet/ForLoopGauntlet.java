package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {

//	for(int i = 0; i<101;i++) {
//		System.out.println(i);
//	}
//	
//	
//	for(int i = 100; i>-1;i--) {
//		System.out.println(i);
//	}
//	
//	
//	for(int i = 2;i<101;i++) {
//		if(i%2==0) {
//			System.out.println(i);
//		}
//	}
//	
//	
//	for(int i = 1;i<100;i++) {
//		if(!(i%2==0)) {
//			System.out.println(i);
//		}
//	}
//	
//	
//	for(int i = 1;i<501;i++) {
//		if(i%2==0) {
//			System.out.println(i + " is even");
//		}
//		else {
//			System.out.println(i + " is odd");
//		}
//	}
//	
//	
//	for(int i = 0;i<778;i++) {
//		if(i%7==0) {
//			System.out.println(i);
//		}
//	}
//	
//	
//	for(int i = 2006;i<2022;i++) {
//		System.out.println("In "+ i + ", I was " + (i-2006) + " years old.");
//	}
//	
//	
//	for(int i = 0;i<3;i++) {
//		for(int j = 0; j<3; j++) {
//			System.out.println(i + " " + j);
//		}
//	}
//	
//	
//	
//	

		for (int j = 0; j < 7; j+=3) {

			for (int i = 1; i < 4; i++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		
		for(int j = 0; j<91;j+=10) {
		for(int i = 1; i<11;i++) {
			System.out.print(i+j + ", ");
		}
		System.out.println();
		}

		System.out.println();
		
		for(int i = 1; i<7;i++) {
			for(int j = 1; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i<101;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		

	}
}
