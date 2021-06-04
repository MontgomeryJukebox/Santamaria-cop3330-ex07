/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static final float FT_TO_M = 0.09290304F;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the room in feet?");
        int length = in.nextInt();
        System.out.print("What is the width of the room in feet?");
        int width = in.nextInt();
        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.println("The area is");
        float area_ft = length * width;
        float area_m = area_ft * FT_TO_M;
        System.out.printf("%d square feet\n", area_ft);
        System.out.printf("%f square meters\n", area_m);
    }
}