package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;

/**
 * This is the main class that can be used to tes all of the algorithm
 * implemenations that we create
 *
 * @author yaakov
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rn = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = rn.nextInt(10000);
        }
        int[] arr2 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr2[i] = rn.nextInt(1000);
        }
        int[] arr3 = new int[10000000];
        for (int i = 0; i < 100000; i++) {
            arr3[i] = rn.nextInt(1000);
        }
        long start = System.currentTimeMillis();
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        long end = System.currentTimeMillis();
        end = (end - start) / 1000;
        System.out.println("Insertion sort took " + end + " seconds to complete");
        start = System.currentTimeMillis();
        SelectionSort ss = new SelectionSort();
        ss.sort(arr2);
        end = System.currentTimeMillis();
        end = (end - start) / 1000;
        System.out.println("Selection sort took " + end + " seconds to complete");
        start = System.currentTimeMillis();
        MergeSort ms = new MergeSort();
        ms.sort(arr3, new int[1000], 0, 999);
        end = System.currentTimeMillis();
        end = (end - start) / 1000;
        System.out.println("Merge sort took " + end + " seconds to complete");
        System.out.println(Arrays.toString(arr3));
    }

}
