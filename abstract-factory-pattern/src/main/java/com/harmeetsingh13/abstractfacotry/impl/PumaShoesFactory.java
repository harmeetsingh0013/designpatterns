/**
 * 
 */
package com.harmeetsingh13.abstractfacotry.impl;

import com.harmeetsingh13.abstractfacotry.ShoesFactory;
import com.harmeetsingh13.entity.Floaters;
import com.harmeetsingh13.entity.PumaFloaters;
import com.harmeetsingh13.entity.PumaSportsShoes;
import com.harmeetsingh13.entity.Shoes;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class PumaShoesFactory implements ShoesFactory{
	
	@Override
	public Shoes getSportsShoes() {
		return new PumaSportsShoes();
	}

	@Override
	public Floaters getFloaters() {
		return new PumaFloaters();
	}

}
