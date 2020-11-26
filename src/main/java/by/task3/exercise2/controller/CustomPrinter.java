package by.task3.exercise2.controller;

public class CustomPrinter {
    
    public void printArray(int[][] array) {
        for(int[] row : array) {
            for(int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }

}
