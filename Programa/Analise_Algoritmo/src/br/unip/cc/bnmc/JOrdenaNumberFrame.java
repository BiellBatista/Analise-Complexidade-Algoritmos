package br.unip.cc.bnmc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JOrdenaNumberFrame extends JFrame
{

	private JPanel contentPane;
	private JScrollPane scrollPane;
	@SuppressWarnings("rawtypes")
	private JList listNumberOrd;
	private JButton btnBubbleSort;
	private JButton btnShakeSort;
	private JButton btnSelectsort;
	private JButton btnInsertsort;
	private JButton btnMergesort;
	private JButton btnShellsort;
	private JButton btnQuicksort;
	private JButton btnHeapsort;
	private JButton btnSair;
	private int[] temp = new int[Sort.getnElemsInt()];
	@SuppressWarnings("unused")
	private JOrdenadoNumberFrame frame;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JOrdenaNumberFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(JOrdenaNumberFrame.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		setTitle("Ordenar n\u00FAmeros");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 278, 230);
		contentPane.add(scrollPane);
		
		listNumberOrd = new JList(Sort.dadosNum());
		scrollPane.setViewportView(listNumberOrd);
		
		for(int i = 0; i < Sort.getnElemsInt(); i++)
			temp[i] = Sort.getArrayInt(i);
			
		btnBubbleSort = new JButton("Bubble Sort");
		btnBubbleSort.setFont(new Font("Arial", Font.BOLD, 14));
		btnBubbleSort.setBounds(298, 11, 121, 23);
		contentPane.add(btnBubbleSort);
		btnBubbleSort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					BubbleSort.bubbleSortInt();	
					frame = new JOrdenadoNumberFrame("Bubble Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnSelectsort = new JButton("Select Sort");
		btnSelectsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnSelectsort.setBounds(298, 47, 121, 23);
		contentPane.add(btnSelectsort);
		btnSelectsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					SelectSort.selectSortInt();
					frame = new JOrdenadoNumberFrame("Select Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnInsertsort = new JButton("Insert Sort");
		btnInsertsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnInsertsort.setBounds(298, 81, 121, 23);
		contentPane.add(btnInsertsort);
		btnInsertsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					InsertSort.insertSortInt();
					frame = new JOrdenadoNumberFrame("Insert Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnMergesort = new JButton("Merge Sort");
		btnMergesort.setFont(new Font("Arial", Font.BOLD, 14));
		btnMergesort.setBounds(298, 115, 121, 23);
		contentPane.add(btnMergesort);
		btnMergesort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					MergeSort.mergeSortInt();
					frame = new JOrdenadoNumberFrame("Merge Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnShellsort = new JButton("Shell Sort");
		btnShellsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnShellsort.setBounds(298, 149, 121, 23);
		contentPane.add(btnShellsort);
		btnShellsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					ShellSort.shellSortInt();
					frame = new JOrdenadoNumberFrame("Shell Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnQuicksort = new JButton("Quick Sort");
		btnQuicksort.setFont(new Font("Arial", Font.BOLD, 14));
		btnQuicksort.setBounds(298, 183, 121, 23);
		contentPane.add(btnQuicksort);
		btnQuicksort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					QuickSort.quickSortInt();
					frame = new JOrdenadoNumberFrame("Quick Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.BOLD, 14));
		btnSair.setBounds(298, 217, 121, 23);
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
		btnShakeSort.setBounds(429, 11, 121, 23);
		contentPane.add(btnShakeSort);
		btnShakeSort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					ShakeSort.shakeSortInt();
					frame = new JOrdenadoNumberFrame("Shake Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnHeapsort = new JButton("Heap Sort");
		btnHeapsort.setFont(new Font("Arial", Font.BOLD, 14));
		btnHeapsort.setBounds(429, 47, 121, 23);
		contentPane.add(btnHeapsort);
		btnHeapsort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					HeapSort.heapSortInt();
					frame = new JOrdenadoNumberFrame("Heap Sort");
					
					volta();
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public void volta()
	{
		for(int i = 0; i < Sort.getnElemsInt(); i++)
			Sort.setArrayInt(temp[i], i);
	}
}