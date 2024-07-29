//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        /*Usuario user = new Usuario("MArlon", 18, 'm', "393939");
//        user.setNome("Marlon");
//        user.setIdade(19);
//        user.setSexo('M');
//        user.setTelefone("000000");
//
//        Livros li = new Livros();
//        li.setTitulo("Titulo");
//        li.setAutores("autora");
//        li.setArea("area");
//        li.setEditora("editora");
//        li.setAno(2024);
//        li.setEdicao("limitada");
//        li.setNumFolhas(30);
//
//        Emprestimo empre = new Emprestimo();
//        empre.setLivros(li);
//        empre.setUsuario(user);
//        empre.setDataEmprstimo("10/10/2000");
//        empre.setHoraEmprestimo("10:20");
//        System.out.println(empre.getLivros().getTitulo());
//        System.out.println(empre.getUsuario().getNome());
//        System.out.println(empre.getDataEmprstimo());
//        System.out.println();
//
//        empre.emprestarLivro();
//        empre.getLivros().abrirLivro();
//        empre.getUsuario().lerLivro();
//        empre.getLivros().fecharLivro();
//        empre.devolverLivro();
//*/
//        Scanner ler = new Scanner(System.in);
//        int opc = 0;
//        while (opc != 6) {
//            System.out.println("\n----Menu----\n" +
//                    "1.Cadastrar livro\n" +
//                    "2.Cadastra Usuario\n" +
//                    "3.Realizar empretimo\n" +
//                    "4.Realizar devolução\n" +
//                    "5.Listar todos os emprestimos\n" +
//                    "6.Sair");
//            opc = ler.nextInt();
//            ler.nextLine(); //consumir nova linha
//
//            switch (opc) {
//                case 1:
//                    Livros lv = new Livros();
//                    System.out.println("Informe o titulo do livro: ");
//                    lv.setTitulo(ler.nextLine());
//                    System.out.println("Informe a autor(a) do livro: ");
//                    lv.setAutores(ler.nextLine());
//                    System.out.println("Informe a area do livro: ");
//                    lv.setArea(ler.nextLine());
//                    System.out.println("Informe o editor(a) do livro: ");
//                    lv.setTitulo(ler.nextLine());
//                    System.out.println("Informe o ano do livro: ");
//                    lv.setAno(ler.nextInt());
//                    System.out.println("Informe a edição do livro: ");
//                    lv.setAno(ler.nextInt());
//                    System.out.println("Informe o ano do livro: ");
//                    lv.setEdicao(ler.nextLine());
//                    System.out.println("Informe o numero de folhas do livro: ");
//                    lv.setNumFolhas(ler.nextInt());
//                    break;
//
//                case 2:
//                    Usuario us = new Usuario();
//                    System.out.println("Informe seu Nome:");
//                    us.setNome(ler.nextLine());
//                    System.out.println("Infome seu Telefone:");
//                    us.setTelefone(ler.nextLine());
//                    System.out.println("Informe sua Idade:");
//                    us.setIdade(ler.nextInt());
//                    System.out.println("Informe o sexo:");
//                    us.setSexo(ler.next().charAt(0));
//                    break;
//                case 3:
//                    Emprestimo empre = new Emprestimo();
//                    System.out.println("---Realizar emprestimo---");
//                    System.out.println("Data do emprestimo: ");
//                    empre.setDataEprestimo(ler.nextLine());
//                    System.out.println("Hora do emprestimo: ");
//                    empre.setHoraEmprestimo(ler.nextLine());
//                    break;
//
//                case 4:
//
//
//                    break;
//                case 5:
//
//                    break;
//                case 6:
//                    System.out.println("Saindo...");
//                    break;
//                default:
//                    System.out.println("Opção invalia!");
//
//            }
//        }
//    }
//}