package Aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author a21raulms
 */
public class Aro {

    public static final double LIMITERADIO = 0.0;
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }







    public double obterDiametro() {
        return getRadio() * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double Superficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = (radio < MINIMO ? MINIMO : radio );
    }
}