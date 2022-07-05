package Exercicio_1;

import java.util.Scanner;

public class Veiculo {

    Scanner ler = new Scanner(System.in);

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;

    private boolean isLigado;

    private int litrosCombustivel;
    private int velocidade;

    private double preco;

    /*getters/setters*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isIsLigado() {
        return isLigado;
    }

    public void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /*métodos*/
    public void acelerar() {
        velocidade += 100;
        System.out.println("\nVelocidade: " + velocidade + " Km/h");
    }

    public int abastecer(int qtd) {

        /*System.out.println("\nAdicione uma quantidade de combustível (limite de 60 litros):");
        System.out.print("qtd: ");
        qtd = ler.nextInt();
         */
        if (qtd <= 60) {
            litrosCombustivel = qtd;
            System.out.println("\n" + qtd + " litros adicionados!");
        } else {
            System.out.println("\nQuantidade limite de combustível ultrapassada!");
        }

        return litrosCombustivel;

    }

    public void freiar() {

        if (velocidade > 0 && velocidade >= 20) {
            velocidade -= 20;

            System.out.println("\nVelocidade após freio: " + velocidade + " Km/h");

        } else {
            System.out.println("\nCarro parado ou em velocidade menor que 20!");
        }

    }

    public String pintar(String cor) {
        /*
        System.out.println("\nInforme uma cor qualquer: ");
        System.out.print("cor: ");
        String corInformada = ler.next();
        cor = corInformada;
         */
        System.out.println("\n" + cor + " definido(a) como cor");

        return cor;
    }

    public void ligar() {

        if (isLigado == false) {
            isLigado = true;
            System.out.println("\nO carro está dando partida (" + isLigado + ")");

        }

    }

    public void desligar() {

        if (isLigado == true && velocidade <= 0) {
            isLigado = false;
            System.out.println("\nO carro está desligando (" + isLigado + ")");

        } else {
            System.out.println("\nCarro acima de 0km/h\nComando negado!");
        }

    }

}
