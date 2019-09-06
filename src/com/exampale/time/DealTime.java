package com.exampale.time;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/9/5 14:15
 */
public class DealTime {
    public static void main(String[] args) {
        testMonth();
        testTime();
    }

    public static void testMonth() {
        List<String> res = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        for (int i = 1; i <= 7; i++) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            c.add(Calendar.DAY_OF_MONTH, -1);
            String format1 = format.format(c.getTime());
            res.add(format1);
        }
        System.out.println(res.toString());
    }

    private static void testTime() {
        List<String> res = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        for (int i = 7; i >0; i--) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
            c.add(Calendar.HOUR_OF_DAY,-1);
            System.out.println(format.format(c.getTime())+":00:00");
        }
    }
}
