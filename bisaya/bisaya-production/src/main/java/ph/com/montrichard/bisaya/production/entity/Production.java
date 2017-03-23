package ph.com.montrichard.bisaya.production.entity;

import java.math.BigInteger;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="productions")
public class Production extends BaseEntity implements Comparable<Production>{
	
	@Id
    @Column(name = "id", unique = true)
    @TableGenerator(initialValue = 1,
            name = "productions_id_generator", pkColumnName = "table_name",
            pkColumnValue = "productions", table = "id_generator", valueColumnName = "id")
    @GeneratedValue(generator = "productions_id_generator", strategy = GenerationType.TABLE)
    private BigInteger id;
	
	private String orderId;
	
	private String status;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

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
        final Production other = (Production) obj;
        if (!Objects.equals(getId(), other.getId())) {
            return false;
        }
        return true;
    } 
	
	@Override
	public int compareTo(Production o) {
		return toString().compareTo(o.toString());
	}

	@Override
	public String toString() {
		return "Production [id=" + id + ", orderId=" + orderId + ", status=" + status + "]";
	}
	
	
}
