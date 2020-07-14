package enumeracoes3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {
	
	private static SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

	
	private String nome;
	private String email;
	private Date DataNasc;
	
	public Clientes() {
	}
	
	public Clientes(String nome, String email, Date dataNasc) {
		this.nome = nome;
		this.email = email;
		DataNasc = dataNasc;
	}
	
	public Clientes(String nome, String email) {
		this.nome = nome;
		this.email = email;
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

	public Date getDataNasc() {
		return DataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		DataNasc = dataNasc;
	}

	
	
	@Override
	public String toString() {
		return "Cliente: " + nome + " ("+ data.format(DataNasc) +")" + " - " + email;
	}
	
	
	
	
	
	
}
