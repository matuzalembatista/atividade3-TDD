package com.example.atividade_3_tdd;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest  {
    
    @Test
    public void testConstrutorValido() {
        Funcionario funcionario = new Funcionario("Matuzalem", 40, 100);
        assertEquals("Matuzalem", funcionario.getNome());

        assertEquals(40, funcionario.getHorasTrabalhadas());

        assertEquals(100, funcionario.getValorHora());

    }


    @Test
    public void testConstrutorHorasInvalidas() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Matuzalem", 41, 100);
        });
    }



    @Test
    public void testConstrutorValorHoraInvalido() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Matuzalem", 40, 50);
        });
    }



    @Test
    public void testSetHorasTrabalhadasValido() {
        Funcionario funcionario = new Funcionario("Matuzalem", 30, 100);
        funcionario.setHorasTrabalhadas(35);

        assertEquals(35, funcionario.getHorasTrabalhadas());
    }


    @Test
    public void testSetHorasTrabalhadasInvalido() {
        Funcionario funcionario = new Funcionario("Matuzalem", 30, 100);

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setHorasTrabalhadas(45);
        });
    }



    @Test
    public void testSetValorHoraValido() {
        Funcionario funcionario = new Funcionario("Matuzalem", 30, 100);
        funcionario.setValorHora(120);

        assertEquals(120, funcionario.getValorHora());
    }


    @Test
    public void testSetValorHoraInvalido() {
        Funcionario funcionario = new Funcionario("Matuzalem", 30, 100);
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setValorHora(50);
        });
    }




    @Test
    public void testCalculaPagamentoMinimo() {
        Funcionario funcionario = new Funcionario("Matuzalem", 10, 100);
        
        assertEquals(1320.00, funcionario.calculaPagamento());
    }


    @Test
    public void testCalculaPagamentoAcimaMinimo() {
        Funcionario funcionario = new Funcionario("Matuzalem", 40, 100);
            assertEquals(4000.00, funcionario.calculaPagamento());
    }
}