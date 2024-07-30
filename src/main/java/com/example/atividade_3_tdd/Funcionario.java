package com.example.atividade_3_tdd;

public class Funcionario {
    
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
        this.valorHora = validaValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validaValorHora(valorHora);
    }

    public double calculaPagamento() {
        double pagamento = horasTrabalhadas * valorHora;
        if (pagamento < 1320.00) {
            pagamento = 1320.00;
        }
        return pagamento;
    }

    private int validaHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40) {
            throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
        }
        return horasTrabalhadas;
    }

    private double validaValorHora(double valorHora) {
        double salarioMinimo = 1320.00;
        if (valorHora < 0.04 * salarioMinimo || valorHora > 0.10 * salarioMinimo) {
            throw new IllegalArgumentException("O valor por hora deve ser entre 4% e 10% do salário mínimo.");
        }
        return valorHora;
    }
}