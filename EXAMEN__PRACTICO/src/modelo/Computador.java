/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
public class Computador {
    private String asptMarca;
    private int asptMemoria;
    private String asptCaracteristicasProcesador;
    private String asptSistemaOperativo;
    private double asptPrecio;

    public Computador(String asptMarca, int asptMemoria, String asptCaracteristicasProcesador, String asptSistemaOperativo, double asptPrecio) {
        this.asptMarca = asptMarca;
        this.asptMemoria = asptMemoria;
        this.asptCaracteristicasProcesador = asptCaracteristicasProcesador;
        this.asptSistemaOperativo = asptSistemaOperativo;
        this.asptPrecio = asptPrecio;
    }

    // Getters y Setters
    public String getMarca() {
        return asptMarca;
    }

    public void setMarca(String asptMarca) {
        this.asptMarca = asptMarca;
    }

    public int getMemoria() {
        return asptMemoria;
    }

    public void setMemoria(int asptMemoria) {
        this.asptMemoria = asptMemoria;
    }

    public String getCaracteristicasProcesador() {
        return asptCaracteristicasProcesador;
    }

    public void setCaracteristicasProcesador(String asptCaracteristicasProcesador) {
        this.asptCaracteristicasProcesador = asptCaracteristicasProcesador;
    }

    public String getSistemaOperativo() {
        return asptSistemaOperativo;
    }

    public void setSistemaOperativo(String asptSistemaOperativo) {
        this.asptSistemaOperativo = asptSistemaOperativo;
    }

    public double getPrecio() {
        return asptPrecio;
    }

    public void setPrecio(double asptPrecio) {
        this.asptPrecio = asptPrecio;
    }
}











/*
public class Computador {
    private final String marca;
    private final int memoria;
    private final String procesador;
    private final String sistemaOperativo;
    private final double precio;

    public Computador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }



    @Override
    public String toString() {
        return "Marca: " + marca + 
                ", Memoria: " + memoria + 
                " GB, Procesador: " + procesador + 
                ", Sistema Operativo: " + sistemaOperativo +
                ", Precio: $" + precio;
    }

  
}
   
    */
    
    

