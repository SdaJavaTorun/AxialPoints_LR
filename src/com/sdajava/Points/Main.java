package com.sdajava.Points;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void writeMatrix() {

        System.out.println("Wpisz dane");
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length -1; j++) {

                System.out.println("Wpisz element: wiersz: "
                        + i + ", kolumna: " + j);
                Scanner in = new Scanner(System.in);
                matrix[i][j] = in.nextInt();
                matrix[i][2] = 1;

             }
        }

        System.out.println("Liczymy delte!!!");
        int delta ;

        delta = matrix[0][0] * matrix[1][1]  +
                matrix[1][0] * matrix[2][1]  +
                matrix[2][0] * matrix[0][1]  -
                matrix[2][0] * matrix[1][1] -
                matrix[1][0] * matrix[0][1]  -
                matrix[2][1] * matrix[0][0];

        System.out.println("Delta to: " + delta);

        if(delta > 0){
            System.out.println("Ponad");
        }else if(delta < 0){
            System.out.println("Poniżej");
        }else{
            System.out.println("Na");
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.writeMatrix();

    }
}
