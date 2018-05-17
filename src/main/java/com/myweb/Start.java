package com.myweb;

import com.myweb.icris.IcrisApi;

public class Start {
    public static void main(String[] args) throws Exception {
        IcrisApi api = new IcrisApi();
        api.agree();
        api.chinese();
        for (int i = 1; i < 10000; i++) {
            final int time = i;
            Thread.sleep(100);
            new Thread(() -> {
                try {
                    api.pachong(time);
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        Thread.sleep(1000000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
