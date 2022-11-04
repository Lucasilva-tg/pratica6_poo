package questao1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        
        String nomeProjeto;
        String descricao;
        String endereco;
        String datainicio;
        String datafim;

        int opcao; 

        Projeto projeto1;
        Projeto projeto2;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"<1>Cadastrar Projeto Trabalho Voluntario   \n<2> Cadastrar Projeto Distribuir Alimentos \n<3> Sair","Nossos Projetos",JOptionPane.PLAIN_MESSAGE));

           switch(opcao){
            case 1: 


            nomeProjeto = JOptionPane.showInputDialog(null, "nome do projeto: ");
            descricao = JOptionPane.showInputDialog(null, "descrição: ");
            endereco = JOptionPane.showInputDialog(null, "Endereço: ");
            datainicio = JOptionPane.showInputDialog(null, "Data Inicio: ");
            datafim = JOptionPane.showInputDialog(null, "Data Fim: ");
            
            
            projeto1 = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, datainicio, datafim, datafim, opcao);       
            

            JOptionPane.showMessageDialog(null,projeto1.validaProjeto()+"\n"+projeto1.imprimeProjeto(), "Sintese de projetos", JOptionPane.DEFAULT_OPTION);
            


            break; 

            case 2: 

            nomeProjeto = JOptionPane.showInputDialog(null, "nome do projeto: ");
            descricao = JOptionPane.showInputDialog(null, "descricao: ");
            endereco = JOptionPane.showInputDialog(null, "Endereço: ");
            datainicio = JOptionPane.showInputDialog(null, "Data Inicio: ");
            datafim = JOptionPane.showInputDialog(null, "Data Fim: ");
            
   
            projeto2 = new DistribuicaoAlimento(nomeProjeto, descricao, endereco, datainicio, datafim, datafim, opcao);       
            

            JOptionPane.showMessageDialog(null,projeto2.validaProjeto()+"\n"+projeto2.imprimeProjeto(), "Sintese de projetos", JOptionPane.DEFAULT_OPTION);

            break;
            case 3:
            break;

            default:

            JOptionPane.showMessageDialog(null, "Escolha a alternativa correta", "Mensagem",JOptionPane.NO_OPTION);


           }


        }while(opcao != 3);
        
    }
}