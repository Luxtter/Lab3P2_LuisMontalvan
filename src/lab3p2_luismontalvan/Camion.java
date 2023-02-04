/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Camion extends Vehiculos{
    private int volumen, altura;
    private boolean retroexcavadora;

    public Camion() {
        super();
    }

    public Camion(int volumen, int altura, boolean retroexcavadora, String color, String marca, String modelo, int ano, int llantas, double precio) {
        super(color, marca, modelo, ano, llantas, precio);
        this.volumen = volumen;
        this.altura = altura;
        this.retroexcavadora = retroexcavadora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return super.toString()+"Camion{" + "volumen=" + volumen + ", altura=" + altura + ", retroexcavadora=" + retroexcavadora + '}';
    }
    
    
}
