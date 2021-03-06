package classesControle;
import classesEntidade.Corretor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alline
 */
public class ControleCorretor {
    
    public Corretor corretor = new Corretor();
        
    public ControleCorretor(){  
        corretor = new Corretor();
    }
    
  /**
   * 
   * @param CRECI
   * @param CPF
   * @param senha
   * @param nomeCompleto
   * @param telefone
   * @param email 
   * return void
   */  
  void cadastrarCorretor (String CRECI, String CPF, String senha, String nomeCompleto, String telefone, String email)
  {
      corretor = new Corretor();      
      
      corretor.setCreci (CRECI);
      corretor.setCpf (CPF);
      corretor.setSenha (senha);
      corretor.setNomeCompleto (nomeCompleto);
      corretor.setTelefone (telefone);
      corretor.setEmail (email);
      
       try {
            corretor.cadastrarCorretor(corretor);
            //Mensagem de Adm cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }        
    }
      
    public boolean cadastrarCorretor(Corretor corretor){        
        return corretor.cadastrarCorretor(corretor);                
    }
       
        
  /***
   * 
   * @param novoCRECI
   * @param novoCPF
   * @param novaSenha
   * @param novoNomeCompleto
   * @param novoTelefone
   * @param novoEmail 
   */
  
  //DEVE EDITAR E N CADASTRAR, CONSERTAR
  public void editarCorretor (String novoCRECI, String novoCPF, String novaSenha, String novoNomeCompleto, String novoTelefone, String novoEmail)
  {
      corretor = new Corretor();
      
      
      corretor.setCreci (novoCRECI);
      corretor.setCpf (novoCPF);
      corretor.setSenha (novaSenha);
      corretor.setNomeCompleto (novoNomeCompleto);
      corretor.setTelefone (novoTelefone);
      corretor.setEmail (novoEmail);
      
       
        try {
            //corretor.cadastrarCorretor(corretor);
            //Mensagem de corretor cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
         
  }
  
  
   public void excluirCorretor(){  
        corretor = new Corretor();
    }  
   
    public boolean fazerLogin(String creci, String senha){
        
        Corretor corretor = new Corretor();        
        corretor = corretor.buscarCorretor(creci);
        
        if(corretor != null)
            if(creci.equals(corretor.getCreci()) && senha.equals(corretor.getSenha())){
                return true;
            }else{
                return false;
            }
        else
            return false;
      }
}

