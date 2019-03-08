/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Izaqueu
 */
@Entity
public class Contrato_Aluguel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    private float valorAluguel;
    private String descricaoAluguel;
    private String dataFechamento;
    private String dataInicio;
    private String dataFim;
    private Situacao_Contrato situacao_contrato;
    
    
    /* TALVEZ SEJA MELHOR COLOCAR SITUACAO_IMOVEL COMO TABELA
    @ManyToOne
    private Situacao_Contrato situacaoContrato;
    */
    
    @ManyToOne
    private Locatario locatario;
    
    @ManyToOne
    private Corretor corretor;    
    
    @ManyToOne
    private Imovel imovel;

    public Contrato_Aluguel() {
    }

    public Contrato_Aluguel(float valorAluguel, String descricaoAluguel, String dataFechamento, String dataInicio, String dataFim) {
        this.valorAluguel = valorAluguel;
        this.descricaoAluguel = descricaoAluguel;
        this.dataFechamento = dataFechamento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setDescricaoAluguel(String descricaoAluguel) {
        this.descricaoAluguel = descricaoAluguel;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    
    
    public int getIdContrato() {
        return idContrato;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public String getDescricaoAluguel() {
        return descricaoAluguel;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Situacao_Contrato getSituacao_contrato() {
        return situacao_contrato;
    }

    public void setSituacao_contrato(Situacao_Contrato situacao_contrato) {
        this.situacao_contrato = situacao_contrato;
    }
    
     //O objeto é a ser tratado nas func abaixo é próprio contrato (this)

    public void abrirContrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void alterarContratoEmAberto() {
        // Fazer condição para saber se o contrato está em aberto para assim alterar no banco de dados.        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Contrato_Aluguel> getTodosContratos(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Contrato_Aluguel consultarContrato(int idContrato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Contrato_Aluguel> getContratosVigentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
