package com.example.atividade_3_tdd;

public class FuncionarioTerceirizado extends Funcionario {
    
    private double despesaAdicional;

    public FuncionarioTerceirizado(
        String nome, int horasTrabalhadas, double valorHora, double despesaAdicional
        ) {
        super(nome, horasTrabalhadas, valorHora);

        this.despesaAdicional = validaDespesaAdicional(despesaAdicional);
    }


    public double getDespesaAdicional() {
        return despesaAdicional;
    }



    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = validaDespesaAdicional(despesaAdicional);

    }

    @Override
    public double calculaPagamento() {

        double pagamento = super.calculaPagamento();
        pagamento += 1.10 * despesaAdicional;

            return pagamento;
    }



    
    private double validaDespesaAdicional(double despesaAdicional) {
        if (despesaAdicional > 1000.00) {
            throw new IllegalArgumentException("O valor das despesas adicionais não pode ultrapassar R$ 1000.00.");
        }
        return despesaAdicional;
    }
}
