/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

/**
 *
 * @author NicolasWilliams
 */
public class ObjectiveControl {
    
public double calcVolumeOfPit(double height,double width, double length){

	if (height <= 0) { 
		return -1;
                        }
		
	if (width <= 0) { 
		return -1;
                        }
		
	if (length <= 0) { 
		return -1;
                        }

	double volume = height * width * length;
	return volume;
    
}  
    
}
