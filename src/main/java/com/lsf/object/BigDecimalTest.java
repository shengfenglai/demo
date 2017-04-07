package com.lsf.object;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

public class BigDecimalTest {

    public static void main(String[] args) {
        System.out.println(convertData(new BigDecimal(0.001011)));

    }

    public static String convertData(final BigDecimal bigDecimal) {

        if (bigDecimal == null) {
            return StringUtils.EMPTY;
        }
        BigDecimal convertData = bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP);// 保留小数点后四位，四舍五入

        String convertDataStr = convertData.toString();

        final int pos = convertDataStr.indexOf('.');// 小数点
        String tail = convertDataStr.substring(pos + 1);// 尾巴，小数点后的字符串
        String head = convertDataStr.substring(0, pos);// 头，小数点前的字符串
        tail = StringUtils.stripEnd(tail, "0");// 去掉后面多余的0

        return StringUtils.isEmpty(tail) ? head : String.format("%s.%s", head, tail);

    }

}
