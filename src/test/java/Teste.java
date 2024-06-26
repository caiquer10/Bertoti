package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ConcessionariaTest {

    private Concessionaria concessionaria;

    @BeforeEach
    public void setUp() {
        concessionaria = new Concessionaria();
    }

    @Test
    public void testeCadastrarCarro() {
        concessionaria.cadastrarCarro("Toyota", "SUV", 2021, 30000);
        concessionaria.cadastrarCarro("Honda", "Sedan", 2020, 20000);

        List<Carro> carros = concessionaria.carros;
        assertEquals("Honda", carros.get(carros.size() - 1).getMarca());
    }

    @Test
    public void testeCadastrarMoto() {
        concessionaria.cadastrarMoto("Harley Davidson", "Cruiser", 2019, 15000);
        concessionaria.cadastrarMoto("Yamaha", "Sport", 2018, 12000);

        List<Moto> motos = concessionaria.motos;
        assertEquals("Harley Davidson", motos.get(motos.size() - 2).getMarca());
    }

    @Test
    public void testeBuscarCarro() {
        concessionaria.cadastrarCarro("Toyota", "SUV", 2021, 30000);
        concessionaria.cadastrarCarro("Honda", "Sedan", 2020, 20000);

        Carro carro = concessionaria.buscarCarro("Honda");
        assertNotNull(carro);
        assertEquals("Honda", carro.getMarca());
    }

    @Test
    public void testeBuscarMoto() {
        concessionaria.cadastrarMoto("Harley Davidson", "Cruiser", 2019, 15000);
        concessionaria.cadastrarMoto("Yamaha", "Sport", 2018, 12000);

        Moto moto = concessionaria.buscarMoto("Yamaha");
        assertNotNull(moto);
        assertEquals("Yamaha", moto.getMarca());
    }
}