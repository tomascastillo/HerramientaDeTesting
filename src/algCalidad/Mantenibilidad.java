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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Mantenibilidad extends JFrame {

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
	public static final Color DARK_YELLOW = new Color(255,204,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenibilidad frame = new Mantenibilidad();
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
	public Mantenibilidad() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblMantenibilidad.setBounds(122, 11, 200, 28);
		contentPane.add(lblMantenibilidad);
		
		JLabel lblAnalizado = new JLabel("Capacidad de ser analizado");
		lblAnalizado.setBounds(32, 66, 180, 14);
		contentPane.add(lblAnalizado);
		
		JLabel lblProbado = new JLabel("Capacidad de ser probado");
		lblProbado.setBounds(32, 101, 209, 14);
		contentPane.add(lblProbado);
		
		JLabel lblCambiado = new JLabel("Capacidad de ser cambiado");
		lblCambiado.setBounds(32, 136, 180, 14);
		contentPane.add(lblCambiado);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad");
		lblEstabilidad.setBounds(32, 172, 89, 14);
		contentPane.add(lblEstabilidad);
		
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
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		comboBox_3.setBounds(222, 164, 49, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(32, 231, 75, 14);
		contentPane.add(lblPromedio);
		
		JLabel label = new JLabel("");
		label.setBounds(102, 231, 46, 14);
		contentPane.add(label);
		
		JLabel lblEvaluacion = new JLabel("Evaluacion:");
		lblEvaluacion.setBounds(32, 256, 67, 14);
		contentPane.add(lblEvaluacion);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(99, 256, 75, 14);
		contentPane.add(label_1);
		
		JButton btnCancelar = new JButton("Atras");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eficiencia efia = new Eficiencia();
				efia.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(32, 293, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor1,valor2,valor3,valor4;
				String resultado;
				valor1=Integer.parseInt(comboBox.getSelectedItem().toString());
				valor2=Integer.parseInt(comboBox_1.getSelectedItem().toString());
				valor3=Integer.parseInt(comboBox_2.getSelectedItem().toString());
				valor4=Integer.parseInt(comboBox_3.getSelectedItem().toString());
				prom=(float)((valor1+valor2+valor3+valor4)/(float)4);
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
		btnEvaluar.setBounds(32, 197, 89, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(prom==-1)
					JOptionPane.showMessageDialog(null,"Por favor evalue la caracteristica");
				else
				{
					Portabilidad porta = new Portabilidad();
					Portabilidad.textField.setText(textField.getText());
					Portabilidad.textField_1.setText(textField_1.getText());
					Portabilidad.textField_2.setText(textField_2.getText());
					Portabilidad.textField_3.setText(textField_3.getText());
					Portabilidad.textField_4.setText(""+prom);
					porta.setVisible(true);
					dispose();
				}	
			}
		});
		btnSiguiente.setBounds(309, 293, 89, 23);
		contentPane.add(btnSiguiente);
		
		textField = new JTextField();
		textField.setBounds(309, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(309, 94, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(309, 133, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setBounds(309, 169, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
	}

}
