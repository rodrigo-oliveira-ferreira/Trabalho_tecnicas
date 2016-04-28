/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Heitor Lopes
 */
public class Estoque {
    
    private int codigo;
    private String loja;
    
    public Estoque(int codigo, String loja){
        this.codigo = codigo;
        this.loja = loja;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the loja
     */
    public String getLoja() {
        return loja;
    }

    /**
     * @param loja the loja to set
     */
    public void setLoja(String loja) {
        this.loja = loja;
    }
    
}
