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

public class Usabilidad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	float prom=-1;
	static JTextField textField;
	static JTextField textField_1;
	public static final Color DARK_YELLOW = new Color(255,204,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usabilidad frame = new Usabilidad();
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
	public Usabilidad() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblUsabilidad.setBounds(143, 11, 169, 28);
		contentPane.add(lblUsabilidad);
		
		JLabel lblEntendido = new JLabel("Capacidad de ser entendido");
		lblEntendido.setBounds(32, 66, 180, 14);
		contentPane.add(lblEntendido);
		
		JLabel lblAprendido = new JLabel("Capacidad de ser aprendido");
		lblAprendido.setBounds(32, 101, 209, 14);
		contentPane.add(lblAprendido);
		
		JLabel lblAtractivo = new JLabel("Atractivo");
		lblAtractivo.setBounds(32, 136, 75, 14);
		contentPane.add(lblAtractivo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(222, 63, 49, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_1.setBounds(222, 98, 49, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_2.setBounds(222, 133, 49, 20);
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
		
		JButton btnCancelar = new JButton("Atras");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fiabilidad fia = new Fiabilidad();
				fia.setVisible(true);
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
				prom=(float)((valor1+valor2+valor3)/(float)3);
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
					Eficiencia efia = new Eficiencia();
					Eficiencia.textField.setText(textField.getText());
					Eficiencia.textField_1.setText(textField_1.getText());
					Eficiencia.textField_2.setText(""+prom);
					efia.setVisible(true);
					dispose();
				}	
			}
		});
		btnSiguiente.setBounds(308, 276, 89, 23);
		contentPane.add(btnSiguiente);
		
		textField = new JTextField();
		textField.setBounds(222, 173, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 204, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
	}

}
