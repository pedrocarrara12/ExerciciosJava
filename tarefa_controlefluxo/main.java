import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        for (int i = 1; i <=4; i++) {
            System.out.println("Digite a nota : ");
            double nota = sc.nextDouble();
            notas.add(nota);

        }
        double total=0;
        for (double nota : notas)
            total+=nota;

        double media= total/4;

        if (media >= 7) {
            System.out.println("Aprovado!! Média de : " + media);
        } else if (media>=5) {
            System.out.println("Recuperação , média de :  " + media);
            
        } else {
            System.out.println("Reprovado");
        }
    }

}
