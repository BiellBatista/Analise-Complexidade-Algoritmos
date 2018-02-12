package br.unip.cc.bnmc;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;

public class Arquivo
{
	private String caminho;
	
	public String getCaminho()
	{
		return caminho;
	}
	
	public void setCaminho(String caminho)
	{
		this.caminho = caminho;
	}
	
	public void buscar() throws EDadoInvalido
	{
		//Implementa os tipos de arquivos
		FileNameExtensionFilter fileNameExtensionFilter = 
				new FileNameExtensionFilter("png", "jpg", "gif", "tiff", "bmp", "jpeg");
		
		//Instansiando o selecionador de arquivos
		JFileChooser fc = new JFileChooser();
		
		//Adicionando os arquivos que poderam ser selecionados
		fc.setFileFilter(fileNameExtensionFilter);
		
		//Nome da tela localizadora de arquivos
		fc.setDialogTitle("Escolha uma imagem");
		
		//Recebe uma resposta da jenale caso algum evento do localizador de arquivo seja acessado
		int resposta = fc.showOpenDialog(null);
		
		//Verifica se a resposta é igual a ok 
		if (resposta == JFileChooser.CANCEL_OPTION)
			;
		
		else
			if(resposta == JFileChooser.APPROVE_OPTION)
				setCaminho(fc.getSelectedFile().getAbsolutePath());
	}
}