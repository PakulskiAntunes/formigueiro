
import entities.Campo;
import entities.Formigueiro;
import entities.Reservatorio;

public class App {
    public static void main(String[] args) throws InterruptedException {
        
        Campo campo = new Campo();
        Reservatorio reservatorio = new Reservatorio(campo);
        Formigueiro formigueiro = new Formigueiro(campo);
        
        System.out.println(campo.imprimeCampo());
        


    }
}