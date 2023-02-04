/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Bus extends Vehiculos{
    private int pasajeros;
    private String tipo;
    public Bus() {
        super();
    }

    public Bus(int pasajeros, String tipo, String color, String marca, String modelo, int ano, int llantas, double precio) {
        super(color, marca, modelo, ano, llantas, precio);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
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

    

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
        if(pasajeros<50){
            this.tipo = "Rapidito";
        }else{
            this.tipo = "Bus de Ruta";
        }
    }

    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return super.toString()+"Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
    
}
