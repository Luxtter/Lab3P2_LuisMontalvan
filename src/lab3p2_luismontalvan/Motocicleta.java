/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Motocicleta extends Vehiculos{
    private int motor;
    private boolean electrico;
    public Motocicleta() {
        super();
    }

    public Motocicleta(int motor, boolean electrico, String color, String marca, String modelo, int ano, int llantas, double precio) {
        super(color, marca, modelo, ano, llantas, precio);
        this.motor = motor;
        this.electrico = electrico;
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

    

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return super.toString()+"Motocicleta{" + "motor=" + motor +" cc" +", electrico=" + electrico + '}';
    }
    
}
