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

public class Fiabilidad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTextField textField;
	float prom=-1;
	public static final Color DARK_YELLOW = new Color(255,204,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fiabilidad frame = new Fiabilidad();
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
	public Fiabilidad() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblFiabilidad.setBounds(125, 11, 169, 28);
		contentPane.add(lblFiabilidad);
		
		JLabel lblCapacidad = new JLabel("Capacidad de recuperacion");
		lblCapacidad.setBounds(32, 66, 186, 14);
		contentPane.add(lblCapacidad);
		
		JLabel lblTolerancia = new JLabel("Tolerancia a fallos");
		lblTolerancia.setBounds(32, 101, 116, 14);
		contentPane.add(lblTolerancia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(193, 63, 49, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_1.setBounds(193, 98, 49, 20);
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
					Usabilidad usa = new Usabilidad();
					Usabilidad.textField.setText(textField.getText());
					Usabilidad.textField_1.setText(""+prom);
					usa.setVisible(true);
					dispose();
				}	
			}
		});
		btnSiguiente.setBounds(307, 256, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionalidad f1 = new Funcionalidad();
				f1.setVisible(true);
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
				prom=((valor1+valor2)/(float)2);
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
		textField.setBounds(252, 141, 1, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
	}
}
