package entities;

public class Apartamento extends Imovel {

	private boolean piscina;

	public Apartamento(double area, int quantidadeQuartos, double precoCompra, boolean piscina) {
		super(area, quantidadeQuartos, precoCompra);
		this.piscina = piscina;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	@Override
	public double calculaPreco() {
		double precoVenda = 0;
		try {
			if (getArea() > 300.00 && piscina) {
				precoVenda = getPrecoCompra() * 1.50;
			} else {
				precoVenda = getPrecoCompra() * 1.1;
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
		return precoVenda;
	}

}
