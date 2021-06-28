package com.fju.tina;

import java.util.Scanner;

public class Tester {
    private static int minute;
    private static int price;

    public static void main(String[] rags) {
        System.out.println("請選擇要導覽的展區(m1,m2,m3) : ");
        int coins = 0;
        int[] times = {0, 0, 0};
        int[] time = {20,30,40};
        Mp3One a = new Mp3One();
        Mp3Two b = new Mp3Two();
        Mp3Three c = new Mp3Three();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while (true) {
            if (s.startsWith("m1") || s.startsWith("m2") || s.startsWith("m3") || s.startsWith("0")) {
                if (s.equals("m1")) {
                    coins += a.price;
                    times[0] += 1;
                    System.out.println("累積: $" + coins);
                }
                if (s.equals("m2")) {
                    coins += b.price;
                    times[1] += 1;
                    System.out.println("累積: $" + coins);
                }
                if (s.equals("m3")) {
                    coins += c.price;
                    times[2] += 1;
                    System.out.println("累積: $" + coins);
                }
                if (s.equals("0")) {
                    if (coins == 0) {
                        System.out.println("無須投幣，謝謝!");
                        System.exit(0);
                    } else {
                        System.out.println("總共:" + coins + "元");
                        System.out.println("選了 m1:  " + times[0] + "台，m2: " + times[1] + "台，m3: " + times[2] + "台");
                        System.out.println("m1可以租借: "+ time[0] + "分鐘，m2可以租借: "+ time[1] + "分鐘，m3可以租借: " + time[2] + "分鐘 ");
                        break;
                    }
                }
                System.out.println("還有要租借的嗎? 無，請按0。有 請繼續選擇m1,m2,m3");
                s = scanner.next();
            } else {
                System.out.println("請按m1,m2,m3,0，才能繼續服務喔");
                s = scanner.next();
            }
        }
        System.out.println("請投入紙鈔或硬幣");
        s = scanner.next();
        int money = Integer.parseInt(s);
        int surplus = money - coins;
        if (surplus < 0) {
            System.out.println("餘額不足!! 退還: " + money + "，歡迎下次再光臨!");
            System.exit(0);
        } else {
            System.out.println("退還:");
            if (surplus == 0) {
                System.out.println("0元");
            }
            int[] divisor = {100, 50, 10, 5, 1};
            for (int i = 0; i < 4; i++) {
                if (surplus >= divisor[i]) {
                    System.out.println(surplus / divisor[i] + "個 " + divisor[i] + "元");
                    surplus %= divisor[i];
                }
            }
            System.out.println("謝謝光臨!");
        }

    }
}
