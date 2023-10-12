package entities;

public abstract class Imovel {
    // Criando variaveis que existem em um imovel ABSTRACT
    private double area;
    private int quantidadeQuartos;
    private double precoCompra;

    // Criando Construtor
    public Imovel(double area, int quantidadeQuartos, double precoCompra) {
        this.area = area;
        this.quantidadeQuartos = quantidadeQuartos;
        this.precoCompra = precoCompra;
    }

    // Criando método OBRIGATÓRIO de calcular o preco do imovel
    public abstract double calculaPreco();

    // Gets & Setters
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
