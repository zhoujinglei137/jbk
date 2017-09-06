package com.jbk.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by 刘铭 on 2017/9/6 0006.
 * 时间类工具类
 */
public class DateUtil {



    /**
     * 获得当前时间 days天后的时间
     * @param days
     * @return
     */
    public static Date getNowAfterDay(Date date,int days){
        return  getDate(date,days);
    }

    private static Date getDate(Date date,int days){
        Calendar time = Calendar.getInstance();
        time.setTime(date);
        time.add(Calendar.DAY_OF_YEAR,days);
        return time.getTime();
    }


}
