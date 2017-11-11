package com.gs.quartz;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Master on 2017/11/10.
 */
public class TimerTest {

    public static void main(String... args) {
        final Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("执行任务！");
//            }
//        }, 1000, 3000);
        Calendar cal = Calendar.getInstance();
        cal.set(2017, 10, 10, 10, 32, 50);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("执行任务！");
            }
        }, cal.getTime(), 5000);

    }
}
