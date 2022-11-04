package questao1;

public class DistribuicaoAlimento extends Projeto {
	  

    private String descAlimento; 
    private float qtde;
    
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String datainicio;
    private String datafim;
    
  
    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

   
    
    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    } 

    public boolean validaProjeto(){
        if(this.datafim == ""){
            return false;
        } else{
            return true;
        }   
    }

    public String imprimeProjeto(){
        return "Projeto [nomeProjeto=" + nomeProjeto + ", descricao=" + descricao + ", endereco=" + endereco
                + ", datainicio=" + datainicio + ", datafim=" + datafim + "]";
    }
    
    
}