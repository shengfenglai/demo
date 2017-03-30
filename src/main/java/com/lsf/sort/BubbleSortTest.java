package com.lsf.sort;

public class BubbleSortTest {

    public static void main(String[] args) {
        int[] array = { 1, 4, 9, 6, 8, 5, 7, 0, 3, 2 };
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        int row = array.length;

        for (int i = 0; i < row; i++) {// 假设这个是数组中的第一个数
            for (int j = i + 1; j < row; j++) {// 假设这个是数组中的第二个数
                if (array[i] < array[j]) {
                    int tmp = 0;
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println("此时较大的数是：" + array[i]);
        }
    }

}
