package by.task3.exrecise2.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import by.task3.exrecise2.entity.SortingCriterion;
import by.task3.exrecise2.entity.SortingOrder;

public class JuggedArraySortingServiceTest {
    
    private JuggedArraySortingService service = new JuggedArraySortingService();

    @Test
    public void sortViaBubbleTest() {

        int[][] actual = new int[][] {{1,2,3}, {6,3,0,9}, {6,1}}; 
        service.sortViaBubble(actual, SortingOrder.ASCENDING, SortingCriterion.MIN_ROW_ELEMENT);
        int[][] expected = new int[][] {{6,3,0,9}, {1,2,3}, {6,1}};
        assertEquals(actual, expected);
        
    }
}
