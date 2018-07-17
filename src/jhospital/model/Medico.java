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
public class Medico extends Pessoa {

private String especialidad;
private String horasMensais;
private String valorDasHoras;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

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
