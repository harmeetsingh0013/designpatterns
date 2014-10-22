/**
 * 
 */
package com.harmeetsingh13.abstractfacotry;

import com.harmeetsingh13.abstractfacotry.impl.NikeShoesFactory;
import com.harmeetsingh13.abstractfacotry.impl.PumaShoesFactory;
import com.harmeetsingh13.entity.Floaters;
import com.harmeetsingh13.entity.Shoes;
import com.harmeetsingh13.utility.CommonEnums;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface ShoesFactory {

	static ShoesFactory createShoesFacotry(String brand){
		if(CommonEnums.BRANDS.NIKE.getBrand().equalsIgnoreCase(brand)){
			return new NikeShoesFactory();
		}else if(CommonEnums.BRANDS.PUMA.getBrand().equalsIgnoreCase(brand)){
			return new PumaShoesFactory();
		}
		return new NikeShoesFactory();
	}
	
	public Shoes getSportsShoes();
	public Floaters getFloaters();
}
