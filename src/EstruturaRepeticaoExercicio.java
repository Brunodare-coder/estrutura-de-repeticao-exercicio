import java.util.Scanner;

public class EstruturaRepeticaoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = sc.next();


        System.out.print("Digite um número positivo: ");
        int numeroPositivo = sc.nextInt();


        // Crescente
        System.out.println("Crescente:");
        for (int n = 0; n <= numeroPositivo; n++) {
            System.out.println(n);

        }
        //Decrescente
        System.out.println("Decrescente:");
        for (int n = numeroPositivo; n >= 0; n--) {
            System.out.println(n);

        }
        // Verifica tamanho do nome
        if (nomeUsuario.length() > 6) {
            for (int i = 0; i < numeroPositivo; i++) {
                System.out.println(nomeUsuario);
            }
        }else {
            System.out.println(nomeUsuario);
        }


    }



}
