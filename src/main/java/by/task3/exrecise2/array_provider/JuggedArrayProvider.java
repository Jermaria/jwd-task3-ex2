package by.task3.exrecise2.array_provider;

import java.util.Random;

public class JuggedArrayProvider {
    
    private Random random = new Random();
    
    public int[][] provideJuggedArray(int rowNum) {     
        int[][] juggedArray = new int[rowNum][];
        
        int i = 0;
        while (i < rowNum) {
            int colsNum = random.nextInt(5)+1;
            juggedArray[i] = new int[colsNum];
            i++;
        }        
        return juggedArray;
    }
    
    public void initArray(int[][] array) {      
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
    }
    
    

}
