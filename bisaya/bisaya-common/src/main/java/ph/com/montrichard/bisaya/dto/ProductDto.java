/**
 * 
 */
package ph.com.montrichard.bisaya.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Mar 17, 2017 3:28:11 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public class ProductDto extends BaseEntity implements Comparable<ProductDto>{
	
	private static final long serialVersionUID = 1L;

	private BigInteger id;
	
	private String title;
	
	private String description;
	
	private BigDecimal price;
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ProductDto arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
