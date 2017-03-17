/**
 * 
 */
package ph.com.montrichard.bisaya.order.entity;

import java.math.BigDecimal;

/**
 * Mar 17, 2017 3:13:14 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public class Order extends BaseEntity implements Comparable<Order>{
	
	private static final long serialVersionUID = 1175193853992665462L;

	private String orderNo;
	
	private Product product;
	
	private Integer quantity;
	
	private BigDecimal totalPricate;
	
	private String status;
	
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
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
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
	public BigDecimal getTotalPricate() {
		return totalPricate;
	}

	/**
	 * @param totalPricate the totalPricate to set
	 */
	public void setTotalPricate(BigDecimal totalPricate) {
		this.totalPricate = totalPricate;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
