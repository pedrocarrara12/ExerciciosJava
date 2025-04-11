public class PessoaFisica extends Pessoa{
    private int idade;
    private double salario;


    public PessoaFisica(String nome, int idade, double salario) {
        super(nome);
        this.idade=idade;
        this.salario=salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + getNome() +
                "idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
