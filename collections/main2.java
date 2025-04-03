package collections;

import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes e sexo separados por vírgula");

        String entrada = sc.nextLine();

        Map<String, List<String>> grupos = new HashMap<>();
        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());


        String[] pessoas = entrada.split("\\s*,\\s*");

        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toUpperCase();

                if (genero.equals("M")) {
                    grupos.get("Masculino").add(nome);
                } else if (genero.equals("F")) {
                    grupos.get("Feminino").add(nome);
                } else {
                    System.out.println("Formato inválido para: " + pessoa);
                }
            } else {
                System.out.println("Erro no formato da entrada: " + pessoa);
            }
        }


        System.out.println("\nLista de nomes por gênero:");
        for (Map.Entry<String, List<String>> grupo : grupos.entrySet()) {
            System.out.println(grupo.getKey() + ": " + grupo.getValue());
        }
}
    }