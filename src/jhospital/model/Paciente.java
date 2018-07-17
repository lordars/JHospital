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
public class Paciente extends Pessoa 
{
private String doenca;
private boolean temPlanoDeSaude;
private int diasDeInternacao;
private int numeroDoQuarto; 

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public boolean isTemPlanoDeSaude() {
        return temPlanoDeSaude;
    }

    public void setTemPlanoDeSaude(boolean temPlanoDeSaude) {
        this.temPlanoDeSaude = temPlanoDeSaude;
    }

    public int getDiasDeInternacao() {
        return diasDeInternacao;
    }

    public void setDiasDeInternacao(int diasDeInternacao) {
        this.diasDeInternacao = diasDeInternacao;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }
}
