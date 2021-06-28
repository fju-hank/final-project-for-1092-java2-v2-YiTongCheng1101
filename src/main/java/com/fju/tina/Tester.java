package com.fju.tina;

import java.util.Scanner;

public class Tester {
    public static void main(String[] rags) {
        Mp3[] mp3s = {new Mp3One(), new Mp3Two(), new Mp3Three()};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put in change: ");
        int price = Integer.parseInt(scanner.next());
        System.out.println("Please choose the Exhibition area: ");
        String id = "m1,m2,m3";
    }
}
