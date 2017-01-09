package ProjetoTrab.ProjTrab.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="CIDADE_NOME")
	private String cidadeNome;
	@Column(name="CIDADE_POPULATION")
	private Integer cidadePopulacao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCidadeNome() {
		return cidadeNome;
	}
	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}
	public Integer getCidadePopulacao() {
		return cidadePopulacao;
	}
	public void setCidadePopulacao(Integer cidadePopulacao) {
		this.cidadePopulacao = cidadePopulacao;
	}

	
}
