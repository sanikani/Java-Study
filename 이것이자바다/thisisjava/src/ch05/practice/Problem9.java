package ch05.practice;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.StudentNum | 2.Input Score | 3. Score List | 4. Analysis | 5. Exit");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Select>");
			int select = scanner.nextInt();
			if(select == 1) {
				System.out.println("StudentNum>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}
			else if(select == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]",i);
					scores[i] = scanner.nextInt();
				}
			}
			else if(select == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]: %d\n",i,scores[i]);
					
			}
			}
			else if(select == 4) {
				int max = 0;
				int sum = 0;
				for(int i =0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					sum = sum + scores[i];
				}
				double avg = (double)sum/scores.length;
				System.out.println("High Score : " + max);
				System.out.println("AVG : "+ avg);
			}

				
			
			else if(select == 5) {
				System.out.println("Exit");
				break;
			}
		}
		

	}

}
