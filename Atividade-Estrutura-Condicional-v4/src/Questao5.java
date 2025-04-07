import java.util.Scanner;

public class Questao5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de dados
            System.out.print("Digite a idade do paciente: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso do paciente (em kg): ");
            double peso = scanner.nextDouble();

            // Variáveis para a dosagem e gotas
            double dosagemMg = 0;
            int gotasPorDose = 0;

            // Verificar se é adulto ou adolescente (12 anos ou mais)
            if (idade >= 12) {
                if (peso >= 60) {
                    dosagemMg = 1000;  // 1000 mg para adultos com peso igual ou superior a 60kg
                } else {
                    dosagemMg = 875;  // 875 mg para adultos com peso abaixo de 60kg
                }
            } else {
                // Dosagem para crianças e adolescentes abaixo de 12 anos com base no peso
                if (peso >= 5 && peso <= 9) {
                    dosagemMg = 125;  // 125 mg para peso entre 5 kg e 9 kg
                } else if (peso >= 9.1 && peso <= 16) {
                    dosagemMg = 250;  // 250 mg para peso entre 9.1 kg e 16 kg
                } else if (peso >= 16.1 && peso <= 24) {
                    dosagemMg = 375;  // 375 mg para peso entre 16.1 kg e 24 kg
                } else if (peso >= 24.1 && peso <= 30) {
                    dosagemMg = 500;  // 500 mg para peso entre 24.1 kg e 30 kg
                } else if (peso > 30) {
                    dosagemMg = 750;  // 750 mg para peso acima de 30 kg
                } else {
                    System.out.println("Peso fora da faixa permitida para dosagem.");
                    return; // Se o peso for menor que 5kg, o algoritmo encerra.
                }
            }

            // Cálculo das gotas: 500 mg por ml e 20 gotas por ml
            double mlMedicamento = dosagemMg / 500;  // Calcula os ml necessários para a dosagem
            gotasPorDose = (int) (mlMedicamento * 20);  // Converte para gotas (20 gotas por ml)

            // Impressão da receita
            System.out.println("\nReceita:");
            System.out.println("Dosagem recomendada: " + dosagemMg + " mg");
            System.out.println("Você deve tomar " + gotasPorDose + " gotas por dose.");
        }
    }
