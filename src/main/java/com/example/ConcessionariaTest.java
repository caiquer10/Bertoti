package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConcessionariaTest {
    private Concessionaria concessionaria;

    @BeforeEach
    public void setUp() {
        concessionaria = new Concessionaria();
    }

    @Test
    public void testeCadastrarCarro() {
        concessionaria.cadastrarCarro("Toyota", "SUV", 2021, 30000);
        assertEquals(1, concessionaria.carros.size());
        assertEquals("Toyota", concessionaria.carros.get(0).getMarca());
    }

    @Test
    public void testeCadastrarMoto() {
        boolean resultado = concessionaria.cadastrarMoto("Yamaha", "Sport", 2018, 12000);
        assertTrue(resultado);
        assertEquals(1, concessionaria.motos.size());
        assertEquals("Yamaha", concessionaria.motos.get(0).getMarca());
    }

    @Test
    public void testeBuscarCarro() {
        concessionaria.cadastrarCarro("Toyota", "SUV", 2021, 30000);
        Carro carro = concessionaria.buscarCarro("Toyota");
        assertNotNull(carro);
        assertEquals("Toyota", carro.getMarca());
    }

    @Test
    public void testeBuscarMoto() {
        concessionaria.cadastrarMoto("Harley Davidson", "Cruiser", 2019, 15000);
        Moto moto = concessionaria.buscarMoto("Harley Davidson");
        assertNotNull(moto);
        assertEquals("Harley Davidson", moto.getMarca());
    }
}