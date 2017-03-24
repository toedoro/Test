/**
 * 
 */
package ph.com.montrichard.bisaya.dto;

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
	
	private Date createdDate;

	private String createdBy;


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
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
