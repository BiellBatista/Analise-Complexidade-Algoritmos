package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class Insere
{
	private static Sort sortNew = new Sort();
	private static Arquivo fileNew;
	
	public Insere()
	{
		sortNew = null;
		fileNew = null;
	}
	
	public static void insere(Imagem nova)
	{
		String nome = JOptionPane.showInputDialog(null, "Digite o nome da imagem", "Nome", JOptionPane.PLAIN_MESSAGE);
		
		if(nome != null)
			sortNew.insert(nova, nome);
	}
	
	public static void insere(int value)
	{
		sortNew.insert(value);
	}
	
	public static void insere(Imagem nova, String nome)
	{
		sortNew.insert(nova, nome);
	}

	@SuppressWarnings("static-access")
	public void display()
	{
		for(int i = 0; i < 5; i++)
			System.out.println(sortNew.getArrayIma(i).getWidth());
	}

	public static void start()
	{
		try
		{
			fileNew = new Arquivo();
			fileNew.buscar();
			
			Imagem nova = new Imagem(fileNew.getCaminho());
			
			if(!fileNew.getCaminho().equals(null))
				insere(nova);
		}

		catch(NullPointerException npe)
		{
			;
		}
		catch (EDadoInvalido e)
		{
			;
		}
	}
}