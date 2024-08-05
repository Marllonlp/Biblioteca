import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Controller cont = new Controller();
        int opc = 0;
        while (opc != 6) {
            System.out.println("\n----Menu----\n" +
                    "1.Cadastrar livro\n" +
                    "2.Cadastra Usuario\n" +
                    "3.Realizar empretimo\n" +
                    "4.Realizar devolução\n" +
                    "5.Listar todos os emprestimos\n" +
                    "6.Sair");
            opc = ler.nextInt();
            ler.nextLine(); //consumir nova linha

            switch (opc) {
                case 1:
                    cont.addLivro();
                    break;
                case 2:
                    cont.addUsuario();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalia!");
            }
        }
    }
}
