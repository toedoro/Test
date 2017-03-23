package ph.com.montrichard.bisaya.order.repository;

import java.math.BigInteger;

import org.springframework.stereotype.Repository;

import ph.com.montrichard.bisaya.order.entity.Product;
import ph.com.montrichard.bisaya.repository.IRepository;

@Repository
public interface IProductRepository extends IRepository<Product, BigInteger>{

}
