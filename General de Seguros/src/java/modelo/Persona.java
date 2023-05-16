/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alexis Murillo
 */
public class Persona {

    int numero;
    String nombre;
    String email;
    String poliza;
    int suma;
    String fecha;

    public Persona(int numero, String nombre, String email, String poliza, int suma, String fecha) {
        this.numero = numero;
        this.nombre = nombre;
        this.email = email;
        this.poliza = poliza;
        this.suma = suma;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Persona() {

    }
}
