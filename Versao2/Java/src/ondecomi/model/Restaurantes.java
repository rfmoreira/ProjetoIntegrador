/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.model;

/**
 *
 * @author Luan Amor
 */
public abstract class Restaurantes {
    private static int id = 0;
    protected int idRest;
    protected String nomeLocal;
    protected String endereco;
    protected float preco;
    protected float ambiente;
    protected float atendimento;
    protected float notaItens;
    protected float notaGeral;

    
    public Restaurantes(String nome, String end){
        this.nomeLocal = nome;
        this.endereco = end;
        this.preco = 0;
        this.ambiente = 0;
        this.notaGeral= 0;
        this.atendimento = 0;
        this.notaItens = 0;
        this.idRest = this.id;
    }
    
    
    
    
}
