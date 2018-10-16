package com.myweb;

import com.myweb.icris.IcrisApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Start {

    private static final int MAX_THREADS = 50;
    public static final int SLEEP = 5000;
    public static ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREADS);

    public static void main(String[] args) {
        IcrisApi api = new IcrisApi();
        try {
            api.agree();
            api.chinese();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                int max = api.getMax();
                for (int i = 0; i < max; i++) {
                    final int count = i;
                    Thread.sleep(SLEEP);
                    executorService.execute(new Thread(() -> {
                        try {
                            boolean flag = api.pachong(count);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }));
                    if (i % 3000 == 0) {
                        api.agree();
                        max = api.getMax();
                        final int maxplus = max + 1;
                        executorService.execute(new Thread(() -> {
                            try {
                                boolean flag = api.pachong(maxplus);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
