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
@ToString(callSuper=true)
public class PumaSportsShoes extends Shoes{

	@Getter @Setter
	private boolean airCrossing = true;
	@Getter @Setter
	private boolean lightSole = true;
}
