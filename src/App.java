import java.util.Random;

public class App {
    public static void main(String[] args) {
        String[][] campo = new String[15][20];
        int[] aleatorLin = new int[4];
        int[] aleatorCol = new int[4];

        Random gerador = new Random();
        //gera posições randonicas para a posição dos reservatorios 
        for (int i = 0; i < 4; i++) {
            aleatorLin[i] = gerador.nextInt(15);
            aleatorCol[i] = gerador.nextInt(20);
            if (aleatorLin[i] == 8 && aleatorCol[i] == 10) {
                i--;
            } else {
                campo[aleatorLin[i]][aleatorCol[i]] = "R";                
            }
            
        }
        // o formigueiro ficara na posição do campo[8][10] represntado pela letra 'F'
        campo[8][10] = "F";
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 20; j++) {
                if (campo[i][j] == null) {
                    campo[i][j] = "";
                    System.out.print(" | "+campo[i][j]);
                } else {
                    System.out.print(" | "+campo[i][j]);
                }
            }
            System.out.println(" |-");
        }
    }
}