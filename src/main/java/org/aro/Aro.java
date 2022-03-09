package org.aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Raúl Martínez Santiago
 */
public class Aro {

    /**
     * Constante LIMITERADIO
     */
    public static final double LIMITERADIO = 0.0;

    /**
     * Constante MINIMO
     */
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Metodo Aro
     */
    public Aro() {
    }

    /**
     * Constructor de la clase Aro que asigna los valores de x,y y el radio
     * @param valorX valor de la coordenada X
     * @param valorY valor de la coordenada Y
     * @param valorRadio valor del radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = valorRadio;
    }

    /**
     * Obtiene el valor del diámetro
     * @return diámetro del aro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Obtiene el perímetro del aro
     * @return perímetro del aro
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obtine la superficie del aro
     * @return superficie del aro
     */
    public double superficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Traslada el centro del aro
     * @param trasladarX cantidad que se traslada la coordenada X
     * @param trasladarY cantidad que se traslada la coordenada Y
     */
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
        this.radio = radio;
    }
}