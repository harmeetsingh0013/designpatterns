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
public class PumaFloaters extends Floaters{

	@Getter @Setter
	private double length;
	@Getter @Setter
	private boolean spring = true;
}
