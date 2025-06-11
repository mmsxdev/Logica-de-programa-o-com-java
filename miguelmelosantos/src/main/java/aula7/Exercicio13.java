package aula7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exercicio13 {

    /**
     * Exibe a data e a hora atuais formatadas.
     */
    public static void exibirDataEHoraAtuais() {
        LocalDateTime agora = LocalDateTime.now();

        String diaDaSemana = agora.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern(
                "dd 'de' MMMM 'de' yyyy, HH'h'mm'min'ss's'",
                new Locale("pt", "BR")
        );

        String dataHoraFormatada = agora.format(formatador);

        // Coloca a primeira letra do dia da semana em maiúscula
        diaDaSemana = diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1);

        System.out.println("Data e hora atuais: " + diaDaSemana + ", " + dataHoraFormatada);
    }

    public static void main(String[] args) {
        exibirDataEHoraAtuais();
    }
}