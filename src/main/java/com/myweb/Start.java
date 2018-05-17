package com.myweb;

import com.myweb.icris.IcrisApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Start {

    private static final int MAX_THREADS = 100;
    public static final int SLEEP = 5000;
    public static ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREADS);
    private static final int MAXNO = 2000000;

    public static void main(String[] args) throws Exception {

        IcrisApi api = new IcrisApi();
        api.agree();
        api.chinese();
        int cur = 1;
        if (true) {
            cur = api.getMax();
        }
//        executorService.execute(new Thread(() -> {
//            try {
//                boolean flag = api.pachong(10);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }));
        for (int i = cur; i < MAXNO; i++) {
            final int time = i;
            Thread.sleep(SLEEP);
            executorService.execute(new Thread(() -> {
                try {
                   boolean flag = api.pachong(time);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }));
        }
    }
}
