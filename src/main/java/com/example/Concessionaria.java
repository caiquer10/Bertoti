package com.example;

import java.util.LinkedList;
import java.util.List;

public class Concessionaria {

    // Listas para armazenar carros e motos
    public List<Carro> carros = new LinkedList<>();
    public List<Moto> motos = new LinkedList<>();

    // Método para cadastrar um carro
    public void cadastrarCarro(String marca, String tipo, int ano, int preco) {
        Carro carro = new Carro(marca, tipo, ano, preco);
        carros.add(carro);
        System.out.println(marca + " " + tipo + " adicionado!");
    }
    
    // Método para cadastrar uma moto
    public boolean cadastrarMoto(String marca, String tipo, int ano, int preco) {
        Moto moto = new Moto(marca, tipo, ano, preco);
        motos.add(moto);
        System.out.println(marca + " " + tipo + " adicionada!");
        return true;
    }

    // Método para buscar um carro pelo nome da marca
    public Carro buscarCarro(String marca) {
        for (Carro carro : carros) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(carro + " encontrado!");
                return carro;
            }
        }
        System.out.println("Carro não encontrado!");
        return null;
    }

    // Método para buscar uma moto pelo nome da marca
    public Moto buscarMoto(String marca) {
        for (Moto moto : motos) {
            if (moto.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(moto + " encontrada!");
                return moto;
            }
        }
        System.out.println("Moto não encontrada!");
        return null;
    }
}