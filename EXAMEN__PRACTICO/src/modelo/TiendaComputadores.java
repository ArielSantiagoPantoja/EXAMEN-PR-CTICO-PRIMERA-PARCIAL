/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;

public class TiendaComputadores {
    private String asptNombreTienda;
    private String asptPropietario;
    private String asptIdentificadorTributario;
    private final ArrayList<Computador> asptComputadoras;

    public TiendaComputadores(String asptNombreTienda, String asptPropietario, String asptIdentificadorTributario) {
        this.asptNombreTienda = asptNombreTienda;
        this.asptPropietario = asptPropietario;
        this.asptIdentificadorTributario = asptIdentificadorTributario;
        this.asptComputadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computador computadora) {
        asptComputadoras.add(computadora);
    }

    public int contarComputadoras() {
        return asptComputadoras.size();
    }

    public ArrayList<Computador> buscarPorMarca(String marca) {
        ArrayList<Computador> computadorasPorMarca = new ArrayList<>();
        for (Computador computadora : asptComputadoras) {
            if (computadora.getMarca().equalsIgnoreCase(marca)) {
                computadorasPorMarca.add(computadora);
            }
        }
        return computadorasPorMarca;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return asptComputadoras;
    }

    // Getters y Setters
    public String getNombreTienda() {
        return asptNombreTienda;
    }

    public void setNombreTienda(String asptNombreTienda) {
        this.asptNombreTienda = asptNombreTienda;
    }

    public String getPropietario() {
        return asptPropietario;
    }

    public void setPropietario(String asptPropietario) {
        this.asptPropietario = asptPropietario;
    }

    public String getIdentificadorTributario() {
        return asptIdentificadorTributario;
    }

    public void setIdentificadorTributario(String asptIdentificadorTributario) {
        this.asptIdentificadorTributario = asptIdentificadorTributario;
    }
}
