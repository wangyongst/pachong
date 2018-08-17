package com.myweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pai {
    private List<String> userspai = new ArrayList<String>();
    private List<String> shoupai = new ArrayList<String>();
    private int shoupaitime;
    private int userpaitime;
    private static final List<String> DECK_STR = Arrays.asList(
            "一万", "二万", "三万", "四万", "五万", "六万", "七万", "八万", "九万",
            "一筒", "二筒", "三筒", "四筒", "五筒", "六筒", "七筒", "八筒", "九筒",
            "一条", "二条", "三条", "四条", "五条", "六条", "七条", "八条", "九条",
            "东风", "西风", "南风", "北风", "红中", "白板", "发财"
    );

    public Pai(){
        this.userspai = new ArrayList<String>();
        int time = new Random().nextInt(10000) + 14;
        for (int i = 0; i < time; i++) {
            userspai.add(DECK_STR.get(new Random().nextInt(33) + 1));
        }
        List<String> pai = new ArrayList<String>();
        System.out.println();
    }


    public List<String> getUserspai() {
        return userspai;
    }

    public void setUserspai(List<String> userspai) {
        this.userspai = userspai;
    }

    public List<String> getShoupai() {
        return shoupai;
    }

    public void setShoupai(List<String> shoupai) {
        this.shoupai = shoupai;
    }

    public int getShoupaitime() {
        return shoupaitime;
    }

    public void setShoupaitime(int shoupaitime) {
        this.shoupaitime = shoupaitime;
    }

    public int getUserpaitime() {
        return userpaitime;
    }

    public void setUserpaitime(int userpaitime) {
        this.userpaitime = userpaitime;
    }
}
