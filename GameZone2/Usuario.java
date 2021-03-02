package GameZone2;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    private Integer columna;
    private Integer fila;

    public Usuario(){
    }

    public Integer getColumna() {
        return this.columna;
    }

    public Integer getFila() {
        return this.fila;
    }

    public void tirar(){
        System.out.print("Introduce la fila para tirar: ");
        this.columna = sc.nextInt();
        System.out.print("Introduce la columna para el tirar: ");
        this.fila = sc.nextInt();
    }



}
