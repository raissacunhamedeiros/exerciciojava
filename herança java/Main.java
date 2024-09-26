import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Professor professor = new Professor();
        aluno aluno= new aluno();
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.printf("Digite a opção que você gostaria de efetuar: %n"+
                    "[1] - Cadastrar Aluno %n" +
                    "[2] - Cadastrar Professor%n");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setNome(sc.nextLine());
                    System.out.println("Digite o CPF: ");
                    aluno.setCpf(sc.nextLine());
                    System.out.println("Digite o RG: ");
                    aluno.setRg(sc.nextLine());
                    System.out.println("Digite o telefone: ");
                    aluno.setFone(sc.nextLine());
                    System.out.println("Digite a Idade: ");
                    aluno.setIdade(sc.nextInt());
                    System.out.println("Digite a primeira nota do aluno: ");
                    aluno.setNota_1(teclado.nextDouble());
                    System.out.println("Digite a segunda nota do aluno: ");
                    aluno.setNota_2(teclado.nextDouble());
                    System.out.println("" + "\n CADASTRO ALUNO: %n+" +
                            "\n nome: "+ aluno.getNome()+
                            "\n CPF: " + aluno.getCpf() +
                            "\n RG: " + aluno.getRg()+
                            "\n Telefone: " + aluno.getFone()+
                            "\n Nota 01: " + aluno.getNota_1()+
                            "\n Nota 02: " + aluno.getNota_2()+
                            "\n Média: " + aluno.getMedia()+
                            "\n Situação: " + aluno.getSituacao());
                    break;
                case 2:
                    System.out.println("Digite o nome do Professor: ");
                    professor.setNome(sc.nextLine());
                    System.out.println("Digite o CPF: ");
                    professor.setCpf(sc.nextLine());
                    System.out.println("Digite o RG: ");
                    professor.setRg(sc.nextLine());
                    System.out.println("Digite o telefone: ");
                    professor.setFone(sc.nextLine());
                    System.out.println("Digite a Idade: ");
                    professor.setIdade(sc.nextInt());
                    System.out.println("Digite o valor do salario: ");
                    professor.setSalario(teclado.nextDouble());
                    System.out.println("Digite a segunda nota do aluno: ");
                    aluno.setNota_2(teclado.nextDouble());
                    System.out.println("" + "\n CADASTRO ALUNO: %n+" +
                            "\n nome: "+ aluno.getNome()+
                            "\n CPF: " + aluno.getCpf() +
                            "\n RG: " + aluno.getRg()+
                            "\n Telefone: " + aluno.getFone()+
                            "\n Nota 01: " + aluno.getNota_1()+
                            "\n Nota 02: " + aluno.getNota_2()+
                            "\n Média: " + aluno.getMedia()+
                            "\n Situação: " + aluno.getSituacao());
                    break;
                case 3:
                    System.out.println("Digite o nome do coordenador: ");
                    String nomeCoordenador= sc.nextLine();

                    Coordenador coordenador = new Coordenador(nomeCoordenador);
                default:
                    System.out.println("Opa! Opção inválida!");

            }
            System.out.println("Deseja fazer outra operação: [S]");
            r=sc.next();
        } while(r.equalsIgnoreCase("S"));


    }
}


