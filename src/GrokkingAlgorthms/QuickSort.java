package GrokkingAlgorthms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(9, 0, -2, 89, 1, 2, 3, -3, -99, 6);
        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(arrayList);
        System.out.println(quickSort.quicksort(arrayList));
        ///////////////////////////////////////////////////////////////////////////
//        quicksort(array, 0, array.length);
//        System.out.println(Arrays.toString(array));
//        List<Integer> array = new ArrayList<>();
    }

    private List<Integer> quicksort(List<Integer> array) {

        if (array.size() <= 1) {
            return array;
        }
        
        int middle = (int) Math.ceil((double) array.size() / 2);
        int pivot = array.get(middle);
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) <= pivot) {
                if (i == middle) continue;
                less.add(array.get(i));
            } else {
                greater.add(array.get(i));
            }
        }

        return concatenate(quicksort(less), pivot, quicksort(greater));
    }

    private List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }

        list.add(pivot);

        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }

        return list;
    }


//    /**
//     * Реализуем алгоритм быстрой сортировки
//     *
//     * @param array      Массив, в котором нужно упорядочить элементы.
//     * @param startIndex Начальный индекс в массиве (включая).
//     * @param endIndex   Конечный индекс в массиве (не включая)
//     */
//    public static void quicksort(int[] array, int startIndex, int endIndex) {
//        int pivotValue = getPivot(array, startIndex, endIndex);
//        int currentStartIndex = startIndex;
//        int currentEndIndex = endIndex - 1;
//
//        while (currentStartIndex < currentEndIndex) {
//            while (array[currentStartIndex] < pivotValue)
//                currentStartIndex++;
//            while (array[currentEndIndex] > pivotValue)
//                currentEndIndex--;
//            if (currentStartIndex < currentEndIndex) {
//                int buffer = array[currentStartIndex];
//                array[currentStartIndex] = array[currentEndIndex];
//                array[currentEndIndex] = buffer;
//            }
//        }
//        if (currentStartIndex > startIndex)
//            quicksort(array, startIndex, currentStartIndex);
//        if (endIndex > currentStartIndex + 1)
//            quicksort(array, currentStartIndex + 1, endIndex);
//    }
//
//    /**
//     * @param array
//     * @param startIndex
//     * @param endIndex
//     * @return Значение опорного элемента. В этой реализации опорный элемент -
//     * это последний элемент в массиве.
//     */
//    public static int getPivot(int[] array, int startIndex, int endIndex) {
//        return array[endIndex - 1];
//    }
}
