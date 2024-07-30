package com.example.atividade_3_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTerceirizadoTest {
    

    @Test
    public void testConstrutorValido() {
        FuncionarioTerceirizado funcionarioTerce = new FuncionarioTerceirizado("Matuzalem", 40, 100, 500);
        assertEquals("Matuzalem", funcionarioTerce.getNome());
        assertEquals(40, funcionarioTerce.getHorasTrabalhadas());
        assertEquals(100, funcionarioTerce.getValorHora());
            assertEquals(500, funcionarioTerce.getDespesaAdicional());
    }

    
    @Test
    public void testConstrutorDespesaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            new FuncionarioTerceirizado("Matuzalem", 40, 100, 1500);

        });
    }


    @Test
    public void testSetDespesaAdicionalValido() {
        FuncionarioTerceirizado funcionarioTerce = new FuncionarioTerceirizado("Matuzalem", 30, 100, 500);
        funcionarioTerce.setDespesaAdicional(700);

        assertEquals(700, funcionarioTerce.getDespesaAdicional());
    }



    @Test
    public void testSetDespesaAdicionalInvalido() {
        FuncionarioTerceirizado funcionarioTerce = new FuncionarioTerceirizado("Matuzalem", 30, 100, 500);
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioTerce.setDespesaAdicional(1200);

        });
      
    }


    @Test
    public void testCalculaPagamentoBonus() {
        FuncionarioTerceirizado funcionarioTerce = new FuncionarioTerceirizado("Matuzalem", 40, 100, 500);
        assertEquals(4000 + 1.10 * 500, funcionarioTerce.calculaPagamento());
    }
}