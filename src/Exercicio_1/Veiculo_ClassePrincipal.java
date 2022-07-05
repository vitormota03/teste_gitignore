package Exercicio_1;

import Exercicio_1.Veiculo;

public class Veiculo_ClassePrincipal {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        veiculo.acelerar();
        veiculo.abastecer(90);
        veiculo.freiar();
        veiculo.pintar("rosa");
        veiculo.ligar();
        veiculo.desligar();

    }

}
