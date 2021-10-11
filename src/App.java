import java.util.ArrayList;
import java.util.Random;

import formigas.formigarastreadora.FormigaRastreadora;
import formigueiro.Formigueiro;
import reservatorio.Reservatorio;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // lista das reservas
        ArrayList<Reservatorio> reserv=new ArrayList<Reservatorio>();
         // criação das formigas
        FormigaRastreadora Fr = new FormigaRastreadora();
        

        // criação da matriz do campo de execução
        String[][] campo = new String[15][20];
        //posição de linhas e colunas aleatoria para inserção do reservatorio de alimentos
        // a principio serão 4 reservatorios 
        int[] aleatorLin = new int[4];
        int[] aleatorCol = new int[4];

        Random gerador = new Random();
        //gera posições randonicas para a posição dos reservatorios 
        for (int i = 0; i < 4; i++) {
            aleatorLin[i] = gerador.nextInt(12);
            aleatorCol[i] = gerador.nextInt(15);
            // após realizar a sequencia randonica realiza o teste para verificar se o reservatorio 
            // não ficara na posição do Formigueiro
            if (aleatorLin[i] == 8 && aleatorCol[i] == 10) {
                i--;
            } else {
                // cria o reservatorio cada um com sua capacidade
                Reservatorio r = new Reservatorio(aleatorLin[i],aleatorCol[i]);
                reserv.add(r);

                campo[aleatorLin[i]][aleatorCol[i]] = reserv.get(i).getReserva()+(i+1);
                // após realizar o posicionamento dos reservatorios é colocado obstaculos ao redor 
                // para que as formigas realizem o desvio
                if ((campo[aleatorLin[i] + 1][aleatorCol[i]]) == null) {
                    campo[aleatorLin[i] + 1][aleatorCol[i]] = "   O";
                }
                if ((campo[aleatorLin[i]][aleatorCol[i] + 1]) == null) {
                    campo[aleatorLin[i]][aleatorCol[i] + 1] = "   O";
                } 
                // if ((campo[aleatorLin[i] - 1][aleatorCol[i]]) == null) {
                //     campo[aleatorLin[i] - 1][aleatorCol[i]] = " O";
                // }
            }            
        }
        // o formigueiro ficara na posição do campo[8][10] represntado pela letra 'F'
        Formigueiro F = new Formigueiro();
        campo[8][10] = "   F";
        int reservAlea = gerador.nextInt(4);
        // for para rodar programa
        for (int cont = 0; cont < 2; cont++) {
            System.out.println(reservAlea);   
            // realiza impressão das reservas
            for (int i = 0; i < reserv.size(); i++) {
                System.out.println("Reservatorio " + (i + 1) + "" + reserv.get(i).toString());
            }
            // impressão dos detalhes do formigueiro
            System.out.println(F.toString()+"\n");
            // gera o campo
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 20; j++) {
                    if (campo[i][j] == null) {
                        campo[i][j] = "    ";
                        System.out.print("    |" + campo[i][j]);
                    } else {
                        System.out.print("    |" + campo[i][j]);
                    }
                }
                System.out.print("   | " + (i + 1) + "\n");
            }
            // pausa para próxima ação
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            
                campo[8][10] = "  FFr"; 
        }
    }
}