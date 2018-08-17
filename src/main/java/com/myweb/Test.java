package com.myweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Test {

    public void checkPaixing1() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("一万", "八万", "一万", "六万", "六万", "一万", "七万", "四万", "五万", "二万", "三万", "六万", "六万", "七万");
            //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            //3.初始化对象
            CheckHu checkHu = new CheckHu(integerList);
            //4.调用方法开始判断
            boolean result = checkHu.isHu();
            //5.输出结果，是胡牌=true
            if (result) {
                if (checkHu.isQiDuiZi.getAsBoolean()) System.out.println("isQiDuiZi");
                else if (checkHu.isShiSanYao.getAsBoolean()) System.out.println("isShiSanYao");
                else if (checkHu.isQingYiSe.getAsBoolean()) System.out.println("isQingYiSe");
                else System.out.println("zhengchange");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void checkPaixing2() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("一万", "八万", "一万", "八万", "六筒", "六筒", "五筒", "五筒", "红中", "红中", "五条", "五条", "六条", "六条");
            //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            //3.初始化对象
            CheckHu checkHu = new CheckHu(integerList);
            //4.调用方法开始判断
            boolean result = checkHu.isHu();
            //5.输出结果，是胡牌=true
            if (result) {
                if (checkHu.isQiDuiZi.getAsBoolean()) System.out.println("isQiDuiZi");
                else if (checkHu.isShiSanYao.getAsBoolean()) System.out.println("isShiSanYao");
                else if (checkHu.isQingYiSe.getAsBoolean()) System.out.println("isQingYiSe");
                else System.out.println("zhengchange");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void checkPaixing3() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("一万", "九万", "一筒", "九筒", "一条", "九条", "东风", "西风", "南风", "北风", "红中", "白板", "发财");
            //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            //3.初始化对象
            CheckHu checkHu = new CheckHu(integerList);
            //4.调用方法开始判断
            boolean result = checkHu.isHu();
            //5.输出结果，是胡牌=true
            if (result) {
                if (checkHu.isQiDuiZi.getAsBoolean()) System.out.println("isQiDuiZi");
                else if (checkHu.isShiSanYao.getAsBoolean()) System.out.println("isShiSanYao");
                else if (checkHu.isQingYiSe.getAsBoolean()) System.out.println("isQingYiSe");
                else System.out.println("zhengchange");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void checkPaixing4() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("一万", "八万", "一万", "六万", "六万", "一万", "七万", "四万", "五万", "二万", "三万", "六万", "六万", "七万");
            //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            //3.初始化对象
            CheckHu checkHu = new CheckHu(integerList);
            //4.调用方法开始判断
            boolean result = checkHu.isHu();
            //5.输出结果，是胡牌=true
            if (result) {
                if (checkHu.isQiDuiZi.getAsBoolean()) System.out.println("isQiDuiZi");
                else if (checkHu.isShiSanYao.getAsBoolean()) System.out.println("isShiSanYao");
                else if (checkHu.isQingYiSe.getAsBoolean()) System.out.println("isQingYiSe");
                else System.out.println("zhengchange");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void checkPaixing5() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("一万", "一万", "一万", "一万", "二万", "三万", "六万", "六万", "七万", "八万", "六万", "六万", "七万", "八万");
            //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            //3.初始化对象
            CheckHu checkHu = new CheckHu(integerList);
            //4.调用方法开始判断
            boolean result = checkHu.isHu();
            //5.输出结果，是胡牌=true
            if (result) {
                if (checkHu.isQiDuiZi.getAsBoolean()) System.out.println("isQiDuiZi");
                if (checkHu.isShiSanYao.getAsBoolean()) System.out.println("isShiSanYao");
                if (checkHu.is3n2.getAsBoolean() && checkHu.isQingYiSe.getAsBoolean()) System.out.println("isQingYiSe");
                if (checkHu.is3n2.getAsBoolean() && !checkHu.isQingYiSe.getAsBoolean()) System.out.println("Qita");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void checkDemo2() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("五万",
                    "二筒",
                    "一条",
                    "二筒",
                    "三条",
                    "三万",
                    "二条",
                    "七万",
                    "六条",
                    "六条",
                    "二万",
                    "六万",
                    "二筒",
                    "四万");
            //2.创建起到的牌
            String checkDeck = "四万";
            //3.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            Integer checkDeckNO = Deck.getDeckByNO(checkDeck);
            //4.初始化对象，待测牌组，起到的牌
            CheckHu checkHu = new CheckHu(integerList, checkDeckNO);
            //5.调用方法开始判断
            boolean result = checkHu.isHu();
            //6.输出结果，是胡牌=true
            System.out.println(result);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void findDemo1() {
        try {
            //1.创建待测牌组，可以不按顺序
            List<String> stringList = Arrays.asList("一万", "一万", "六万", "六万", "七万", "一万", "东风", "五万", "六万", "三万", "四万", "六万", "八万");
            //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
            List<Integer> integerList = Deck.toDeckNO(stringList);
            //3.创建对象
            FindHu findHu = new FindHu(integerList);
            //4.调用方法开始寻找
            List<Integer> result = findHu.findHu();
            //5.转换为字符串牌组，如果不存在会抛出异常IndexOutOfBoundsException
            List<String> out = Deck.toDeckStr(result);
            //6.输出结果
            out.forEach(str -> System.out.print(str + "\t"));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void paixu() {
        //1.创建待测牌组，可以不按顺序
        List<String> stringList = Arrays.asList("五万",
                "二筒",
                "一条",
                "二筒",
                "三条",
                "三万",
                "二条",
                "七万",
                "六条",
                "六条",
                "二万",
                "六万",
                "二筒",
                "四万");
        //2.将牌组编号化，如果不存在会抛出异常IndexOutOfBoundsException
        List<Integer> integerList = Deck.toDeckNO(stringList);
        //3.排序
        Collections.sort(integerList);
        //4.转换为字符串牌组，如果不存在会抛出异常IndexOutOfBoundsException
        List<String> out = Deck.toDeckStr(integerList);
        //6.输出结果
        out.forEach(str -> System.out.print(str + "\t"));
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.checkDemo2();
//        test.checkPaixing1();
//        test.checkPaixing2();
//        test.checkPaixing3();
//        test.checkPaixing4();
        test.checkPaixing5();
        test.paixu();
        //    test.findDemo1();
//        test.findDemo2();
    }
}
