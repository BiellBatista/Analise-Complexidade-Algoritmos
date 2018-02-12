package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class JInsereFrame extends JFrame
{
	private JPanel contentPane;
	private JLabel lblImagensCarregadasPelo;
	@SuppressWarnings("rawtypes")
	private JList listImage;
	private JScrollPane scrollPane;
	private JButton btnCancelar;
	private JButton btnContinuar;
	private JButton btnSelecionarArquivo;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JInsereFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(JInsereFrame.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
		setTitle("Insere uma Imagem");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		lblImagensCarregadasPelo = new JLabel("Lista padr\u00E3o de imagens do programa");
		lblImagensCarregadasPelo.setForeground(Color.RED);
		lblImagensCarregadasPelo.setFont(new Font("Arial", Font.BOLD, 22));
		lblImagensCarregadasPelo.setBounds(102, 11, 392, 23);
		contentPane.add(lblImagensCarregadasPelo);
		
		listImage = new JList(Sort.dadosIma());
		
		scrollPane = new JScrollPane(listImage);
		scrollPane.setBounds(10, 59, 553, 150);
		contentPane.add(scrollPane);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancelar.setBounds(10, 242, 121, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 14));
		btnContinuar.setBounds(228, 242, 121, 23);
		contentPane.add(btnContinuar);
		btnContinuar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					@SuppressWarnings("unused")
					JOrdenaFrame frame = new JOrdenaFrame();
					setVisible(false);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnSelecionarArquivo = new JButton("Carregar");
		btnSelecionarArquivo.setFont(new Font("Arial", Font.BOLD, 14));
		btnSelecionarArquivo.setBounds(442, 242, 121, 23);
		contentPane.add(btnSelecionarArquivo);
		btnSelecionarArquivo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Insere.start();
			}
		});
	}
}