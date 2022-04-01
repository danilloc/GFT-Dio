import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String descricao = scanner.nextLine();

        Hardware memoria = new Memoria();
        Hardware discoRigido = new DiscoRigido();
        Hardware cpu = new Cpu();

        System.out.println(memoria.getDetalhesHardware());
        System.out.println(discoRigido.getDetalhesHardware());
        System.out.println(cpu.getDetalhesHardware());
    }
}
