/*

Criar um programa em Java que, a partir do tipo do paciente, calcule adosagem
de determinado medicamento e imprima a receita informandoquantidade de gotas-
do medicamento e a dosagem em mg que o pacientedeve tomar.Considere que o medi
camento em questão possui 400 mg por ml, e que cada ml corresponde a 14 gotas.
Deve ser lido o tipo do paciente e calcule a dosagem em mg e em gotas.

Leve em consideração a tabela abaixo:

        Tipo do Paciente

        Dosagem
        1 - Bebê 600 mg
        2 - Adolescente 1600 mg
        3 - Adulto 4600 mg
        4 - Idoso 2450 mg
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------ Menu -----------\nTipo do Paciente:\n1 - Bebê\n2 - Adolescente\n3 - Adulto\n4 - Idoso\nDigite o qual tipo de paciente você se encaixa: ");
        Scanner input = new Scanner(System.in);
        int indice = input.nextInt();

        switch (indice) {
            case 1: {
                int gotasTotal = 600*14/400;
                System.out.println("Sua dosagem em gotas é de: " + gotasTotal);
                //21
                break;
            }
            case 2: {
                int gotasTotal = 1600*14/400;
                System.out.println("Sua dosagem em gotas é de: " + gotasTotal);
                //56
                break;
            }
            case 3: {
                int gotasTotal = 4600*14/400;
                System.out.println("Sua dosagem em gotas é de: " + gotasTotal);
                //161
                break;
            }
            case 4: {
                int gotasTotal = 2450*14/400;
                System.out.println("Sua dosagem em gotas é de: " + gotasTotal);
                //85
                break;
            }
            default:
                System.out.println("ERRO ao executar o programa! Reinicie e escolha um dos campos do MENU!");
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // Criar o scanner para ler a entrada do usuário
//        Scanner scanner = new Scanner(System.in);
//
//        // Solicitar o tipo do paciente
//        System.out.print("Digite o tipo do paciente (1 - Bebê, 2 - Adolescente, 3 - Adulto, 4 - Idoso): ");
//        int tipoPaciente = scanner.nextInt();
//
//        // Definir a dosagem em mg de acordo com o tipo de paciente
//        int dosagemMg = 0;
//
//        switch (tipoPaciente) {
//            case 1: // Bebê
//                dosagemMg = 600;
//                break;
//            case 2: // Adolescente
//                dosagemMg = 1600;
//                break;
//            case 3: // Adulto
//                dosagemMg = 4600;
//                break;
//            case 4: // Idoso
//                dosagemMg = 2450;
//                break;
//            default:
//                System.out.println("Tipo de paciente inválido.");
//                return;
//        }
//
//        // Calcular a dosagem em ml
//        double dosagemMl = dosagemMg / 400.0;
//
//        // Calcular o número de gotas
//        int gotas = (int) (dosagemMl * 14);
//
//        // Exibir a receita
//        System.out.println("\nReceita:");
//        System.out.println("Tipo de paciente: " + tipoPaciente);
//        System.out.println("Dosagem em mg: " + dosagemMg);
//        System.out.println("Dosagem em ml: " + dosagemMl);
//        System.out.println("Quantidade de gotas: " + gotas);
//    }
//}
