import java.util.Scanner;

public class JogoDaVelha {

    static char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jogoAtivo = true;
        int jogadas = 0;

        System.out.println("=== JOGO DA VELHA ===");

        // ‘Loop’ principal do jogo
        while (jogoAtivo) {
            mostrarTabuleiro();
            System.out.println("Vez do jogador '" + jogadorAtual + "'");

            int linha, coluna;

            // Verifica se a jogada é válida
            while (true) {
                System.out.print("Digite a linha (0 a 2): ");
                linha = sc.nextInt();
                System.out.print("Digite a coluna (0 a 2): ");
                coluna = sc.nextInt();

                if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                    if (tabuleiro[linha][coluna] == ' ') {
                        tabuleiro[linha][coluna] = jogadorAtual;
                        jogadas++;
                        break;
                    } else {
                        System.out.println("Essa casa já está ocupada! Tente outra.");
                    }
                } else {
                    System.out.println("Posição inválida! Digite valores entre 0 e 2.");
                }
            }

            // Verifica vitória
            if (verificarVitoria()) {
                mostrarTabuleiro();
                System.out.println("Jogador '" + jogadorAtual + "' venceu!");
                jogoAtivo = false;
            }
            // Verifica empate
            else if (jogadas == 9) {
                mostrarTabuleiro();
                System.out.println("Empate! Ninguém venceu.");
                jogoAtivo = false;
            }
            // Troca de jogador
            else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }

    // Mostra o tabuleiro no terminal
    public static void mostrarTabuleiro() {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }

    // Verifica se o jogador atual venceu
    public static boolean verificarVitoria() {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                    (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                return true;
            }
        }

        // Verifica diagonais
        if ((tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
            return true;
        }

        return false;
    }
}
