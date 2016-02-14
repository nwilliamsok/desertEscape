/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NicolasWilliams
 */
public class ObjectiveControlTest {
    
    public ObjectiveControlTest() {
    }
    
    /**
     * Test of calcVolumeOfPit method, of class ObjectiveControl.
     */
    @Test
    public void testCalcVolumeOfPit() {
        
        System.out.println("calcVolumeOfPit");
       
        //Test Case 1
        
        System.out.println("\tTest case #1");
       
        double height = 5.0;
        double width = 10.0;
        double length = 7.0;
        
        ObjectiveControl instance = new ObjectiveControl();
        
        double expResult = 350.0;
        double result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
          //Test Case 2
        
        System.out.println("\tTest case #2");
       
        height = 5.0;
        width = 4.0;
        length = -2.0;

        
        expResult = -1.0;
        result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
           //Test Case 3
        
        System.out.println("\tTest case #3");
       
        height = 5.0;
        width = -1.0;
        length = 2.0;

        
        expResult = -1.0;
        result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
           //Test Case 4
        
        System.out.println("\tTest case #4");
       
        height = 2.0;
        width = 5.0;
        length = -3.0;

        
        expResult = -1.0;
        result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
           //Test Case 5
        
        System.out.println("\tTest case #5");
       
        height = 0.0;
        width = 2.0;
        length = 1.0;

        
        expResult = -1.0;
        result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
           //Test Case 6
        
        System.out.println("\tTest case #6");
       
        height = 100.0;
        width = 142.0;
        length = 0.0;

        
        expResult = -1.0;
        result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
           //Test Case 7
        
        System.out.println("\tTest case #7");
       
        height = 50.0;
        width = 0.0;
        length = 70.0;

        
        expResult = -1.0;
        result = instance.calcVolumeOfPit(height, width, length);
        
        assertEquals(expResult, result, 0.0001);
        
        
    }

    /**
     * Test of calcWindChill method, of class ObjectiveControl.
     */
    
    @Test
    public void testCalcWindChill() {
        System.out.println("calcWindChill");
        
        //Test Case 1
        
        System.out.println("\tTest case #1");
        double temp = 70.0;
        double velocity = 2.0;
        ObjectiveControl instance = new ObjectiveControl();
        double expResult = 73.0;
        double result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.5);
        
        //Test Case 2
        
        System.out.println("\tTest case #2");
        temp = 65.0;
        velocity = -2.0;

        expResult = -1.0;
        result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.5);
        
        //Test Case 3
        
        System.out.println("\tTest case #3");
        temp = -1.0;
        velocity = 80.0;

        expResult = -38.0;
        result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.5);
        
        //Test Case 4
        
        System.out.println("\tTest case #4");
        temp = 2.0;
        velocity = 0.0;

        expResult = -1.0;
        result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.5);
        
        //Test Case 5
        
        System.out.println("\tTest case #5");
        temp = 0.0;
        velocity = 150.0;

        expResult = -44.0;
        result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 5
        
        System.out.println("\tTest case #6");
        temp = -1000.0;
        velocity = 1500.0;

        expResult = -2079.0;
        result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 5
        
        System.out.println("\tTest case #7");
        temp = 45.0;
        velocity = 1;

        expResult = 47.0;
        result = instance.calcWindChill(temp, velocity);
        assertEquals(expResult, result, 0.0);
    }
    
}
