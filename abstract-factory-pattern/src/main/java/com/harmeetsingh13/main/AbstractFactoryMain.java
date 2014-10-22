/**
 * 
 */
package com.harmeetsingh13.main;

import com.harmeetsingh13.abstractfacotry.ShoesFactory;
import com.harmeetsingh13.entity.NikeSportsShoes;
import com.harmeetsingh13.utility.CommonEnums;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class AbstractFactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShoesFactory factory = ShoesFactory.createShoesFacotry(CommonEnums.BRANDS.NIKE.getBrand());
		NikeSportsShoes shoes = (NikeSportsShoes) factory.getSportsShoes();
		shoes.setBrand(CommonEnums.BRANDS.NIKE.getBrand());
		shoes.setName("Running Nike");
		shoes.setPrice(2268);
		shoes.setSize(7);
		shoes.setAirTechnology(true);
		shoes.setSoftSole(false);
		
		System.out.println(shoes);
	}
}
