package mz.gov.misau.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Pessoa{


	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String bi;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	public String getBi() {
		return bi;
	}

	public void setBi(String bi) {
		this.bi = bi;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
}
