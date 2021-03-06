/**
 * 
 */
package ph.com.montrichard.bisaya.order.service;

import java.math.BigInteger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ph.com.montrichard.bisaya.order.entity.Product;
import ph.com.montrichard.bisaya.order.repository.IProductRepository;
import ph.com.montrichard.bisaya.repository.IRepository;
import ph.com.montrichard.bisaya.service.AbstractService;

/**
 * Mar 19, 2017 12:39:12 AM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Service
public class ProductService extends AbstractService<Product, BigInteger> implements IProductService{
	
	@Inject
	private IProductRepository productRepository;
	
	@Override
	protected IRepository<Product, BigInteger> getRepository() {
		return productRepository;
	}

	@Override
	public Product create( Product product ){
		product.setCreatedBy("ADMIN");
		super.create(product);
		return product;
	}

	
}
