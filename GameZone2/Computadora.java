package GameZone2;

public class Computadora {
    private Integer columna;
    private Integer fila;

    public void tirarPC(){
        this.columna = (int)(Math.random()*3);
        System.out.println(this.columna);
        this.fila = (int)(Math.random()*3);
    }

    public Integer getColumna() {
        return this.columna;
    }

    public Integer getFila() {
        return this.fila;
    }
}
