package com.example;

public class Carro {
    private String marca;
    private String tipo;
    private int ano;
    private int preco;

    // Construtor
    public Carro(String marca, String tipo, int ano, int preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.ano = ano;
        this.preco = preco;
    }

    // Métodos de acesso para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos de acesso para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos de acesso para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos de acesso para quantidade
    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}