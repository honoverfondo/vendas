package mz.gov.misau.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cupDesconto")
@SequenceGenerator(name = "seq_cup_desc", sequenceName = "seq_cup_desc", allocationSize = 1, initialValue = 1)
public class CupDesconto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_cup_desc")
	private Long id;
	
	private String cod_Desc;
	
	private double meticalDesconto;
	
	private double valorPrecentagenDesconto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCod_Desc() {
		return cod_Desc;
	}

	public void setCod_Desc(String cod_Desc) {
		this.cod_Desc = cod_Desc;
	}

	public double getMeticalDesconto() {
		return meticalDesconto;
	}

	public void setMeticalDesconto(double meticalDesconto) {
		this.meticalDesconto = meticalDesconto;
	}

	public double getValorPrecentagenDesconto() {
		return valorPrecentagenDesconto;
	}

	public void setValorPrecentagenDesconto(double valorPrecentagenDesconto) {
		this.valorPrecentagenDesconto = valorPrecentagenDesconto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CupDesconto other = (CupDesconto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
