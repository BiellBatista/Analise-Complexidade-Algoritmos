package br.unip.cc.bnmc;

public class NumeroPadrao
{
	public static void insere()
	{
		for(int i = 0; i < 5000000; i++)
			Insere.insere(((int)Math.ceil(Math.random()*10000000)));
	}
}