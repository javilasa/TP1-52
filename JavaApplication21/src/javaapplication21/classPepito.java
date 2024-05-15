/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author USUARIO
 */
public class classPepito extends Persona {
    
    private String pseudonimo;

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    @Override
    public String toString() {
        return  "Nombre : " + pseudonimo + " Cedula :"  + super.getId();
    }
    
    
}
