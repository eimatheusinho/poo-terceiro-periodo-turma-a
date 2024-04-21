package primeirobi.atividades.lista6;

public class Gerente extends Cidadao {
    private int salarioBase;
    private double[] salarioRecebido = new double[3];

    public Gerente(String nome, String cidade, String bairro, String rua, String loja, int idade, int salarioBase, double[] salarioRecebido) {
        super(nome, cidade, bairro, rua, loja, idade);
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nLoja: " + this.loja);
    }

    public void calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        double media = soma / salarioRecebido.length;
        System.out.println("Média salarial: " + media);
    }

    public void calcularBonus() {
        double bonus = salarioBase * 0.35;
        System.out.println("Bônus: " + bonus);
    }
}
