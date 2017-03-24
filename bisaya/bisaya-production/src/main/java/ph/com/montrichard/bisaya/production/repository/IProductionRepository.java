/**
 * 
 */
package ph.com.montrichard.bisaya.production.repository;

import java.math.BigInteger;

import org.springframework.stereotype.Repository;

import ph.com.montrichard.bisaya.production.entity.Production;
import ph.com.montrichard.bisaya.repository.IRepository;

/**
 * Mar 19, 2017 10:21:39 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Repository
public interface IProductionRepository extends IRepository<Production, BigInteger>{

}
