/**
 * 
 */
package ph.com.montrichard.bisaya.order.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Mar 17, 2017 3:13:59 PM
 * 
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 2534062868934532654L;
	
	private BigInteger id;
	
	private Date createdDate;

	private BigInteger createdBy;

	private Date lastModifiedDate;

	private BigInteger lastModifiedBy;
	
	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}
	

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdBy
	 */
	public BigInteger getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the lastModifiedDate
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * @param lastModifiedDate the lastModifiedDate to set
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * @return the lastModifiedBy
	 */
	public BigInteger getLastModifiedBy() {
		return lastModifiedBy;
	}

	/**
	 * @param lastModifiedBy the lastModifiedBy to set
	 */
	public void setLastModifiedBy(BigInteger lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
}
