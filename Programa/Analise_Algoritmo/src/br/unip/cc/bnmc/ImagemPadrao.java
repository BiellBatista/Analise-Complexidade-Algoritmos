package br.unip.cc.bnmc;

public class ImagemPadrao
{
	private static Imagem imagem;
	
	public static void insere()
	{
		for(int i = 1; i <= 480; i++)
		{
			imagem = new Imagem("res\\apsJAVA (" + i + ").jpg");
			
			if(i > 0 && i < 10)
				Insere.insere(imagem, "APS JAVA (0000" + i + ")");
			
			else 
				if(i > 9 && i < 100)
				Insere.insere(imagem, "APS JAVA (000" + i + ")");
			
			else
				Insere.insere(imagem, "APS JAVA (00" + i + ")");
		}
	}
}