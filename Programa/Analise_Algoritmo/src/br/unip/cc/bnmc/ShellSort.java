package br.unip.cc.bnmc;

public class ShellSort extends Sort
{
	public static void shellSortIma()
	{
		int inner, outer;
		Imagem temp;

		int h = 1; ///valor inicial de h;

		while(h <= getnElemsIma() / 3)
			h = h * 3 + 1; //(1, 4, 13, 40, 121, ...)

		while(h > 0) //diminuindo h até 1
		{
			for(outer = h; outer < getnElemsIma(); outer++) //ordena em h o arquivo
			{
				temp = getArrayIma(outer);
				inner = outer;
				//uma passagem (ex 0, 4, 8)
				while(inner > h - 1 && getArrayIma(inner - h).getWidth() >= temp.getWidth())
				{
					setArrayIma(getArrayIma(inner - h), inner);
					inner -= h;
				}
				
				setArrayIma(temp, inner);
			}

			h = (h - 1) / 3;	//diminui h
		}
	}
	
	public static void shellSortInt()
	{
		int inner, outer, temp;

		int h = 1; ///valor inicial de h;

		while(h <= getnElemsInt() / 3)
			h = h * 3 + 1; //(1, 4, 13, 40, 121, ...)

		while(h > 0) //diminuindo h até 1
		{
			for(outer = h; outer < getnElemsInt(); outer++) //ordena em h o arquivo
			{
				temp = getArrayInt(outer);
				inner = outer;
				//uma passagem (ex 0, 4, 8)
				while(inner > h - 1 && getArrayInt(inner - h) >= temp)
				{
					setArrayInt(getArrayInt(inner - h), inner);
					inner -= h;
				}
				
				setArrayInt(temp, inner);
			}

			h = (h - 1) / 3;	//diminui h
		}
	}
}