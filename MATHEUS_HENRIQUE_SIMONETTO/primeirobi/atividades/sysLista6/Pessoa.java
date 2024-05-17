package primeirobi.atividades.sysLista6;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
