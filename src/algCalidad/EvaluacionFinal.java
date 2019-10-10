package algCalidad;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class EvaluacionFinal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;
	static JTextField textField_5;
	float prom;
	String resultado;
	public static final Color DARK_YELLOW = new Color(255,204,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvaluacionFinal frame = new EvaluacionFinal();
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
	public EvaluacionFinal() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 371);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEvaluacionFinal = new JLabel("Evaluacion final");
		lblEvaluacionFinal.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblEvaluacionFinal.setBounds(106, 11, 255, 34);
		contentPane.add(lblEvaluacionFinal);
		
		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad");
		lblFuncionabilidad.setBounds(22, 89, 114, 14);
		contentPane.add(lblFuncionabilidad);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setBounds(22, 114, 82, 14);
		contentPane.add(lblFiabilidad);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setBounds(22, 139, 82, 14);
		contentPane.add(lblUsabilidad);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setBounds(22, 164, 82, 14);
		contentPane.add(lblEficiencia);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setBounds(22, 189, 82, 14);
		contentPane.add(lblMantenibilidad);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setBounds(22, 214, 88, 14);
		contentPane.add(lblPortabilidad);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(140, 67, 65, 14);
		contentPane.add(lblPromedio);
		
		JLabel lblEvaluacion = new JLabel("Evaluacion");
		lblEvaluacion.setBounds(230, 67, 82, 14);
		contentPane.add(lblEvaluacion);
		
		JLabel lblPromedioFinal = new JLabel("Total");
		lblPromedioFinal.setBounds(22, 239, 65, 14);
		contentPane.add(lblPromedioFinal);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Portabilidad porta = new Portabilidad();
				porta.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(22, 278, 89, 23);
		contentPane.add(btnAtras);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAceptar.setBounds(310, 278, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel funcionalidadProm = new JLabel("");
		funcionalidadProm.setBounds(140, 89, 46, 14);
		contentPane.add(funcionalidadProm);
		
		JLabel funcionalidadEva = new JLabel("");
		funcionalidadEva.setBounds(227, 89, 104, 14);
		contentPane.add(funcionalidadEva);
		
		JLabel fiabilidadProm = new JLabel("");
		fiabilidadProm.setBounds(140, 114, 46, 14);
		contentPane.add(fiabilidadProm);
		
		JLabel fiabilidadEva = new JLabel("");
		fiabilidadEva.setBounds(230, 114, 101, 14);
		contentPane.add(fiabilidadEva);
		
		JLabel usabilidadProm = new JLabel("");
		usabilidadProm.setBounds(140, 139, 46, 14);
		contentPane.add(usabilidadProm);
		
		JLabel usabilidadEva = new JLabel("");
		usabilidadEva.setBounds(230, 139, 101, 14);
		contentPane.add(usabilidadEva);
		
		JLabel eficienciaProm = new JLabel("");
		eficienciaProm.setBounds(140, 164, 46, 14);
		contentPane.add(eficienciaProm);
		
		JLabel eficienciaEva = new JLabel("");
		eficienciaEva.setBounds(230, 164, 82, 14);
		contentPane.add(eficienciaEva);
		
		JLabel mantenibilidadProm = new JLabel("");
		mantenibilidadProm.setBounds(140, 189, 46, 14);
		contentPane.add(mantenibilidadProm);
		
		JLabel mantenibilidadEva = new JLabel("");
		mantenibilidadEva.setBounds(230, 189, 101, 14);
		contentPane.add(mantenibilidadEva);
		
		JLabel portabilidadProm = new JLabel("");
		portabilidadProm.setBounds(140, 214, 46, 14);
		contentPane.add(portabilidadProm);
		
		JLabel portabilidadEva = new JLabel("");
		portabilidadEva.setBounds(230, 214, 82, 14);
		contentPane.add(portabilidadEva);
		
		JLabel totalProm = new JLabel("");
		totalProm.setBounds(140, 239, 46, 14);
		contentPane.add(totalProm);
		
		JLabel totalEva = new JLabel("");
		totalEva.setBounds(230, 239, 101, 14);
		contentPane.add(totalEva);
		
		textField = new JTextField();
		textField.setBounds(341, 25, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(341, 56, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setBounds(341, 86, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setBounds(341, 111, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setBounds(341, 136, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setBounds(341, 161, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setVisible(false);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilitaria util = new Utilitaria();
				float promTotal;
				prom=Float.parseFloat(textField.getText());
				resultado=String.format("%.2f", prom);
				funcionalidadProm.setText(""+resultado);
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					funcionalidadEva.setText(resultado);
					funcionalidadEva.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						funcionalidadEva.setText(resultado);
						funcionalidadEva.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							funcionalidadEva.setText(resultado);
							funcionalidadEva.setForeground(DARK_YELLOW);
						}
						else
						{
							funcionalidadEva.setText(resultado);
							funcionalidadEva.setForeground(Color.RED);
						}
					}
				}	
				//FIABILIDAD
				prom=Float.parseFloat(textField_1.getText());
				resultado=String.format("%.2f", prom);
				fiabilidadProm.setText(""+resultado);
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					fiabilidadEva.setText(resultado);
					fiabilidadEva.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						fiabilidadEva.setText(resultado);
						fiabilidadEva.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							fiabilidadEva.setText(resultado);
							fiabilidadEva.setForeground(DARK_YELLOW);
						}
						else
						{
							fiabilidadEva.setText(resultado);
							fiabilidadEva.setForeground(Color.RED);
						}
					}
				}	
				//USABILIDAD
				prom=Float.parseFloat(textField_2.getText());
				resultado=String.format("%.2f", prom);
				usabilidadProm.setText(""+resultado);
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					usabilidadEva.setText(resultado);
					usabilidadEva.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						usabilidadEva.setText(resultado);
						usabilidadEva.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							usabilidadEva.setText(resultado);
							usabilidadEva.setForeground(DARK_YELLOW);
						}
						else
						{
							usabilidadEva.setText(resultado);
							usabilidadEva.setForeground(Color.RED);
						}
					}
				}
				//EFICIENCIA
				prom=Float.parseFloat(textField_3.getText());
				resultado=String.format("%.2f", prom);
				eficienciaProm.setText(""+resultado);
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					eficienciaEva.setText(resultado);
					eficienciaEva.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						eficienciaEva.setText(resultado);
						eficienciaEva.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							eficienciaEva.setText(resultado);
							eficienciaEva.setForeground(DARK_YELLOW);
						}
						else
						{
							eficienciaEva.setText(resultado);
							eficienciaEva.setForeground(Color.RED);
						}
					}
				}
				//MANTENIBILIDAD
				prom=Float.parseFloat(textField_4.getText());
				resultado=String.format("%.2f", prom);
				mantenibilidadProm.setText(""+resultado);
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					mantenibilidadEva.setText(resultado);
					mantenibilidadEva.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						mantenibilidadEva.setText(resultado);
						mantenibilidadEva.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							mantenibilidadEva.setText(resultado);
							mantenibilidadEva.setForeground(DARK_YELLOW);
						}
						else
						{
							mantenibilidadEva.setText(resultado);
							mantenibilidadEva.setForeground(Color.RED);
						}
					}
				}
				//PORTABILIDAD
				prom=Float.parseFloat(textField_5.getText());
				resultado=String.format("%.2f", prom);
				portabilidadProm.setText(""+resultado);
				resultado= util.evaluar(prom);
				if(resultado.equals("Excelente"))
				{
					portabilidadEva.setText(resultado);
					portabilidadEva.setForeground(Color.BLUE);
				}
				else
				{
					if(resultado.equals("Buena"))
					{
						portabilidadEva.setText(resultado);
						portabilidadEva.setForeground(Color.GREEN);
					}
					else
					{
						if(resultado.equals("Regular"))
						{
							portabilidadEva.setText(resultado);
							portabilidadEva.setForeground(DARK_YELLOW);
						}
						else
						{
							portabilidadEva.setText(resultado);
							portabilidadEva.setForeground(Color.RED);
						}
					}
				}
			promTotal=(Float.parseFloat(textField.getText())+Float.parseFloat(textField_1.getText())+Float.parseFloat(textField_2.getText())+Float.parseFloat(textField_3.getText())+Float.parseFloat(textField_4.getText())+Float.parseFloat(textField_5.getText()))/(float)6;
			resultado=String.format("%.2f", promTotal);
			totalProm.setText("" + resultado);
			resultado= util.evaluar(promTotal);
			if(resultado.equals("Excelente"))
			{
				totalEva.setText(resultado);
				totalEva.setForeground(Color.BLUE);
			}
			else
			{
				if(resultado.equals("Buena"))
				{
					totalEva.setText(resultado);
					totalEva.setForeground(Color.GREEN);
				}
				else
				{
					if(resultado.equals("Regular"))
					{
						totalEva.setText(resultado);
						totalEva.setForeground(DARK_YELLOW);
					}
					else
					{
						totalEva.setText(resultado);
						totalEva.setForeground(Color.RED);
					}
				}
			}
			}
		});
		btnCalcular.setBounds(167, 278, 89, 23);
		contentPane.add(btnCalcular);
		
	}
}
