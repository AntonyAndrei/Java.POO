package enumeracoes2;

import java.util.Date;

public class Contrato {
	
	private Date data;
	private Double valorPorHora;
	private int horas;
	
	public Contrato(Date data, Double valorPorHora, int horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	
	public Contrato() {
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorPorHora * horas;
	}

}
