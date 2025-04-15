import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

               Carro carro = new Civic("white",2020,"novo");


                carro.adicionarCarro(new Corolla("WHITE", 2023, "ANTIGO"));

                carro.imprimir();


                carro.ligar();
            }
        }


