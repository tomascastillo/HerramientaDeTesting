package algCalidad;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Portabilidad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	float prom=-1;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;
	public static final Color DARK_YELLOW = new Color(255,204,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portabilidad frame = new Portabilidad();
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
	public Portabilidad() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPortabilidad.setBounds(125, 11, 169, 28);
		contentPane.add(lblPortabilidad);
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad");
		lblAdaptabilidad.setBounds(32, 66, 96, 14);
		contentPane.add(lblAdaptabilidad);
		
		JLabel lblInstabilidad = new JLabel("Instabilidad");
		lblInstabilidad.setBounds(32, 101, 116, 14);
		contentPane.add(lblInstabilidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(128, 63, 49, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_1.setBounds(125, 98, 49, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(32, 185, 75, 14);
		contentPane.add(lblPromedio);
		
		JLabel label = new JLabel("");
		label.setBounds(102, 185, 46, 14);
		contentPane.add(label);
		
		JLabel lblEvaluacion = new JLabel("Evaluacion:");
		lblEvaluacion.setBounds(32, 218, 67, 14);
		contentPane.add(lblEvaluacion);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(102, 218, 75, 14);
		contentPane.add(label_1);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(prom==-1)
					JOptionPane.showMessageDialog(null,"Por favor evalue la caracteristica");
				else
				{
					EvaluacionFinal evfin = new EvaluacionFinal();
					EvaluacionFinal.textField.setText(textField.getText());
					EvaluacionFinal.textField_1.setText(textField_1.getText());
					EvaluacionFinal.textField_2.setText(textField_2.getText());
					EvaluacionFinal.textField_3.setText(textField_3.getText());
					EvaluacionFinal.textField_4.setText(textField_4.getText());
					EvaluacionFinal.textField_5.setText(""+prom);
					evfin.setVisible(true);
					dispose();
				}	
			}
		});
		btnSiguiente.setBounds(307, 256, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mantenibilidad man = new Mantenibilidad();
				man.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(32, 256, 89, 23);
		contentPane.add(btnAtras);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor1,valor2;
				String resultado;
				valor1=Integer.parseInt(comboBox.getSelectedItem().toString());
				valor2=Integer.parseInt(comboBox_1.getSelectedItem().toString());
				prom=(float)((valor1+valor2)/(float)2);
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
		btnEvaluar.setBounds(32, 140, 89, 23);
		contentPane.add(btnEvaluar);
		
		textField = new JTextField();
		textField.setBounds(238, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 98, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(238, 141, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setBounds(211, 172, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setBounds(187, 215, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(false);
	}

}
