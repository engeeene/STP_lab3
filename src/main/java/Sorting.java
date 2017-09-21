
public class Sorting {
    public static void start(int num, int n, int[] arr){
        long time = System.nanoTime();
        for (int i = 0; i<n; i++) {
            switch(num) {
                case 1:
                    time = System.nanoTime();
                    BubbleSort.sort(arr);
                    System.out.format("%10d nano seconds for Bubble Sort%n", (System.nanoTime() - time));
                    break;
                case 2:
                    time = System.nanoTime();
                    CombSort.sort(arr);
                    System.out.format("%10d nano seconds for Comb Sort%n", (System.nanoTime() - time));
                    break;
                case 3:
                    time = System.nanoTime();
                    QuickSort.sort(arr);
                    System.out.format("%10d nano seconds for Quick Sort%n", (System.nanoTime() - time));
                    break;
                case 4:
                    time = System.nanoTime();
                    ShellSort.sort(arr);
                    System.out.format("%10d nano seconds for Shell Sort%n", (System.nanoTime() - time));
                    break;
                case 5:
                    time = System.nanoTime();
                    HeapSort.sort(arr);
                    System.out.format("%10d nano seconds for Heap Sort%n", (System.nanoTime() - time));
                    break;
            }
        }
        System.out.println();
    }

}
