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
        while(true) {
            final int time = api.getMax();
            Thread.sleep(SLEEP);
            executorService.execute(new Thread(() -> {
                try {
                   boolean flag = api.pachong(time + 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }));
            if( time % 3000 == 0) api.agree();
        }
    }
}
