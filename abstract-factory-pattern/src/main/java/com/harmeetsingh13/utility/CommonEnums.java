/**
 * 
 */
package com.harmeetsingh13.utility;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class CommonEnums {

	public enum BRANDS{
		NIKE("NIKE"), PUMA("PUMA");
		
		private String brand;
		private BRANDS(String brand){
			this.brand = brand;
		}
		
		public String getBrand() {
			return brand;
		}
	}
	
}
