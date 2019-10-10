package algCalidad;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionalidad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private float prom=-1;
	public static final Color DARK_YELLOW = new Color(255,204,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionalidad frame = new Funcionalidad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Funcionalidad() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncionalidad = new JLabel("Funcionalidad");
		lblFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblFuncionalidad.setBounds(125, 11, 169, 28);
		contentPane.add(lblFuncionalidad);
		
		JLabel lblExactitud = new JLabel("Exactitud");
		lblExactitud.setBounds(32, 66, 75, 14);
		contentPane.add(lblExactitud);
		
		JLabel lblInteroperacion = new JLabel("Inter-operacion");
		lblInteroperacion.setBounds(32, 101, 116, 14);
		contentPane.add(lblInteroperacion);
		
		JLabel lblSeguridad = new JLabel("Seguridad");
		lblSeguridad.setBounds(32, 136, 75, 14);
		contentPane.add(lblSeguridad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(125, 63, 49, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_1.setBounds(125, 98, 49, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_2.setBounds(125, 133, 49, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(32, 218, 75, 14);
		contentPane.add(lblPromedio);
		
		JLabel label = new JLabel("");
		label.setBounds(102, 218, 46, 14);
		contentPane.add(label);
		
		JLabel lblEvaluacion = new JLabel("Evaluacion:");
		lblEvaluacion.setBounds(32, 243, 67, 14);
		contentPane.add(lblEvaluacion);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(99, 243, 75, 14);
		contentPane.add(label_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(32, 276, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor1,valor2,valor3;
				String resultado;
				valor1=Integer.parseInt(comboBox.getSelectedItem().toString());
				valor2=Integer.parseInt(comboBox_1.getSelectedItem().toString());
				valor3=Integer.parseInt(comboBox_2.getSelectedItem().toString());
				prom=(valor1+valor2+valor3)/(float)3;
				resultado=String.format("%.2f", prom);
				label.setText("" + resultado);
				Utilitaria util = new Utilitaria();
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					label_1.setText(resultado);
					label_1.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						label_1.setText(resultado);
						label_1.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							label_1.setText(resultado);
							label_1.setForeground(DARK_YELLOW);
						}
						else
						{
							label_1.setText(resultado);
							label_1.setForeground(Color.RED);
						}
					}
				}
			}
		});
		btnEvaluar.setBounds(32, 172, 89, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(prom==-1)
					JOptionPane.showMessageDialog(null,"Por favor evalue la caracteristica");
				else
				{
					Fiabilidad fia = new Fiabilidad();
					Fiabilidad.textField.setText(""+prom);
					fia.setVisible(true);
					dispose();
				}	
			}
		});
		btnSiguiente.setBounds(308, 276, 89, 23);
		contentPane.add(btnSiguiente);
	}
}
