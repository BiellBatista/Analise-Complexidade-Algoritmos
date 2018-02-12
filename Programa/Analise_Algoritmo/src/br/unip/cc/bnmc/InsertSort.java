package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class InsertSort extends Sort
{
	private static int in;
	private static int out;
	private static long count;
	
	public static void insertSortIma()
	{
		for(out = 1; out < getnElemsIma(); out++)
		{
			Imagem temp = getArrayIma(out);
			in = out;
			
			while(in > 0 && getArrayIma(in - 1).getWidth() >= temp.getWidth())
			{
				setArrayIma(getArrayIma(in-1), in);
				--in;
				++count;
			}
			
			setArrayIma(temp, in);
			++count;
		}
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Insert Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
	
	public static void insertSortInt()
	{
		for(out = 1; out < getnElemsInt(); out++)
		{
			int temp = getArrayInt(out);
			in = out;
			
			while(in > 0 && getArrayInt(in - 1) >= temp)
			{
				setArrayInt(getArrayInt(in-1), in);
				--in;
				++count;
			}
			
			setArrayInt(temp, in);
			++count;
		}
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Insert Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
}