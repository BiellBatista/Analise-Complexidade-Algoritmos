package br.unip.cc.bnmc;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Sort
{
	private int nElems;
	private static ArrayList<Imagem> theArrayIm;
	private static ArrayList<Integer> theArrayInt;
	
	public Sort()
	{
		theArrayIm = new  ArrayList<Imagem>();
		theArrayInt = new ArrayList<Integer>();
		nElems = 0;
	}
	
	public void insert(Imagem value, String nome)
	{
		theArrayIm.add(value);
		theArrayIm.get(nElems).setNome(nome);
		nElems++;
	}
	
	public void insert(int value)
	{
		theArrayInt.add(value);
		nElems++;
	}
	
	public static void setArrayIma(Imagem value, int in)
	{
		theArrayIm.set(in, value);
	}
	
	public static void setArrayInt(int value, int in)
	{
		theArrayInt.set(in, value);
	}
	
	public static void swapIma(int dex1, int dex2)
	{
		Imagem temp = theArrayIm.get(dex1);
		theArrayIm.set(dex1, theArrayIm.get(dex2));
		theArrayIm.set(dex2, temp);
	}
	
	public static void swapInt(int dex1, int dex2)
	{
		int temp = theArrayInt.get(dex1);
		theArrayInt.set(dex1, theArrayInt.get(dex2));
		theArrayInt.set(dex2, temp);
	}
	
	public static int getnElemsIma()
	{
		return theArrayIm.size();
	}
	
	public static int getnElemsInt()
	{
		return theArrayInt.size();
	}
	
	public static Imagem getArrayIma(int in)
	{
		return theArrayIm.get(in);
	}
	
	public static int getArrayInt(int in)
	{
		return theArrayInt.get(in);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static DefaultListModel dadosIma()
	{
		DefaultListModel DLM = new DefaultListModel();
		
		for(int i = 0; i < theArrayIm.size(); i++)
			DLM.addElement(theArrayIm.get(i).getNome() + "                       " + theArrayIm.get(i).getWidth() + "            " + theArrayIm.get(i).getHeight());
		
		return DLM;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static DefaultListModel dadosNum()
	{
		DefaultListModel DLM = new DefaultListModel();
		
		for(int i = 0; i < theArrayInt.size(); i++)
			DLM.addElement(theArrayInt.get(i));
		
		return DLM;
	}
}