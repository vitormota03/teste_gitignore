package Exercicio_2;
import java.util.Scanner;

public class Jogador {
    
    Scanner ler = new Scanner(System.in);

    int idadeZagueiro = 40;
    int idadeMeioCampo = 38;
    int idadeAtacante = 35;
    int idadeAposentadoria;

    private String nome;
    private String posicao;
    private String dataNascimento;

    private int idade;
    
    /*getters/setters*/

    public int getIdadeZagueiro() {
        return idadeZagueiro;
    }

    public void setIdadeZagueiro(int idadeZagueiro) {
        this.idadeZagueiro = idadeZagueiro;
    }

    public int getIdadeMeioCampo() {
        return idadeMeioCampo;
    }

    public void setIdadeMeioCampo(int idadeMeioCampo) {
        this.idadeMeioCampo = idadeMeioCampo;
    }

    public int getIdadeAtacante() {
        return idadeAtacante;
    }

    public void setIdadeAtacante(int idadeAtacante) {
        this.idadeAtacante = idadeAtacante;
    }

    public int getIdadeAposentadoria() {
        return idadeAposentadoria;
    }

    public void setIdadeAposentadoria(int idadeAposentadoria) {
        this.idadeAposentadoria = idadeAposentadoria;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    /*métodos*/
    public void imprimeNome() {
        System.out.println("Digite um nome: ");
        nome = ler.next();
    }

    public void ImprimePosicao() {
        System.out.println("Digite uma posição: ");
        posicao = ler.next();

    }

    public void imprimeDataNascimento() {
        System.out.println("Digite uma data de nascimento: ");
        dataNascimento = ler.next();

    }

    public void calculaIdade() {
      
        if (posicao.equals("Zagueiro")) {
            idade = idadeZagueiro;

        }

        else if (posicao.equals("Meio-campista")) {
            idade = idadeMeioCampo;

        }

        else if (posicao.equals("Atacante")) {
            idade = idadeAtacante;

        }
        
        else{
            System.out.println("Indeterminado");
        }

        System.out.println("A idade média para " + nome + " se aposentar é " + idade);

    }

    public void CalculaAposentadoria() {

        if (posicao.equals("Zagueiro")) {
            idadeAposentadoria = idadeZagueiro - idade;

        }

        if (posicao.equals("Meio-campista")) {
            idadeAposentadoria = idadeMeioCampo - idade;

        }

        if (posicao.equals("Atacante")) {
            idadeAposentadoria = idadeAtacante - idade;

        }

        System.out.println("Faltam " + idadeAposentadoria + " anos para " + nome + " se aposentar");

    }

}
