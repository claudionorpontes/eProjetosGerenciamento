package code.springboot.model;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.processing.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final GenerationType GeneratedTypeReference = null;
	
	@Id
	@GeneratedValue(strategy=GeneratedTypeReference.new Runnable() {
	public void run() {
			
		}
	
	private Long id;
	private String nome;
	private String sobrenome;

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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	
	}
	
		
	}

}
