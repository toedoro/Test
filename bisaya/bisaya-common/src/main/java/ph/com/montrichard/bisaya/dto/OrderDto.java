/**
 * 
 */
package ph.com.montrichard.bisaya.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

/**
 * Mar 17, 2017 3:13:14 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public class OrderDto extends BaseEntity implements Comparable<OrderDto>, Serializable{
	
	private static final long serialVersionUID = 7825011483655095465L;

	private BigInteger id;
	
	private String orderNo;
	
	private ProductDto product;
	
	private Integer quantity;
	
	private BigDecimal totalPrice;
	
	private Date productionStartDate;
	
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
	 * @return the product
	 */
	public ProductDto getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ProductDto product) {
		this.product = product;
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
	 * @return the productionStartDate
	 */
	public Date getProductionStartDate() {
		return productionStartDate;
	}

	/**
	 * @param productionStartDate the productionStartDate to set
	 */
	public void setProductionStartDate(Date productionStartDate) {
		this.productionStartDate = productionStartDate;
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
        final OrderDto other = (OrderDto) obj;
        if (!Objects.equals(getId(), other.getId())) {
            return false;
        }
        return true;
    } 
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OrderDto o) {
		return toString().compareTo(o.toString());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDto [id=" + id + ", orderNo=" + orderNo + ", product=" + product + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + ", productionStartDate=" + productionStartDate + ", status=" + status
				+ "]";
	}
	
}
