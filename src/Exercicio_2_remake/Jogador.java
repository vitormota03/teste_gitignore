package Exercicio_2_remake;

import java.util.Scanner;

import java.util.Calendar;

public class Jogador {

    Scanner ler = new Scanner(System.in);

    private String nome;
    private String posicao;
    private String dataNascimento;
    private int idade;
    private int aposenta;

    /*getters/setters*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /*métodos*/
    public void mostraDados() {
        System.out.println("Digite os seguintes dados do jogador: ");
        System.out.print("\nNOME: ");
        nome = ler.next();

        System.out.print("POSIÇÃO: ");
        posicao = ler.next();

        System.out.print("DATA DE NASCIMENTO: ");
        dataNascimento = ler.next();

        System.out.println("\n\n|Dados do jogador|"
                + "\nNome: " + this.nome + " \nPosição: " + posicao + " \nData de Nascimento: " + dataNascimento);

    }

    public int calculaIdade() {
        Calendar calendar = Calendar.getInstance();

        idade = Integer.parseInt(dataNascimento.substring(dataNascimento.length() - 4));

        System.out.println("Idade: ");

        return calendar.get(Calendar.YEAR) - idade;

    }

    public int calculaAposentadoria() {

        if (posicao.endsWith("zagueiro")) {
            aposenta = 40 - idade;

        }

        return aposenta;
    }

}
