package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JOrdenaFrame extends JFrame
{
	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	private JList listImage;
	private JScrollPane scrollPane;
	private JButton btnBubblesort;
	private JButton btnShakeSort;
	private JButton btnSelectsort;
	private JButton btnInsertsort;
	private JButton btnMergesort;
	private JButton btnShellsort;
	private JButton btnQuicksort;
	private JButton btnHeapsort;
	private JButton btnSair;
	@SuppressWarnings("unused")
	private JOrdenadoFrame frame;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JOrdenaFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(JOrdenaFrame.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		setTitle("Ordenar Imagens");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listImage = new JList(Sort.dadosIma());
		
		scrollPane = new JScrollPane(listImage);
		scrollPane.setBounds(10, 11, 397, 229);
		contentPane.add(scrollPane);

		btnBubblesort = new JButton("Bubble Sort");
		btnBubblesort.setFont(new Font("Arial", Font.BOLD, 14));
		btnBubblesort.setBounds(417, 11, 121, 23);
		contentPane.add(btnBubblesort);
		btnBubblesort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					BubbleSort.bubbleSortIma();
					frame = new JOrdenadoFrame("Bubble Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnSelectsort = new JButton("Select Sort");
		btnSelectsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnSelectsort.setBounds(417, 47, 121, 23);
		contentPane.add(btnSelectsort);
		btnSelectsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					SelectSort.selectSortIma();
					frame = new JOrdenadoFrame("Select Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnInsertsort = new JButton("Insert Sort");
		btnInsertsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnInsertsort.setBounds(417, 81, 121, 23);
		contentPane.add(btnInsertsort);
		btnInsertsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					InsertSort.insertSortIma();
					frame = new JOrdenadoFrame("Insert Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnMergesort = new JButton("Merge Sort");
		btnMergesort.setFont(new Font("Arial", Font.BOLD, 14));
		btnMergesort.setBounds(417, 115, 121, 23);
		contentPane.add(btnMergesort);
		btnMergesort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					MergeSort.mergeSortIma();
					frame = new JOrdenadoFrame("Merge Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnShellsort = new JButton("Shell Sort");
		btnShellsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnShellsort.setBounds(417, 149, 121, 23);
		contentPane.add(btnShellsort);
		btnShellsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					ShellSort.shellSortIma();
					frame = new JOrdenadoFrame("Shell Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnQuicksort = new JButton("Quick Sort");
		btnQuicksort.setFont(new Font("Arial", Font.BOLD, 14));
		btnQuicksort.setBounds(417, 183, 121, 23);
		contentPane.add(btnQuicksort);
		btnQuicksort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					QuickSort.quickSortIma();
					frame = new JOrdenadoFrame("Quick Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.BOLD, 14));
		btnSair.setBounds(417, 217, 121, 23);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		
		btnShakeSort = new JButton("Shake Sort");
		btnShakeSort.setFont(new Font("Arial", Font.BOLD, 14));
		btnShakeSort.setBounds(548, 11, 121, 23);
		contentPane.add(btnShakeSort);
		btnShakeSort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					ShakeSort.shakeSortIma();
					frame = new JOrdenadoFrame("Shake Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnHeapsort = new JButton("Heap Sort");
		btnHeapsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnHeapsort.setBounds(549, 47, 121, 23);
		contentPane.add(btnHeapsort);
		btnHeapsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					HeapSort.heapSortIma();
					frame = new JOrdenadoFrame("Heap Sort");
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}