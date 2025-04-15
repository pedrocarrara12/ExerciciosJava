import java.util.ArrayList;
import java.util.List;

public abstract class Carro<T> {
    private String cor;
    private int ano;
    private String modelo;
    private List<T> listaDeCarros;

    public Carro() {
        this.listaDeCarros = new ArrayList<>();
    }

    public Carro(String cor, int ano, String modelo) {
        this();
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    public void adicionarCarro(T carro) {
        listaDeCarros.add(carro);
    }

    public void imprimir() {
        for (T carro : listaDeCarros) {
            System.out.println(carro.toString());
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public abstract void ligar();

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano;
    }
}
