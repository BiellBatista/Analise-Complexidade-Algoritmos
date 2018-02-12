package br.unip.cc.bnmc;

import java.awt.Image;
import javax.swing.ImageIcon;;

public class Imagem
{
	private ImageIcon imageIcon;
	private Image image;
	private String nome;
	private int width;
	private int height;

	public Imagem()
	{
		this.imageIcon = null;
		this.image = null;
		this.nome = null;
		this.width = 0;
		this.height = 0;
	}

	public Imagem(String caminho)
	{
		this.imageIcon = null;
		this.image = null;
		this.nome = null;
		this.width = 0;
		this.height = 0;
		this.imageIcon = new ImageIcon(caminho);
		this.image = imageIcon.getImage();
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}
}