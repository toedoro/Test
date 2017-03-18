/**
 * 
 */
package ph.com.montrichard.bisaya.order.entity;

import java.math.BigDecimal;

/**
 * Mar 17, 2017 3:28:11 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public class Product extends BaseEntity implements Comparable<Product>{
	
	private static final long serialVersionUID = 6328467204815182175L;

	private String title;
	
	private String description;
	
	private BigDecimal price;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public Product setTitle(String title) {
		this.title = title;
		return this;
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
	public Product setDescription(String description) {
		this.description = description;
		return this;
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
	public Product setPrice(BigDecimal price) {
		this.price = price;
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Product arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
