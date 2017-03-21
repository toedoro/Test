/**
 * 
 */
package ph.com.montrichard.bisaya.order.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Mar 17, 2017 3:13:14 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Entity
@Table(name="orders")
public class Orders extends BaseEntity implements Comparable<Orders>{
	
	private static final long serialVersionUID = 1175193853992665462L;
	
	@Id
    @Column(name = "id", unique = true)
    @TableGenerator(initialValue = 1,
            name = "orders_id_generator", pkColumnName = "table_name",
            pkColumnValue = "orders", table = "id_generator", valueColumnName = "id")
    @GeneratedValue(generator = "orders_id_generator", strategy = GenerationType.TABLE)
    private BigInteger id;
	
	private String orderNo;
	
	@JoinTable(name = "orders_products")
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Products> products;
	
	private Integer quantity;
	
	private BigDecimal totalPrice;
	
	private String status;
	
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
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the products
	 */
	public Set<Products> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the totalPricate
	 */
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPricate the totalPricate to set
	 */
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orders other = (Orders) obj;
        if (!Objects.equals(getId(), other.getId())) {
            return false;
        }
        return true;
    } 
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Orders o) {
		return toString().compareTo(o.toString());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", product=" + products + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + ", status=" + status + ", id=" + id + "]";
	}
	
	
	
}
