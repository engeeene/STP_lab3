
public class Main {
    public static void main(String[] args) {
        Metrics metrics = new Metrics();
        metrics.start();
        Metrics arrayMetrics = new Metrics();
        arrayMetrics.start();
        Array array = new Array();
        arrayMetrics.stop();
        Sorting.start(1,3, array.getArray());
        Sorting.start(2,3, array.getArray());
        Sorting.start(3,3, array.getArray());
        Sorting.start(4,3, array.getArray());
        Sorting.start(5,3, array.getArray());
        Sorting.start(6,3, array.getArray());
        //Array array2 = new Array(9999999);
        metrics.stop();
        System.out.format("%10d nano seconds and %10d bytes for main%n", metrics.getTime(), metrics.getMemory());
        System.out.format("%38d memory used by array%n", arrayMetrics.getMemory());
        System.out.format("%38d memory in the start%n", metrics.getMemoryStart());
        System.out.format("%38d memory at the end%n", metrics.getMemoryEnd());
    }
}
