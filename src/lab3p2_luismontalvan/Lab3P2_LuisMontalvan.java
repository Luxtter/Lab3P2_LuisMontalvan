/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_luismontalvan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luism
 */
public class Lab3P2_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pochita = new Scanner(System.in);
        ArrayList<Vehiculos> vehiculos = new ArrayList();
        ArrayList<Concesionaria> concesionaria = new ArrayList();
        ArrayList<Clientes> cliente = new ArrayList();
        String s = "";
        int llantas = 0;
        Bus buses = new Bus();
        Carro carros = new Carro();
        Camion camiones = new Camion();

        Clientes clientes = new Clientes();
        Concesionaria concesionarias = new Concesionaria();
        int opc = 0;
        do {
            System.out.print("1)CRUD Concesaria\n"
                    + "2)CRUD Clientes\n"
                    + "3)Crud Vehiculos\n"
                    + "4)Compra/Venta de vehiculos por parte de un cliente\n"
                    + "5)"
                    + "Ingrese una opcion: ");
            opc = pochita.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("1)Nueva concesionaria\n"
                            + "2)Ver concesionarias\n"
                            + "Ingrese una opcion: ");
                    opc = pochita.nextInt();
                    s = "";
                    switch (opc) {
                        case 1:
                            String rand = "";
                            concesionaria.add(new Concesionaria());
                            System.out.print("Ingrese nombre de la concesionaria: ");
                            concesionaria.get(concesionaria.size() - 1).setNombre(pochita.nextLine());
                            System.out.print("Ingrese direccion de la concesionaria: ");
                            concesionaria.get(concesionaria.size() - 1).setDireccion(pochita.nextLine());
                            System.out.print("Ingrese saldo de la concesionaria: ");
                            concesionaria.get(concesionaria.size() - 1).setSaldo(pochita.nextDouble());
                            for (int i = 0; i < 10; i++) {
                                rand += Math.random();
                            }
                            concesionaria.get(concesionaria.size() - 1).setId(rand + concesionaria.size());
                            break;
                        case 2:
                            for (Object t : concesionaria) {
                                s += "" + concesionaria.indexOf(t) + ")" + t + "\n";
                            }
                            System.out.println(s);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("1)Nuevo cliente\n"
                            + "2)Modificar Saldo de cliente\n"
                            + "Ingrese una opcion: ");
                    opc = pochita.nextInt();
                    switch (opc) {
                        case 1:
                            s = "";
                            for (Object t : concesionaria) {
                                s += "" + concesionaria.indexOf(t) + ")" + t + "\n";
                            }
                            if (concesionaria.size() != 0) {
                                System.out.print(s + "En que concesionaria desea ser parte: ");
                                opc = pochita.nextInt();
                                String rand = "";
                                concesionarias.getClientes().add(new Clientes());
                                for (int i = 0; i < 10; i++) {
                                    rand += Math.random();
                                }
                                concesionaria.get(opc).getClientes().get(concesionarias.getClientes().size()).setId(rand + 1);
                                System.out.print("Ingrese el nombre del cliente: ");
                                concesionaria.get(opc).getClientes().get(concesionarias.getClientes().size()).setNombre(pochita.nextLine());
                                System.out.print("Ingrese el saldo del cliente: ");
                                concesionaria.get(opc).getClientes().get(concesionarias.getClientes().size()).setSaldo(pochita.nextDouble());

                            } else {
                                System.out.println("No hay concesiones disponibles");
                            }
                            break;
                        case 2:
                            s = "";
                            for (Object t : concesionaria) {
                                s += "" + concesionaria.indexOf(t) + ")" + t + "\n";
                            }
                            if (concesionaria.size() != 0) {
                                System.out.print(s + "De que concesionaria es el cliente:");
                                opc = pochita.nextInt();
                                System.out.print("Ingrese el nuevo saldo del cliente: ");
                                concesionaria.get(opc).getClientes().get(concesionarias.getClientes().size()).setSaldo(pochita.nextDouble());
                            } else {
                                System.out.println("No hay concesionarias disponibles");
                            }
                    }
                    break;
                case 3:
                    System.out.print("1)Crear un vehiculo\n"
                            + "2)Modificar un vehiculo\n"
                            + "Ingrese una opcion: ");
                    opc = pochita.nextInt();
                    switch (opc) {
                        case 1:
                            s = "";
                            for (Object t : concesionaria) {
                                s += "" + concesionaria.indexOf(t) + ")" + t + "\n";
                            }
                            if (concesionaria.size() != 0) {
                                System.out.print(s + "A que concesionaria agregarlo:");
                                opc = pochita.nextInt();
                                switch (opc) {
                                    case 1:
                                        System.out.print("Cuantas llantas tiene el vehiculo: ");
                                        llantas = pochita.nextInt();
                                        if (llantas == 2) {
                                            System.out.print("1.Motocicleta\n"
                                                    + "2.Bicicleta\n"
                                                    + "Ingrese su opcion: ");
                                            int opc2 = pochita.nextInt();
                                            switch (opc2) {
                                                case 1:
                                                    Motocicleta motos = new Motocicleta();
                                                    System.out.print("Ingrese la marca: ");
                                                    motos.setMarca(pochita.nextLine());
                                                    System.out.print("Ingrese el modelo: ");
                                                    motos.setModelo(pochita.nextLine());
                                                    System.out.print("Ingrese el ano de creacion: ");
                                                    motos.setAno(pochita.nextInt());
                                                    System.out.print("Ingrese el color: ");
                                                    motos.setColor(pochita.nextLine());
                                                    System.out.print("Ingrese el desplazamiento del motor: ");
                                                    motos.setMotor(pochita.nextInt());
                                                    System.out.print("Es el motor electrico? 1:SI2:NO ");
                                                    opc2 = pochita.nextInt();
                                                    if (opc2 == 1) {
                                                        motos.setElectrico(true);
                                                    } else {
                                                        motos.setElectrico(false);
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    motos.setPrecio(pochita.nextDouble());
                                                    concesionaria.get(opc).getVehiculos().add(motos);

                                                    break;
                                                case 2:
                                                    Bicicleta bicis = new Bicicleta();
                                                    System.out.print("Ingrese la marca: ");
                                                    bicis.setMarca(pochita.nextLine());
                                                    System.out.print("Ingrese el modelo: ");
                                                    bicis.setModelo(pochita.nextLine());
                                                    System.out.print("Ingrese el ano de creacion: ");
                                                    bicis.setAno(pochita.nextInt());
                                                    System.out.print("Ingrese el color: ");
                                                    bicis.setColor(pochita.nextLine());
                                                    System.out.print("Ingrese el radio de la rueda: ");
                                                    bicis.setRadioRueda(pochita.nextInt());
                                                    System.out.print("Tipo de bici 1.BMX 2.Calle");
                                                    opc2 = pochita.nextInt();
                                                    if (opc2 == 1) {
                                                        bicis.setBMX("BMX");
                                                    } else {
                                                        bicis.setBMX("Calle");
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    bicis.setPrecio(pochita.nextDouble());
                                                    concesionaria.get(opc).getVehiculos().add(bicis);
                                                    break;
                                            }//fin del switch case
                                        } else if (llantas == 4) {
                                            System.out.print("1.Carro\n"
                                                    + "2.Camion\n"
                                                    + "3.Bus"
                                                    + "Ingrese su opcion: ");
                                            int opc2 = pochita.nextInt();
                                            switch (opc2) {
                                                case 1:
                                                    Carro carro = new Carro();
                                                    System.out.print("Ingrese la marca: ");
                                                    carro.setMarca(pochita.nextLine());
                                                    System.out.print("Ingrese el modelo: ");
                                                    carro.setModelo(pochita.nextLine());
                                                    System.out.print("Ingrese el ano de creacion: ");
                                                    carro.setAno(pochita.nextInt());
                                                    System.out.print("Ingrese el color: ");
                                                    carro.setColor(pochita.nextLine());
                                                    System.out.print("Ingrese el numero de puertas (2 o 4): ");
                                                    carro.setPuertas(pochita.nextInt());
                                                    System.out.print("Ingrese los caballos de fuerza: ");
                                                    carro.setMotor(pochita.nextInt());
                                                    System.out.print("Ingrese la velocidad: ");
                                                    carro.setVelocidad(pochita.nextInt());
                                                    System.out.print("Ingrese el precio: ");
                                                    carro.setPrecio(pochita.nextDouble());
                                                    concesionaria.get(opc).getVehiculos().add(carro);
                                                    break;
                                                case 2:
                                                    Camion camion = new Camion();
                                                    System.out.print("Ingrese la marca: ");
                                                    camion.setMarca(pochita.nextLine());
                                                    System.out.print("Ingrese el modelo: ");
                                                    camion.setModelo(pochita.nextLine());
                                                    System.out.print("Ingrese el ano de creacion: ");
                                                    camion.setAno(pochita.nextInt());
                                                    System.out.print("Ingrese el color: ");
                                                    camion.setColor(pochita.nextLine());
                                                    System.out.print("Ingrese la altura: ");
                                                    camion.setAltura(pochita.nextInt());
                                                    System.out.print("Tiene excavadora 1.Si 2.No: ");
                                                    opc2 = pochita.nextInt();
                                                    if (opc2 == 1) {
                                                        camion.setRetroexcavadora(true);
                                                    } else {
                                                        camion.setRetroexcavadora(false);
                                                    }

                                                    System.out.print("Ingrese el precio: ");
                                                    camion.setPrecio(pochita.nextDouble());
                                                    concesionaria.get(opc).getVehiculos().add(camion);
                                                    break;
                                                case 3:
                                                    Bus bus = new Bus();
                                                    System.out.print("Ingrese la marca: ");
                                                    bus.setMarca(pochita.nextLine());
                                                    System.out.print("Ingrese el modelo: ");
                                                    bus.setModelo(pochita.nextLine());
                                                    System.out.print("Ingrese el ano de creacion: ");
                                                    bus.setAno(pochita.nextInt());
                                                    System.out.print("Ingrese el color: ");
                                                    bus.setColor(pochita.nextLine());
                                                    System.out.print("Ingrese la cantidad de pasajeros: ");
                                                    bus.setPasajeros(pochita.nextInt());

                                                    System.out.print("Ingrese el precio: ");
                                                    bus.setPrecio(pochita.nextDouble());
                                                    concesionaria.get(opc).getVehiculos().add(bus);
                                                    break;
                                            }
                                        }

                                }
                            } else {
                                System.out.println("No hay concesionarias disponibles");
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.print("1)Comprar vehiculo\n"
                            + "2)Vender vehiculo\n"
                            + "Ingrese una opcion: ");
                    opc = pochita.nextInt();
                    switch (opc) {
                        case 1:
                            s = "";
                            for (Object t : concesionaria) {
                                s += "" + concesionaria.indexOf(t) + ")" + t + "\n";
                            }
                            if (concesionaria.size() != 0) {
                                System.out.print(s + "Ingrese la concesionaria donde desea comprar: ");
                                opc = pochita.nextInt();
                                s = "";
                                for (Object t : concesionaria.get(opc).getClientes()) {
                                    s += "" + concesionaria.get(opc).getClientes().indexOf(t) + ")" + t + "\n";
                                }
                                System.out.print(s + "Ingrese el cliente que desea comprar: ");
                                int opc2 = pochita.nextInt();
                                s = "";
                                for (Object t : concesionaria.get(opc).getVehiculos()) {
                                    s += "" + concesionaria.get(opc).getVehiculos().indexOf(t) + ")" + t + "\n";
                                }
                                System.out.print(s + "Ingrese el vehiculo que desea comprar: ");
                                int opc3 = pochita.nextInt();
                                double saldo = concesionaria.get(opc).getClientes().get(opc2).getSaldo();
                                double gastar = concesionaria.get(opc).getVehiculos().get(opc3).getPrecio();
                                if(saldo<(gastar*.075)){
                                    System.out.print("No puede comprar el vehiculo");
                                }else{
                                    concesionaria.get(opc).getClientes().get(opc2).setSaldo(saldo-(gastar*.075));
                                    concesionaria.get(opc).setSaldo(concesionaria.get(opc).getSaldo()+(gastar*.075));
                                    concesionaria.get(opc).getClientes().get(opc2).getVehiculos().add(concesionaria.get(opc).getClientes().get(opc2).getVehiculos().get(opc3));
                                    concesionaria.get(opc).getVehiculos().remove(opc3);
                                }
                            }else{
                                System.out.print("No hay concesionarias disponibles");
                            }
                            break;
                    }
                    break;
            }
        } while (opc != 5);
    }

}
