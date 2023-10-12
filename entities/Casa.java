package entities;

public class Casa extends Imovel {

	private boolean quintal;

	public Casa(double area, int quantidadeQuartos, double precoCompra, boolean quintal) {
		super(area, quantidadeQuartos, precoCompra);
		this.quintal = quintal;
	}

	@Override
	public double calculaPreco() {
		double precoVenda = 0;
		try {
			if (getQuantidadeQuartos() > 4 || quintal) {
				precoVenda = getPrecoCompra() * 1.3;
			} else {
				precoVenda = getPrecoCompra() * 1.15;
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
		return precoVenda;
	}

	public boolean isQuintal() {
		return quintal;
	}

	public void setQuintal(boolean quintal) {
		this.quintal = quintal;
	}
}
