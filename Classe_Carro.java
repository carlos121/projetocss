/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ueg.programacao2.carro;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Carlos Sousa
 */

@Named
@ViewScoped
public class Classe_Carro implements Serializable { //A classe Carro é uma super classe da classe Gol e Ford
    
  private String rodas;
  private String placa;
  private String modelo;

    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Classe_Carro(){//Método Construtor (Inicialização das variaveis)
        
    }
}
