
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Limite = 50;
        int quantidade;

        do {
            System.out.println("Quantos carros deseja criar ? (Máximo 50) ");
            quantidade = sc.nextInt();
            sc.nextLine();
            if (quantidade < 1 || quantidade > Limite) {
                System.out.println("Por favor digite um número entre 1 e 50");
            }

        } while (quantidade < 1 || quantidade > Limite);

        Carro[] carros = new Carro[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite os dados do carro " + (i + 1) + ": ");
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();


            int Ano;
            while (true) {
                System.out.print("Ano: ");
                if (sc.hasNextInt()) {
                    Ano = sc.nextInt();
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Ano inválido. Digite um número inteiro.");
                    sc.nextLine();
                }

            }
            carros[i] = new Carro(marca, modelo, Ano);
        }


        System.out.println("Carros criados");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(carros[i]);
        }
        sc.close();
    }
}