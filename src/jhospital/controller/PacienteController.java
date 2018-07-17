/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.controller;

import java.util.List;
import jhospital.model.Paciente;

/**
 *
 * @author Rebecca
 */
public class PacienteController 
{
public void inserir 
        (String nome, String email, String endereco, String telefone,
        String quarto, String doenca, String diasInternado, String temPlanoDeSaude)
    throws Exception 
{  
}
public void alterar
        (Integer id, String nome, String email, String endereco,
         String telefone, String quarto, String doenca, String diasInternado, 
         String temPlanoDeSaude)
                throws Exception {
            
        }
        public void excluir (Integer id)
                throws Exception {
            
        }
        public List<Paciente> buscar (String nome, String email)
                throws Exception {           
    return null;
        }
}
