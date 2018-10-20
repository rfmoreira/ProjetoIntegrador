/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.model;

import ondecomi.model.Avaliacao;
import ondecomi.model.Restaurantes;

/**
 *
 * @author Luan Amor
 */
public class Japones extends Restaurantes implements Avaliacao {
    private float variedades;
    private float peixeFresco;

    public Japones( String nome, String end) {
        super(nome, end);
        this.variedades = 0;
        this.peixeFresco = 0;
    }
    
    public float alterarAvaliacao(){
        return 0;
    }
    public float avaliarItens(){
        return 0;
    }

    public float getVariedades() {
        return variedades;
    }

    public void setVariedades(float variedades) {
        this.variedades = variedades;
    }

    public float getPeixeFresco() {
        return peixeFresco;
    }

    public void setPeixeFresco(float peixeFresco) {
        this.peixeFresco = peixeFresco;
    }

    public int getIdRest() {
        return idRest;
    }

    public void setIdRest(int idRest) {
        this.idRest = idRest;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(float ambiente) {
        this.ambiente = ambiente;
    }

    public float getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(float atendimento) {
        this.atendimento = atendimento;
    }

    public float getNotaItens() {
        return notaItens;
    }

    public void setNotaItens(float notaItens) {
        this.notaItens = notaItens;
    }

    public float getNotaGeral() {
        return notaGeral;
    }

    public void setNotaGeral(float notaGeral) {
        this.notaGeral = notaGeral;
    }
    
    
}
