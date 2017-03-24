/**
 * 
 */
package ph.com.montrichard.bisaya.order.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Mar 17, 2017 3:28:11 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Entity
@Table(name="products")
public class Product extends BaseEntity implements Comparable<Product>{
	
	private static final long serialVersionUID = 6328467204815182175L;
	
	@Id
    @Column(name = "id", unique = true)
    @TableGenerator(initialValue = 1,
            name = "products_id_generator", pkColumnName = "table_name",
            pkColumnValue = "products", table = "id_generator", valueColumnName = "id")
    @GeneratedValue(generator = "products_id_generator", strategy = GenerationType.TABLE)
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
	public int compareTo(Product p) {
		return toString().compareTo(p.toString());
	}
	
}
