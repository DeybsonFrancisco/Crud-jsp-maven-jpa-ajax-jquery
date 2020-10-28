package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name="id_Usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Expose
	private Long id;
	
	@Expose
	private String nome;
	
	@Expose
	private String email;
	
	private String senha;
	
	@Expose
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER)
	private List<Telefone> telefone;
	
	public Usuario() {};

	public Usuario( String nome, String email, String senha, List<Telefone> telefone) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	

	}
	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone="
				+ telefone + "]";
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}


	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
