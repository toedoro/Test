/**
 * 
 */
package ph.com.montrichard.bisaya.order.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import ph.com.montrichard.bisaya.order.entity.Product;

/**
 * Mar 19, 2017 12:39:12 AM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Service
public class ProductService {
	
	Set<Product> products = new HashSet<Product>(){{
		add( new Product()
				.setTitle("Ball Pen")
				.setDescription("BALLPEN")
				.setPrice( new BigDecimal("100.00")) );
		
		add( new Product()
				.setTitle("Laptop")
				.setDescription("LAPTOP")
				.setPrice( new BigDecimal("1000.00")) );
	}};
	
	public Collection<Product> read( Integer offSet, Integer limit ){
		return products;
	}
	
}
