package part2;

public class CollectorHarness {

    public static void main(String[] args) {
        long fastest = Long.MAX_VALUE;
        long fastest2 = Long.MAX_VALUE;
        CollectorsExample c = new CollectorsExample();
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            c.partitionPrimes(1_000_000);
            long duration = (System.nanoTime() - start) / 1_000_000;

            long start2 = System.nanoTime();
            c.partitionPrimes2(1_000_000);
            long duration2 = (System.nanoTime() - start2) / 1_000_000;

            if(duration<fastest) fastest = duration;
            if(duration2<fastest2) fastest2 = duration2;
        }
        System.out.println("Fastest execution done in "+fastest+" msecs");
        System.out.println("Fastest execution done in "+fastest2+" msecs");
    }
}
