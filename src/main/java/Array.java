import java.util.Random;

public class Array {
    private int length = 150;
    private int[] arr = new int[length];
    private Random rand = new Random();

    public Array() {
        for (int i=0; i < length; i++) {
            arr[i] = rand.nextInt();
        }
    }

    public int getLength() {
        return length;
    }

    public int[] getArray() {
        return arr.clone();
    }

    public static void print(int[] arr){
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
