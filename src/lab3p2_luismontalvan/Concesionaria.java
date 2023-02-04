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
public class Concesionaria {
    private ArrayList<Vehiculos> vehiculos = new ArrayList();
    private ArrayList<Clientes> clientes = new ArrayList();
    private String nombre, direccion, id;
    private double Saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombre, String direccion, double Saldo, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Saldo = Saldo;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "vehiculos=" + vehiculos + ", clientes=" + clientes + ", nombre=" + nombre + ", direccion=" + direccion + ", Saldo=" + Saldo + ", id=" + id + '}';
    }
    
    
}
