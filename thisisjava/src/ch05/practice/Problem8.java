package ch05.practice;

public class Problem8 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
	};
		int sum = 0;
		int total = 0;
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				sum = sum + array[i][j];
				total++;
			}
		}
		double avg = (double)sum/total;
		System.out.println("Total Sum : "+sum);
		System.out.println("AVG : " + avg);
}
}
