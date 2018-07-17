/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.model;

/**
 *
 * @author Rebecca
 */
public class Enfermero extends Pessoa {
    private String horasMensais;
    private String valorDasHoras;

    public String getHorasMensais() {
        return horasMensais;
    }

    public void setHorasMensais(String horasMensais) {
        this.horasMensais = horasMensais;
    }

    public String getValorDasHoras() {
        return valorDasHoras;
    }

    public void setValorDasHoras(String valorDasHoras) {
        this.valorDasHoras = valorDasHoras;
    }
    
}
