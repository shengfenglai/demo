package com.lsf.string;

/**
 * Created by shengfeng on 2016/12/16.
 */
public enum WeekEnumTest {
                          MONDAY(1),
                          TUESDAY(2),
                          WEDNESDAY(3),
                          THURSDAY(4),
                          FRIDAY(5),
                          SATURDAY(6),
                          SUNDAY(7);

    private int key;

    private WeekEnumTest(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public static void main(String[] args) {
        System.out.println(WeekEnumTest.FRIDAY.getKey());
    }
}
