package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JInsereNumberFrame extends JFrame
{
	private JPanel contentPane;
	private JTextField textFieldNumero;
	@SuppressWarnings("rawtypes")
	private JList listNumber;
	private JButton btnCarregar;
	private JButton btnContinuar;
	private JButton btnSair;
	private JLabel lblListaPadro;
	private JButton btnAleatrio;
	private JLabel lblNmero;
	private JScrollPane scrollPane;
	@SuppressWarnings("unused")
	private JOrdenaNumberFrame frame;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JInsereNumberFrame()
	{
		setTitle("Insere um n\u00FAmero");
		setResizable(false);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JInsereNumberFrame.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblListaPadro = new JLabel("  Lista padr\u00E3o de n\u00FAmeros do programa");
		lblListaPadro.setForeground(Color.RED);
		lblListaPadro.setFont(new Font("Arial", Font.BOLD, 22));
		lblListaPadro.setBounds(10, 11, 414, 26);
		contentPane.add(lblListaPadro);
		
		listNumber = new JList(Sort.dadosNum());

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 274, 202);
		scrollPane.setViewportView(listNumber);
		contentPane.add(scrollPane);
		
		lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Arial", Font.BOLD, 14));
		lblNmero.setBounds(294, 69, 63, 18);
		contentPane.add(lblNmero);
		
		contentPane.add(getTxtNumber());
		textFieldNumero.setColumns(10);
		
		btnCarregar = new JButton("Carregar");
		btnCarregar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCarregar.setBounds(294, 125, 130, 23);
		contentPane.add(btnCarregar);
		btnCarregar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					Insere.insere(Integer.parseInt(getTxtNumber().getText()));
					getTxtNumber().setText("");
				}
				
				catch(NumberFormatException nbe)
				{
					JOptionPane.showMessageDialog(null, "Digite apenas números", "NumberFormatException", JOptionPane.ERROR_MESSAGE);
					getTxtNumber().setText("");
				}
			}
		});
		
		btnAleatrio = new JButton("Aleat\u00F3rio");
		btnAleatrio.setFont(new Font("Arial", Font.BOLD, 14));
		btnAleatrio.setBounds(294, 159, 130, 23);
		contentPane.add(btnAleatrio);
		btnAleatrio.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Insere.insere((int)Math.ceil(Math.random()*999999999));
			}
		});
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 14));
		btnContinuar.setBounds(294, 193, 130, 23);
		contentPane.add(btnContinuar);
		btnContinuar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						try
						{
							frame = new JOrdenaNumberFrame();
							setVisible(false);
						} 
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.BOLD, 14));
		btnSair.setBounds(294, 227, 130, 23);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
	}
	
	private JTextField getTxtNumber()
	{
		if(textFieldNumero == null)
		{
			textFieldNumero = new JTextField();
			textFieldNumero.setBounds(361, 67, 63, 20);
		}
		
		return textFieldNumero;
	}
}