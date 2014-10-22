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
public class Shoes {

	@Getter @Setter
	private String name;
	@Getter @Setter
	private int size;
	@Getter @Setter
	private double price;
	@Getter @Setter
	private String brand;
}
