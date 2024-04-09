package ch05.sec07;

public class MultidimensionalArrayByBalueListExample {
	public static void main(String args[]) {
	int[][] scores = {
			{80, 90, 96},
			{76, 88}
	};
	System.out.println("1차원 배열 길이(반의 수) : " + scores.length);
	System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + scores.length);
	System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores.length);
	
	int class1Sum = 0;
	for(int i=0; i<scores[0].length; i++) {
		class1Sum += scores[0][i];
	}
	System.out.println("class 1 Sum : "+ class1Sum);
	
	int class2Sum = 0;
	for(int i=0; i<scores[1].length; i++) {
		class1Sum += scores[1][i];
	}
	System.out.println("class 2 Sum : "+ class2Sum);
	
	int totalStudent = 0;
	int totalSum = 0;
	for(int i=0; i<scores.length;i++) {
		totalStudent += scores[i].length;
	}
	
}
}
