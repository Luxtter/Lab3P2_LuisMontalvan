/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Bicicleta extends Vehiculos{
    private String descripcion;
    private int radioRueda;
    private String BMX;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String descripcion, int radioRueda, String BMX, String color, String marca, String modelo, int ano, int llantas, double precio) {
        super(color, marca, modelo, ano, llantas, precio);
        this.descripcion = descripcion;
        this.radioRueda = radioRueda;
        this.BMX = BMX;
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

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadioRueda() {
        return radioRueda;
    }

    public void setRadioRueda(int radioRueda) {
        this.radioRueda = radioRueda;
    }

    public String getBMX() {
        return BMX;
    }

    public void setBMX(String BMX) {
        this.BMX = BMX;
    }

    @Override
    public String toString() {
        return super.toString()+"Bicicleta{" + "descripcion=" + descripcion + ", radioRueda=" + radioRueda + ", BMX=" + BMX + '}';
    }
    
}
