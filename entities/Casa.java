package entities;

public class Casa extends Imovel {
	// Criando variavel Boolean para TER ou NÃO um quintal
	private boolean quintal;
	// Construtor
	public Casa(double area, int quantidadeQuartos, double precoCompra, boolean quintal) {
		super(area, quantidadeQuartos, precoCompra);
		this.quintal = quintal;
	}
	// Sobrescrever o método de IMOVEL que é um método obrigatório por classes herdadas do mesmo
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
	// Gets & Setters
	public boolean isQuintal() {
		return quintal;
	}

	public void setQuintal(boolean quintal) {
		this.quintal = quintal;
	}
}
