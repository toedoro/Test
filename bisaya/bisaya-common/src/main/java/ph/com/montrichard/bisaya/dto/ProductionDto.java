/**
 * 
 */
package ph.com.montrichard.bisaya.dto;

import java.util.Date;

/**
 * Mar 17, 2017 3:14:15 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public class ProductionDto extends BaseEntity implements Comparable<ProductionDto>{
	
	private OrderDto order;
	
	private Date startDate;
	
	private Integer quantity;
	
	private String status;
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ProductionDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
