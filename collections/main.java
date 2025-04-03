package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");

        String names = sc.nextLine();


        String[] nomes = names.split("\\s*,\\s*");

        List<String> nomesList = new ArrayList<>();
        for (String nome : nomes) {
            if (!nome.isEmpty()) {
                nomesList.add(nome);
            }
        }


        Collections.sort(nomesList);
        System.out.println("Lista de nomes:");
        for (String nome : nomesList) {
            System.out.println(nome);
        }


        }




    }

