/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * This class demonstrates the basic insertion sort algorithm
 *
 * @author yaakov
 */
public class InsertionSort {

    public int[] sort(int[] ArrayToSort) {
        for (int i = 0; i < ArrayToSort.length - 1; i++) {
            for (int f = i + 1; f > 0 && ArrayToSort[f - 1] > ArrayToSort[f]; f--) {
                int temp = ArrayToSort[f - 1];
                ArrayToSort[f - 1] = ArrayToSort[f];
                ArrayToSort[f] = temp;
            }
        }
        return ArrayToSort;

    }
}
