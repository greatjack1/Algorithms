/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * This class is a implementation of the quick sort algorithm
 *
 * @author yaakov
 */
public class QuickSort {

    public int[] sort(int[] ArrayToSort) {
        for (int i = 0; i < ArrayToSort.length; i++) {
            int lowestNum = i;
            for (int f = i + 1; f < ArrayToSort.length; f++) {
                if (ArrayToSort[f] < ArrayToSort[lowestNum]) {
                    lowestNum = f;
                }
            }
            //only swap if I is not the lowest
            if (i != lowestNum) {
                int temp = ArrayToSort[i];
                ArrayToSort[i] = ArrayToSort[lowestNum];
                ArrayToSort[lowestNum] = temp;
            }
        }
        return ArrayToSort;

    }
}
