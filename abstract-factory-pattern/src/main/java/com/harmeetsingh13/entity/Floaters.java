/**
 * 
 */
package com.harmeetsingh13.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@ToString
public abstract class Floaters {
	
	@Getter @Setter
	private int size;
	@Getter @Setter
	private String color;
	@Getter @Setter
	private String brand;
	@Getter @Setter
	private double price;
}
