package algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class performs a selection sort on the contents of an array
 *
 * @author yaakov
 */
public class SelectionSort {

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
