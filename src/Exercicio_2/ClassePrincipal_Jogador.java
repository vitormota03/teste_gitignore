package Exercicio_2;

import Exercicio_2.Jogador;

public class ClassePrincipal_Jogador {

    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        
        jogador.imprimeNome();
        jogador.ImprimePosicao();
        jogador.imprimeDataNascimento();
        jogador.calculaIdade();
        jogador.CalculaAposentadoria();

    }

}
