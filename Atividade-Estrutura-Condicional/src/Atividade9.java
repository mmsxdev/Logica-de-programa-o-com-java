import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês (1-12):");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        int dias = getDiasDoMes(mes, ano);

        if (dias > 0) {
            System.out.println("O mês " + getNomeDoMes(mes) + " do ano " + ano + " tem " + dias + " dias.");
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }

    // Método para obter o número de dias do mês
    public static int getDiasDoMes(int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return -1; // Mês inválido
        }

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verifica se o ano é bissexto para ajustar fevereiro
        if (ehAnoBissexto(ano)) {
            dias[1] = 29; // Fevereiro tem 29 dias em anos bissextos
        }

        return dias[mes - 1];
    }

    // Método para verificar se um ano é bissexto
    public static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método para obter o nome do mês
    public static String getNomeDoMes(int mes) {
        String[] nomes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return nomes[mes - 1];
    }
}
