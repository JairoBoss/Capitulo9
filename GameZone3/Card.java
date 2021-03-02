package GameZone3;

public class Card {
    private Suit carta;
    private Integer numero;
    private String cadena;

    public Card(){
        this.carta = Suit.CORAZONES;
        this.numero = 13;
    }

    public void mostrarCarta(){
        switch (this.numero){
            case 11:
                System.out.println("J de "+ getCarta());
                break;
            case 12:
                System.out.println("Q de "+getCarta());
                break;
            case 13:
                System.out.println("K de "+getCarta());
                break;
            case 1:
                System.out.println("1 de ACE");
                break;
            case 2:
                System.out.println("2 TROUGH 10");
                break;
        }
    }

    public Suit getCarta() {
        return carta;
    }

    public void setCarta(Suit carta) {
        this.carta = carta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void cadena(){
        mostrarCarta();
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
