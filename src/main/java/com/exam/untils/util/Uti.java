package com.exam.untils.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Uti {

    private static final Logger logger = LoggerFactory.getLogger(Uti.class);


    /**
     * @return 返回系统当前时间
     */
    public static String getDateNow() {
        Date nowDate = new Date(System.currentTimeMillis());
        String nowDateString = dateToString(nowDate, "yyyy-MM-dd HH:mm:ss");
        return nowDateString;
    }

    /**
     * 将日期类型转换为指定格式的字符串
     *
     * @param dateValue
     * @param format
     * @return String
     */
    public static String dateToString(Date dateValue, String format) {
        if (dateValue == null || format == null) {
            return null;
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(dateValue);
        }
    }

}
