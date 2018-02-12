package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class SelectSort extends Sort
{
	private static int out;
	private static int in;
	private static int min;
	private static long count;
	
	public static void selectSortIma()
	{	
		for(out = 0; out < getnElemsIma(); out++)
		{
			min = out;
			
			for(in = out + 1; in < getnElemsIma(); in++)
			{
				if(getArrayIma(min).getWidth() > getArrayIma(in).getWidth())
					min = in;
				
				++count;
			}
			
			swapIma(out, min);
			++count;
		}
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Select Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
	
	public static void selectSortInt()
	{	
		for(out = 0; out < getnElemsInt(); out++)
		{
			min = out;
			
			for(in = out + 1; in < getnElemsInt(); in++)
			{
				if(getArrayInt(min) > getArrayInt(in))
					min = in;
				
				++count;
			}
			
			swapInt(out, min);
			++count;
		}
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Select Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
}