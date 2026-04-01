/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg1.estructuras.de.control;

/**
 *
 * @author anwar
 */
public class Persona {
    
    //Atributos
    private float peso;
    private float estatura;
    private float imc;

    
    //Propiedades
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc() {
        this.imc = this.peso / (this.estatura * this.estatura);
    }
    

    
}
