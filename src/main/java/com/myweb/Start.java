package com.myweb;

import com.myweb.icris.IcrisApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Start {

    private static final int MAX_THREADS = 50;
    public static final int SLEEP = 2000;
    public static ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREADS);
    private static final int MAXNO = 2000000;

    public static void main(String[] args) throws Exception {
        IcrisApi api = new IcrisApi();
        api.agree();
        api.chinese();
        for (int i = api.getMax(); i < MAXNO; i++) {
            final int time = i;
            Thread.sleep(SLEEP);
            executorService.execute(new Thread(() -> {
                try {
                   boolean flag = api.pachong(time);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }));
            if( i % 3000 == 0) api.agree();
        }
    }
}
