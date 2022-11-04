package questao1;

public class TrabalhoVoluntario extends Projeto{
    private String Trabalho; 
    private int duracaoTrabalho;

    
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String datainicio;
    private String datafim;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String trabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        Trabalho = trabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTrabalho() {
        return Trabalho;
    }

    public void setTrabalho(String trabalho) {
        Trabalho = trabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(){
        if(duracaoTrabalho > 2)
        return true;
        else
        return false;

    }

    public String imprimeProjeto(){
        return "Projeto [nomeProjeto=" + nomeProjeto + ", descricao=" + descricao + ", endereco=" + endereco
        + ", datainicio=" + datainicio + ", datafim=" + datafim + "]";
    
    }

    
    

}