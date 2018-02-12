package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class ShakeSort extends Sort
{
	private static int out;
	private static int in;
	private static long count;

	public static void shakeSortIma()
	{
		int k = 0, r = 0;

		out = 1;  
		r = k = getnElemsIma() - 1;
		
		do
		{
			for(in = r; in >= out; in--)
			{
				if(getArrayIma(in - 1).getWidth() > getArrayIma(in).getWidth())
				{
					swapIma(in - 1, in);
					k = in;
				}
				
				++count;
			}

			out = k + 1;
			
			for(in = out; in <= r; in++)
			{
				if(getArrayIma(in - 1).getWidth() > getArrayIma(in).getWidth())
				{
					swapIma(in - 1, in);
					k = in;
				}
				
				++count;
			}

			r = k - 1;
			++count;
		} while (out <= r);
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Shake Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
	
	public static void shakeSortInt()
	{
		int k = 0, r = 0;

		out = 1;  
		r = k = getnElemsInt() - 1;
		
		do
		{
			for(in = r; in >= out; in--)
			{
				if(getArrayInt(in - 1) > getArrayInt(in))
				{
					swapInt(in - 1, in);
					k = in;
				}
				
				++count;
			}

			out = k + 1;
			
			for(in = out; in <= r; in++)
			{
				if(getArrayInt(in - 1) > getArrayInt(in))
				{
					swapInt(in - 1, in);
					k = in;
				}
				
				++count;
			}

			r = k - 1;
			++count;
		} while(out <= r);
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Shake Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
}