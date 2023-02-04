/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Clientes {
    private String nombre, id;
    private ArrayList<Vehiculos> vehiculos = new ArrayList();
    private double Saldo;

    public Clientes() {
    }

    
    public Clientes(String id, String nombre, double Saldo) {
        this.id = id;
        this.nombre = nombre;
        this.Saldo = Saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", Saldo=" + Saldo + '}';
    }
    
    
}
