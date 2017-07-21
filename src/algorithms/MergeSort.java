/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * This class implements the merge sort algorithm
 *
 * @author yaakov
 */
public class MergeSort {

    /**
     * This method is an abstract in place merge sort
     *
     * @param toSort
     * @param aux
     * @param lo
     * @param mid
     * @param hi
     */
    public void merge(int[] toSort, int[] aux, int lo, int mid, int hi) {
        //copy the array to the auxxilary array
        for (int k = lo; k <= hi; k++) {
            aux[k] = toSort[k];
        }
        //now merge
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            //if left half exausted take from right
            if (i > mid) {
                toSort[k] = aux[j++];
            } //if right half exausted take from left
            else if (j > hi) {
                toSort[k] = aux[i++];
            } //if the number on the right is less then the left then take from the right
            else if (aux[j] < aux[i]) {
                toSort[k] = aux[j++];
            } //if the number on the left is less the right take from the left
            else {
                toSort[k] = aux[i++];
            }
        }
    }

    public void sort(int[] toSort, int[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(toSort, aux, lo, mid);
        sort(toSort, aux, mid + 1, hi);
        merge(toSort, aux, lo, mid, hi);
    }
}
