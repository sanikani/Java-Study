package ch12.practice08;

public class Time {

	public static void main(String[] args) {
		long nanoTime1 = System.nanoTime();
		int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double avg = (double) sum / scores.length;
        System.out.println(avg);
        long nanoTime2 = System.nanoTime();
        System.out.println(nanoTime2-nanoTime1+" ns");
		

	}

}
