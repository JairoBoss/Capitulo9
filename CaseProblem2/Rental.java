package CaseProblem2;

public class Rental {
    public final Integer minutosHora = 60;
    public final Integer tarifa = 40;
    public final static String equipos[] = {"moto acuática", "pontón", "bote de remos", "canoa", "kayak", "silla de playa",
            "paraguas","otros"};
    private String noContrato;
    private  Integer noHoras;
    private  Integer noMinutos;
    private String noTelefono;
    private Integer precio;
    private  Integer equipo;
    private String tipoDeEquipo;

    public Rental(String noContrato, int minutos, String noTelefono, int equipo){
        this.noHoras = minutos / minutosHora;
        this.noMinutos = minutos%minutosHora;
        this.precio = ((this.noHoras*tarifa )+ (noMinutos*1));
        this.noContrato = noContrato;
        this.noTelefono = noTelefono;
        this.equipo = equipo;
        setEquipo(equipo);
    }

    public String getTipoDeEquipo(){
        return  this.tipoDeEquipo;
    }

    public void setEquipo(int x){
        if (x < equipos.length -1){
            this.tipoDeEquipo = equipos[x-1];
        }else{
            this.tipoDeEquipo = String.valueOf(x);
        }
    }

    public void setNoMinutos(Integer minutos) {
        this.noHoras = minutos / minutosHora;
        this.noMinutos = minutos%minutosHora;
        this.precio = ((this.noHoras*tarifa )+ (noMinutos*1));
    }

    @Override
    public String toString() {
        return "Rental{" +
                "minutosHora=" + minutosHora +
                ", tarifa=" + tarifa +
                ", noContrato='" + noContrato + '\'' +
                ", noHoras=" + noHoras +
                ", noMinutos=" + noMinutos +
                ", noTelefono='" + noTelefono + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void noTelefono(String num){
        num = num.replace('(', '\0');
        num = num.replace(')', '\0');
        num = num.replace('-', '\0');
        num = num.replace(' ', '\0');
        num = num.replaceAll("\0", "");
        if (num.length()!=10) {
            num = "0000000000";
        }
        this.noTelefono = num;
    }

    public String getNoTelefono(){
        StringBuilder aux = new StringBuilder(this.noTelefono);
        aux.insert(0, "(");
        aux.insert(4, ")");
        aux.insert(5, " ");
        aux.insert(9, "-");

        this.noTelefono = aux.toString();
        return this.noTelefono;
    }

    public void setNoTelefono(String noTelefono) {
        this.noTelefono = noTelefono;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getMinutosHora() {
        return minutosHora;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public String getNoContrato() {
        return noContrato;
    }

    public void setNoContrato(String noContrato) {
        this.noContrato = noContrato;
    }

    public Integer getNoHoras() {
        return noHoras;
    }

    public Integer getNoMinutos() {
        return noMinutos;
    }
}
