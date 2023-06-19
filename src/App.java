
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o regime de pagamento (CLT/Horista/PJ): ");
        String regime = teclado.nextLine();

        double salarioMensal = 0;
        double horasTrabalhadas = 0;
        double valorHora = 0;
        double valorContrato = 0;

        if (regime.equalsIgnoreCase("CLT")) {
            System.out.print("Digite o salario mensal: ");
            salarioMensal = teclado.nextDouble();
        } else if (regime.equalsIgnoreCase("Horista")) {
            System.out.print("Digite o numero de horas trabalhadas: ");
            horasTrabalhadas = teclado.nextDouble();

            System.out.print("Digite o valor da hora de trabalho: ");
            valorHora = teclado.nextDouble();
        } else if (regime.equalsIgnoreCase("PJ")) {
            System.out.print("Digite o valor do contrato: ");
            valorContrato = teclado.nextDouble();
        } else {
            System.out.println("Opçao de regime de pagamento invalida!");
           return;
        }

        double valorReceber = 0;

        if (regime.equalsIgnoreCase("CLT")) {
            valorReceber = salarioMensal;
        } else if (regime.equalsIgnoreCase("Horista")) {
            valorReceber = horasTrabalhadas * valorHora;
        } else if (regime.equalsIgnoreCase("PJ")) {
            valorReceber = valorContrato;
        }

        System.out.println("Nome do professor: " + nome);
        System.out.println("Valor a receber: " + valorReceber);

        teclado.close();
    }
}