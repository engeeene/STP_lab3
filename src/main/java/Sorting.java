import java.util.Arrays;

public class Sorting {
    public static void start(int num, int n, int[] arr){
        Metrics metrics = new Metrics();
        for (int i = 0; i<n; i++) {
            switch(num) {
                case 1:
                    metrics.start();
                    BubbleSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Bubble Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 2:
                    metrics.start();
                    CombSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Comb Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 3:
                    metrics.start();
                    QuickSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Quick Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 4:
                    metrics.start();
                    ShellSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Shell Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 5:
                    metrics.start();
                    HeapSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Heap Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 6:
                    metrics.start();
                    Arrays.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Arrays.Sort()%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 7:
                    metrics.start();
                    Arrays.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Arrays.Sort()%n", metrics.getTime(), metrics.getMemory());
                    break;
            }
        }
        System.out.println();
    }

}
