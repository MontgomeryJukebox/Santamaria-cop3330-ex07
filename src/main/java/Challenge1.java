/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */

import java.util.Scanner;

public class Challenge1 {
    public static final double FT_TO_M = 0.09290304;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Feet or meters?");
        String type = in.next().toLowerCase();
        double factor = 1;
        if (type.equals("meters")) {
            factor = FT_TO_M;
        }
        System.out.print("What is the length of the room?");
        int w = in.nextInt();
        System.out.print("What is the width of the room?");
        int l = in.nextInt();
        System.out.printf("The area is %d square %s\n", (int) (w * l * factor), type);
    }
}