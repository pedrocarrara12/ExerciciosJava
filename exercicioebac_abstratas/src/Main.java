public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Pedro",20,2600);
        System.out.println(pessoaFisica.getIdade());
        System.out.println(pessoaFisica.getSalario());
        System.out.println(pessoaFisica);


        PessoaJuridica pessoaJuridica = new PessoaJuridica("LOJA","43434343.000");

        System.out.println(pessoaJuridica.getCnpj());
    }
}