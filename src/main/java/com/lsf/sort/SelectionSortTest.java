package com.lsf.sort;

public class SelectionSortTest {

    public static void main(String[] args) {
        int[] array = { 1, 4, 9, 6, 8, 5, 7, 0, 3, 2 };
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        
        int  row= array.length;

        for (int i = 0; i < row; i++) {

            int max = i;//这里假设当前第一个元素就是最大的

            //这个for循环会直接把最大元素的数组下标找出来
            for (int j = i + 1; j < row; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }

            int tmp = 0;
            tmp = array[max];
            array[max] = array[i];
            array[i] = tmp;

        }
        
       
        for (int i = 0; i < row; i++) {
            System.out.println("选择排序之后，数组里面的元素由大到小依次是：" + array[i]);
        }
    }

}
