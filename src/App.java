import java.util.ArrayList;
import java.util.Random;
import reservatorio.Reservatorio;

public class App {
    public static void main(String[] args) {
        // iniciação de teclado
        ArrayList<Reservatorio> reserv=new ArrayList<Reservatorio>();


        // criação da matriz do campo de execução
        String[][] campo = new String[15][20];
        //posição de linhas e colunas aleatoria para inserção do reservatorio de alimentos
        // a principio serão 4 reservatorios 
        int[] aleatorLin = new int[4];
        int[] aleatorCol = new int[4];

        Random gerador = new Random();
        //gera posições randonicas para a posição dos reservatorios 
        for (int i = 0; i < 4; i++) {
            aleatorLin[i] = gerador.nextInt(15);
            aleatorCol[i] = gerador.nextInt(20);
            // após realizar a sequencia randonica realiza o teste para verificar se o reservatorio 
            // não ficara na posição do Formigueiro
            if (aleatorLin[i] == 8 && aleatorCol[i] == 10) {
                i--;
            } else {
                // cria o reservatorio cada um com sua capacidade
                Reservatorio r = new Reservatorio();
                reserv.add(r);

                campo[aleatorLin[i]][aleatorCol[i]] = reserv.get(i).getReserva();
                // após realizar o posicionamento dos reservatorios é colocado obstaculos ao redor 
                // para que as formigas realizem o desvio
                if ((campo[aleatorLin[i] + 1][aleatorCol[i]]) == null) {
                    campo[aleatorLin[i] + 1][aleatorCol[i]] = "O";
                }
                if ((campo[aleatorLin[i]][aleatorCol[i] + 1]) == null) {
                    campo[aleatorLin[i]][aleatorCol[i] + 1] = "O";
                }
                if ((campo[aleatorLin[i] - 1][aleatorCol[i]]) == null) {
                    campo[aleatorLin[i] - 1][aleatorCol[i]] = "O";
                }  
            }            
        }
        // o formigueiro ficara na posição do campo[8][10] represntado pela letra 'F'
        campo[8][10] = "F";

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 20; j++) {
                if (campo[i][j] == null) {
                    campo[i][j] = " ";
                    System.out.print(" |" + campo[i][j]);
                } else {
                    System.out.print(" |"+campo[i][j]);
                }
            }
            System.out.print(" |\n");
        }
    }
}