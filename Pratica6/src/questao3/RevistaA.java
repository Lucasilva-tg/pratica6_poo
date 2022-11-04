package questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RevistaA {

	public static void main(String[] args) {
		
		int numero, volume, tiragem;
		String dataEdicao;
		
		String tituloRevista;
		long inss;
		String periodiocidade;
		String titulo, resumo, autores;
		
		tituloRevista=JOptionPane.showInputDialog("Titulo da resvista");
		inss=Long.parseLong(JOptionPane.showInputDialog("INSS"));
		periodiocidade=JOptionPane.showInputDialog("periodiocidade");
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("peridiocidade"));
		volume=Integer.parseInt(JOptionPane.showInputDialog("peridiocidade"));
		tiragem=Integer.parseInt(JOptionPane.showInputDialog("peridiocidade"));
		dataEdicao=JOptionPane.showInputDialog("peridiocidade");
		
		Edicao ed1 = new Edicao(numero, volume, dataEdicao, tiragem);
		RevistaCientifica revista1 = new RevistaCientifica(tituloRevista,inss,periodiocidade);
		
		ArrayList<Artigo> artigos = new ArrayList<>();
		for (int i=0; i<10; i++)
		{
			
			titulo=JOptionPane.showInputDialog("Digite titulo do artigo");
			resumo=JOptionPane.showInputDialog("Resumo");
			autores=JOptionPane.showInputDialog("Autores");
			artigos.add(new Artigo(titulo, resumo,autores));
			ed1.adicionaArtigos(artigos.get(i));
			
			
		}
		
		
	}
	
}
