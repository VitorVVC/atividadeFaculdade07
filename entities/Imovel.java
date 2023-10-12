package entities;

public abstract class Imovel {

	private double area;
	private int quantidadeQuartos;
	private double precoCompra;

	public Imovel(double area, int quantidadeQuartos, double precoCompra) {
		this.area = area;
		this.quantidadeQuartos = quantidadeQuartos;
		this.precoCompra = precoCompra;
	}

	public abstract double calculaPreco();

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

}
