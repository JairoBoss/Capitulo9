package GameZone2;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero x = new Tablero();

        int opc = 0;
        x.generarTablero();
        do {
            x.validar();
            x.validarPC();
            x.imprimirTablero();
            System.out.println(x.checarGanador());
            System.out.println(x.checarGanadorPC());

        }while (x.checarGanador().equals("Ganaste") || !x.checarGanadorPC().equals("Gano pc")) ;

    }


}