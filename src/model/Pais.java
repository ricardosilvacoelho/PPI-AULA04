package model;
import java.io.Serializable;

public class Pais implements Serializable {
	private int id;
	private String nome;
	private String populacao;
	private String area;

	public Pais() {
		
	}
	public Pais(int id, String nome, String populacao, String area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPopulacao() {
		return populacao;
	}

	public void setPopulacao(String populacao) {
		this.populacao = populacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (populacao == null) {
			if (other.populacao != null)
				return false;
		} else if (!(populacao == (other.populacao)))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!(area ==(other.area)))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}