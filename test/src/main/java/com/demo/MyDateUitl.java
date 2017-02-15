package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017-02-13.
 */
public class MyDateUitl {
    private static SimpleDateFormat dateFormat;

    public static String getDateStr(Date date) {
        return dateFormat.format(date);
    }
}
