package enumeracoes2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

	private String nome;
	private LevelTrabalhador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}


	public Trabalhador(String nome, LevelTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LevelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(LevelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void addContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double Ganhos(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for (Contrato c : contratos) {
			calendario.setTime(c.getData());
			int c_ano =  calendario.get(Calendar.YEAR);
			int c_mes = calendario.get(Calendar.MONTH) + 1;
			if (ano == c_ano && mes == c_mes) {
			soma += c.valorTotal();
			}
		}

		return soma;
	}
	

	
	
}
