package GameZone3;

import java.util.ArrayList;

public class FullDeck {
    private ArrayList<Card> cartas;
    private  ArrayList<Integer> repetidos;

    public FullDeck(){
        cartas = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            Card aux = new Card();
            cartas.add(aux);
        }
    }

    public void imrpimirFullDeck(){
        for (int i = 0; i < cartas.size() ; i++) {
            System.out.println("Carta "+i + ":  "+cartas.get(i).getNumero());
        }
    }
}
