package by.task3.exrecise2.service;

import by.task3.exrecise2.entity.SortingCriterion;
import by.task3.exrecise2.entity.SortingOrder;

public class JuggedArraySortingService {
    
    public void sortViaBubble(int[][] array, SortingOrder order, SortingCriterion criterion) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                int value1 = findValueByCriterion(array[i], criterion);
                int value2 = findValueByCriterion(array[i+1], criterion);
                if(isSwapNeeded(order, value1, value2)){
                    int[] temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    
    public int findValueByCriterion(int[] array, SortingCriterion criterion) {
        int value = 0;    // looks ugly, get back if there's time left / default with any enum value would also be wrong
        switch (criterion) {
            case ROW_SUM:
                value = countColsValue(array);
                break;
            case MAX_ROW_ELEMENT:
                value = findMaxElement(array);
                break;
            case MIN_ROW_ELEMENT:
                value = findMinElement(array);
                break;
        }
        return value;
    }
    
    public boolean isSwapNeeded(SortingOrder order, int a, int b) {        
        boolean isSwapNeeded;       
        isSwapNeeded = ((order == SortingOrder.ASCENDING && a > b)
                       || (order == SortingOrder.DESCENDING && a < b)) ? true : false;
        return isSwapNeeded;
    }
    
    public int countColsValue(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    
    public int findMaxElement(int[] array) {
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            max = (array[i] > max) ? array[i] : max;
            i++;
        }
        return max;
    }
    
    public int findMinElement(int[] array) {
        int min = array[0];
        int i = 1;
        while (i < array.length) {
            min = (array[i] < min) ? array[i] : min;
            i++;
        }
        return min;
    }

}
