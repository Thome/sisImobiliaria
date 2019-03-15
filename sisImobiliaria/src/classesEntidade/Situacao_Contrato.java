/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

/**
 *
 * @author welerson
 */
public enum Situacao_Contrato {
    EM_ABERTO(0), FECHADO(1), CANCELADO(2);
        
        private final int valor;

    private Situacao_Contrato(int val) {
        this.valor = val;
    }
    public int getValor(){
        return valor;
    }
}
