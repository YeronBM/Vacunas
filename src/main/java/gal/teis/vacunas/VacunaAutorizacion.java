/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.vacunas;

/**
 *
 * @author a13yeronbm
 */
public abstract class VacunaAutorizacion implements IAutorizable {

    //Atributos
    boolean fase1Superada = false;
    boolean fase2Superada = false;
    boolean fase3Superada = false;
    /*-bytefasesCompletadas
    Tendrá el valor correspondiente a las fases de las 
    que se ha almacenado el resultado. Cuando el resultado de las 3 fases hayan 
    sido introducidos, el atributo tendrá el valor 3*/
    byte fasesCompletadas;

    //contructores
    //getter-setter
    public boolean isFase1Superada() {
        return fase1Superada;
    }

    public void setFase1Superada(boolean fase1Superada) {
        this.fase1Superada = fase1Superada;
        if (fase1Superada = true) {
            fasesCompletadas = 1;
        }
    }

    public boolean isFase2Superada() {
        return fase2Superada;
    }

    public void setFase2Superada(boolean fase2Superada) {
        this.fase2Superada = fase2Superada;
        if (fase2Superada = true) {
            fasesCompletadas = 2;
        }
    }

    public boolean isFase3Superada() {
        return fase3Superada;
    }

    public void setFase3Superada(boolean fase3Superada) {
        this.fase3Superada = fase3Superada;
        if (fase3Superada = true) {
            fasesCompletadas = 3;
        }
    }

    //métodos
}
