package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

@Entity
@Table(name="telefone")
public class Telefone {
	
	@Id
	@Column(name="id_Telefone")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private Long id;
	
	@Expose
	private int ddd;
	
	@Expose
	private int numero;
	
	@Expose
	private String Tipo;

	@ManyToOne
	@JoinColumn(name= "id_Usuario", referencedColumnName = "id_Usuario" )
	private Usuario usuario;
	
	
//	@Override
//	public String toString() {
//		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", Tipo=" + Tipo + ", usuario=" + usuario
//				+ "]";
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Long getUsuario() {
		return usuario.getId();
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
