package com.week_03;

import java.util.Scanner;

/**
 * Написать морской бой(1 корабль). Размер поля указывает пользователь. При промахе показывать подсказку.
 */
public class Solution_03_13 {

    public static void main(String[] args) {
        System.out.print("Set the size of field: ");
        Scanner scanner = new Scanner(System.in);

        int fieldSize = scanner.nextInt();

        //Make new matrix
        int[][] fieldMatrix = new int[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++){
            for (int j = 0; j < fieldSize; j++){
                fieldMatrix[i][j] = 0;
            }
        }

        //Create new ship
        int size = (int)(1 + Math.random() * 4); // ship size
        int tmpSize = size;
        int orient = (int)(1 + Math.random() * 2); // 1 - horizontal; 2 - vertical
        int startX = (int)(Math.random() * fieldMatrix.length); // start X
        int startY = (int)(Math.random() * fieldMatrix.length); // start Y

        if (orient == 1){
            while (tmpSize > 0 && startY < fieldMatrix[0].length){
                fieldMatrix[startX][startY] = 1;
                startY++;
                tmpSize--;
            }
            startY--;
        }

        if (orient == 2){
            while (tmpSize > 0 && startX < fieldMatrix.length){
                fieldMatrix[startX][startY] = 1;
                startX++;
                tmpSize--;
            }
        }

        size -= tmpSize;

        MatrixUtils.printMatrix(fieldMatrix);

        //Shouting ship
        int shoutX;
        int shoutY;
        loop: while (true){
            System.out.println("Make your shout (X, Y): ");
            shoutX = scanner.nextInt() - 1;
            shoutY = scanner.nextInt() - 1;

            switch (fieldMatrix[shoutY][shoutX]){
                case 1: size--;
                        if (size > 0)
                            System.out.println("Ranil");
                        else {
                            System.out.println("Potopil");
                            break loop;
                        }
                        break;

                case 0: System.out.println("Mimo");
                        break;

                case 3:
                    System.out.println("Already shouted");
                    break;

            }

            fieldMatrix[shoutY][shoutX] = 3; //flag if the char is allready shouted
        }
    }
}
