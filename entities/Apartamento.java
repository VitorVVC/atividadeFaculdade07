package entities;

public class Apartamento extends Imovel {
	// Criando variavel Boolean para armazenar se tem ou não piscina
	private boolean piscina;
	// Construtor
	public Apartamento(double area, int quantidadeQuartos, double precoCompra, boolean piscina) {
		super(area, quantidadeQuartos, precoCompra);
		this.piscina = piscina;
	}

	// Método para sobrescrever oque foi escrito no IMOVEL
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
	// Get & Sets
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

}
