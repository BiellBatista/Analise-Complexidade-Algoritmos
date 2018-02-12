package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class JSobreFrame extends JFrame
{
	private JPanel contentPane;
	private JLabel lblEquipe;
	private JLabel lblBatista;
	private JLabel lblNeves;
	private JLabel lblMagnum;
	private JLabel lblCosta;
	private JButton btnVoltar;
	
	public JSobreFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(JSobreFrame.class.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		setType(Type.UTILITY);
		JMenuFrame.sobreVisible = true;
		setTitle("Equipe de Desenvolvimento");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEquipe = new JLabel("DESENVOLVEDORES");
		lblEquipe.setForeground(Color.RED);
		lblEquipe.setFont(new Font("Arial", Font.BOLD, 14));
		lblEquipe.setBounds(148, 11, 152, 20);
		contentPane.add(lblEquipe);
		
		lblBatista = new JLabel("Gabriel de Almeida Batista");
		lblBatista.setFont(new Font("Arial", Font.BOLD, 14));
		lblBatista.setBounds(123, 42, 232, 33);
		contentPane.add(lblBatista);
		
		lblNeves = new JLabel("Felipe da Silva Borges Neves");
		lblNeves.setFont(new Font("Arial", Font.BOLD, 14));
		lblNeves.setBounds(123, 71, 232, 33);
		contentPane.add(lblNeves);
		
		lblMagnum = new JLabel("Cesar Magnun Oliveira");
		lblMagnum.setFont(new Font("Arial", Font.BOLD, 14));
		lblMagnum.setBounds(123, 100, 232, 33);
		contentPane.add(lblMagnum);
		
		lblCosta = new JLabel("Jos\u00E9 Vitor Zanoni da Costa");
		lblCosta.setFont(new Font("Arial", Font.BOLD, 14));
		lblCosta.setBounds(123, 129, 232, 33);
		contentPane.add(lblCosta);
		
		btnVoltar = new JButton("VOLTAR");
		btnVoltar.setForeground(Color.BLUE);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 14));
		btnVoltar.setBounds(162, 173, 116, 46);
		contentPane.add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				JMenuFrame.sobreVisible = false;
				setVisible(false);
			}
		});
	}
}