package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

@SuppressWarnings({ "serial" })
public class JOrdenadoFrame extends JFrame
{
	private JPanel contentPane;
	private JScrollPane scrollPane;
	@SuppressWarnings("rawtypes")
	private JList listImage;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JOrdenadoFrame(String titulo)
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(JOrdenadoFrame.class.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		setTitle("Ordenado com " + titulo);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 437, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listImage = new JList(Sort.dadosIma());
		
		scrollPane = new JScrollPane(listImage);
		scrollPane.setBounds(30, 11, 356, 206);
		contentPane.add(scrollPane);
	}
}