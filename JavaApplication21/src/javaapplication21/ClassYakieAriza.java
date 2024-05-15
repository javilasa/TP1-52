/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author USUARIO
 */
public class ClassYakieAriza extends Persona  {
    private String nombre;

    public ClassYakieAriza() {
        this.nombre = "Yakelin Ariza";
        super.setId(1254);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  "Nombre : " + nombre + " Cedula :"  + super.getId();
    }

    
}
