/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.TiendaComputadores;

/**
 *
 * @author DELL
 */

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Computador;

public class TiendaComputadorasVista {
    private TiendaComputadores asptTiendaComputadores;
    private final Scanner asptScanner;

    public TiendaComputadorasVista() {
        asptScanner = new Scanner(System.in);
        inicializarTienda();
    }

    private void inicializarTienda() {
        System.out.print("Ingrese el nombre de la tienda: ");
        String asptNombreTienda = asptScanner.nextLine();
        System.out.print("Ingrese el nombre del propietario: ");
        String asptPropietario = asptScanner.nextLine();
        System.out.print("Ingrese el identificador tributario: ");
        String asptIdentificadorTributario = asptScanner.nextLine();

        asptTiendaComputadores = new TiendaComputadores(asptNombreTienda, asptPropietario, asptIdentificadorTributario);
        menuPrincipal();
    }

    private void menuPrincipal() {
        boolean asptSalir = false;
        while (!asptSalir) {
            System.out.println("\nMenú principal");
            System.out.println("1. Agregar computadora");
            System.out.println("2. Contar computadoras");
            System.out.println("3. Buscar computadoras por marca");
            System.out.println("4. Listar todas las computadoras");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int asptOpcion = asptScanner.nextInt();
            asptScanner.nextLine(); // Consumir el salto de línea

            switch (asptOpcion) {
                case 1:
                    agregarComputadora();
                    break;
                case 2:
                    contarComputadoras();
                    break;
                case 3:
                    buscarComputadorasPorMarca();
                    break;
                case 4:
                    listarComputadoras();
                    break;
                case 5:
                    asptSalir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void agregarComputadora() {
        System.out.print("Ingrese la marca de la computadora: ");
        String asptMarca = asptScanner.nextLine();
        System.out.print("Ingrese la cantidad de memoria (GB): ");
        int asptMemoria = asptScanner.nextInt();
        asptScanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese las características del procesador: ");
        String asptCaracteristicasProcesador = asptScanner.nextLine();
        System.out.print("Ingrese el sistema operativo: ");
        String asptSistemaOperativo = asptScanner.nextLine();
        System.out.print("Ingrese el precio de la computadora: ");
        double asptPrecio = asptScanner.nextDouble();
        asptScanner.nextLine(); // Consumir el salto de línea

        Computador asptComputadora = new Computador(asptMarca, asptMemoria, asptCaracteristicasProcesador, asptSistemaOperativo, asptPrecio);
        asptTiendaComputadores.agregarComputadora(asptComputadora);
        System.out.println("Computadora agregada correctamente.");
    }

    private void contarComputadoras() {
        int asptCantidadComputadoras = asptTiendaComputadores.contarComputadoras();
        System.out.println("La tienda tiene " + asptCantidadComputadoras + " computadoras.");
    }

    private void buscarComputadorasPorMarca() {
        System.out.print("Ingrese la marca de las computadoras a buscar: ");
        String asptMarca = asptScanner.nextLine();
        ArrayList<Computador> asptComputadorasPorMarca = asptTiendaComputadores.buscarPorMarca(asptMarca);

        if (asptComputadorasPorMarca.isEmpty()) {
            System.out.println("No se encontraron computadoras de la marca " + asptMarca + " en la tienda.");
        } else {
            System.out.println("Computadoras de la marca " + asptMarca + ":");
            for (Computador asptComputadora : asptComputadorasPorMarca) {
                System.out.println("Marca: " + asptComputadora.getMarca());
                System.out.println("Memoria: " + asptComputadora.getMemoria() + " GB");
                System.out.println("Procesador: " + asptComputadora.getCaracteristicasProcesador());
                System.out.println("Sistema Operativo: " + asptComputadora.getSistemaOperativo());
                System.out.println("Precio: $" + asptComputadora.getPrecio());
                System.out.println();
            }
        }
    }

    private void listarComputadoras() {
        ArrayList<Computador> asptComputadoras = asptTiendaComputadores.obtenerComputadoras();

        if (asptComputadoras.isEmpty()) {
            System.out.println("No hay computadoras en la tienda.");
        } else {
            System.out.println("Computadoras en la tienda:");
            for (Computador asptComputadora : asptComputadoras) {
                System.out.println("Marca: " + asptComputadora.getMarca());
                System.out.println("Memoria: " + asptComputadora.getMemoria() + " GB");
                System.out.println("Procesador: " + asptComputadora.getCaracteristicasProcesador());
                System.out.println("Sistema Operativo: " + asptComputadora.getSistemaOperativo());
                System.out.println("Precio: $" + asptComputadora.getPrecio());
                System.out.println();
            }
        }
    }
}