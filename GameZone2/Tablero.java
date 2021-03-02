package GameZone2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tablero {
    char[][] tablero;
    private Usuario usuario = new Usuario();
    private Computadora computadora = new Computadora();


    public void generarTablero(){
        this.tablero = new char[3][3];
        int a = 1;
        for (int i = 0; i <3; ++i) {
            for (int j = 0; j <3; ++j) {

                tablero[i][j] = '-';
                a++;
            }
        }
    }

    public void imprimirTablero(){
        for (int i = 0; i <3; ++i) {
            for (int j = 0; j <3 ;++j) {
                System.out.print(" " +tablero[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void validar(){
        boolean x= false;
        do {
            this.usuario.tirar();
            if (tablero[this.usuario.getColumna()][this.usuario.getFila()] == 'X' || tablero[this.usuario.getColumna()][this.usuario.getFila()] == 'O'){
                System.out.println("Esa casilla esta ocupada");
            }else{
                tablero[this.usuario.getColumna()][this.usuario.getFila()] = 'X';
                x = true;
            }
        }while (!x);
    }

    public void validarPC(){
        boolean x= false;
        do {
            this.computadora.tirarPC();
            if (tablero[this.computadora.getColumna()][this.computadora.getFila()] == 'X' || tablero[this.computadora.getColumna()][this.computadora.getFila()] == 'O'){
            }else{
                this.tablero[this.computadora.getColumna()][this.computadora.getFila()] = 'O';
                x = true;
            }
        }while (!x);
    }

    public String checarGanador(){
        for (int i = 0; i < 3; i++) {
            if ('X'==this.tablero[i][0] && 'X'==this.tablero[i][1] && 'X'==this.tablero[i][2]){
                System.out.println("Ganaste");
            }
        }

        for (int i = 0; i < 3; i++) {
            if ('X'==this.tablero[0][i] && 'X'==this.tablero[1][i] && 'X'==this.tablero[2][i]){
                return "Ganaste";
            }
        }

        if ('X'==this.tablero[0][0] && 'X'==this.tablero[1][1] && 'X'==this.tablero[2][2]){
            return "Ganaste";
        }else if ('X'==this.tablero[0][2] && 'X'==this.tablero[1][1] && 'X'==this.tablero[2][0]){
            return "Ganaste";
        }else{
            return "Ganaste";

        }
    }

    public String checarGanadorPC(){
        for (int i = 0; i < 3; i++) {
            if ('O'==this.tablero[i][0] && 'O'==this.tablero[i][1] && 'O'==this.tablero[i][2]){
                return "Gano pc";
            }
        }

        for (int i = 0; i < 3; i++) {
            if ('O'==this.tablero[0][i] && 'O'==this.tablero[1][i] && 'O'==this.tablero[2][i]){
                return "Gano pc";
            }
        }

        if ('O'==this.tablero[0][0] && 'O'==this.tablero[1][1] && 'O'==this.tablero[2][2]){
            return "Gano pc";
        }else if ('O'==this.tablero[0][2] && 'O'==this.tablero[1][1] && 'O'==this.tablero[2][0]){
            return "Gano pc";
        }else{
            return "aun no";
        }
    }


}
