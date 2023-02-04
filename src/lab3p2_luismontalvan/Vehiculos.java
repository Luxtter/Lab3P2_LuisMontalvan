/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismontalvan;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Vehiculos {
    protected String color;
    protected String marca, modelo;
    protected int ano, llantas;
    protected double precio;
    private boolean tipo;

    public Vehiculos() {
    }

    public Vehiculos(String color, String marca, String modelo, int ano, int llantas, double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.llantas = llantas;
        this.precio = precio;
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


    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", llantas=" + llantas + ", precio=" + precio + '}';
    }
    
    
}
