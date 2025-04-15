public class Civic extends Carro<Civic> {

    public Civic(String cor, int ano, String modelo) {
        super(cor, ano, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando um Civic!");
    }
}
