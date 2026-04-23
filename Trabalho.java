import java.util.Scanner;
public class Trabalho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in) ;
        System.out.println("Seja bem vindo a JiuSchool!");
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("qual e a sua idade");
        byte idade = entrada.nextByte();
        System.out.println("Qual e o seu peso?");
        float peso = entrada.nextFloat();
        System.out.println("Qual e seu CPF?");
        long cpf = entrada.nextLong();
        System.out.println("Digite seu numero de telefone;");
        long telefone = entrada.nextLong();
        System.out.println("Qual e seu genero?");
        String genero = entrada.next();
        System.out.println("Qual e sua altura?");
        float altura = entrada.nextFloat();
        System.out.println("Qual e seu endereco?");
        entrada.next();
        String endereco = entrada.nextLine();
        System.out.println("Qual e o seu email?");
        String email = entrada.next();
        System.out.println("Digite sua senha:");
        entrada.next();
        String senha = entrada.nextLine();

    }
}