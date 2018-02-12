package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class JMenuFrame extends JFrame
{
	static boolean sobreVisible = false;
	private JPanel contentPane;
	private JButton btnInicia;
	private JButton btnSobre;
	private JButton btnSair;
	private JLabel lblTituloMenu;
	@SuppressWarnings("unused")
	private JInsereFrame frameIma;
	@SuppressWarnings("unused")
	private JInsereNumberFrame frameNum;

	public JMenuFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(JMenuFrame.class.getResource("/com/sun/java/swing/plaf/windows/icons/HomeFolder.gif")));
		setVisible(true);
		setResizable(false);
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblTituloMenu = new JLabel("  AN\u00C1LISE DE PERFORMANCE DE ALGORITMO DE ORDENA\u00C7\u00C3O DE DADOS");
		lblTituloMenu.setForeground(Color.RED);
		lblTituloMenu.setFont(new Font("Arial", Font.BOLD, 14));
		lblTituloMenu.setBounds(20, 11, 539, 27);
		contentPane.add(lblTituloMenu);

		btnInicia = new JButton("INICIAR");
		btnInicia.setFont(new Font("Arial", Font.BOLD, 14));
		btnInicia.setForeground(Color.BLUE);
		btnInicia.setBounds(213, 49, 136, 48);
		contentPane.add(btnInicia);
		btnInicia.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					int tipo = JOptionPane.showOptionDialog(null, "Escolha o tipo de manipulação", "Selecione", 0, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Imagem", "Número", "Cancelar"}, "Cencelar");

					if(tipo == -1)
						System.exit(0);

					else
						if(tipo == 0)
						{
							ImagemPadrao.insere();
							frameIma = new JInsereFrame();
						}

					else
						if(tipo == 1)
						{
							NumeroPadrao.insere();
							frameNum = new JInsereNumberFrame();
						}
					
					else
						System.exit(0);

					setVisible(false);
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnSobre = new JButton("SOBRE");
		btnSobre.setForeground(Color.BLUE);
		btnSobre.setFont(new Font("Arial", Font.BOLD, 14));
		btnSobre.setBounds(213, 118, 136, 48);
		contentPane.add(btnSobre);
		btnSobre.addActionListener(new ActionListener()
		{
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					JSobreFrame fSobre;

					if(!sobreVisible)
					{
						sobreVisible = true;
						fSobre = new JSobreFrame();
					}	
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnSair = new JButton("SAIR");
		btnSair.setForeground(Color.BLUE);
		btnSair.setFont(new Font("Arial", Font.BOLD, 14));
		btnSair.setBounds(213, 187, 136, 48);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
	}
}