public class Corolla extends Carro<Corolla> {

    public Corolla(String cor, int ano, String modelo) {
        super(cor, ano, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando um Corolla!");
    }
}
