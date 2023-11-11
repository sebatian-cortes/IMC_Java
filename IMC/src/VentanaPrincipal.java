
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTalla;
	JButton btnConsultarLista,btnPromedio,btnCalcularIMC,btnRegistrar;
	Logica miLogica;
	JTextArea areaTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 461);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		iniciarComponentes();
	}

	private void iniciarComponentes() {
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setBounds(10, 187, 599, 190);
		contentPane.add(scrollArea);
		
		areaTexto = new JTextArea();
		areaTexto.setLineWrap(true);
		scrollArea.setViewportView(areaTexto);
		
		JLabel etiTitulo = new JLabel("CALCULAR IMC");
		etiTitulo.setFont(new Font("Tahoma", Font.BOLD, 19));
		etiTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiTitulo.setForeground(Color.WHITE);
		etiTitulo.setBounds(212, 0, 180, 42);
		contentPane.add(etiTitulo);
		
		JLabel etiDatosBasicos = new JLabel("Datos Basicos");
		etiDatosBasicos.setFont(new Font("Tahoma", Font.BOLD, 16));
		etiDatosBasicos.setForeground(Color.WHITE);
		etiDatosBasicos.setBounds(10, 40, 130, 32);
		contentPane.add(etiDatosBasicos);
		
		JLabel etiDocumento = new JLabel("Documento");
		etiDocumento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiDocumento.setForeground(Color.WHITE);
		etiDocumento.setBounds(10, 71, 79, 29);
		contentPane.add(etiDocumento);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(83, 76, 94, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JLabel etiNombre = new JLabel("Nombre");
		etiNombre.setForeground(Color.WHITE);
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiNombre.setBounds(183, 71, 58, 29);
		contentPane.add(etiNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(238, 76, 235, 20);
		contentPane.add(txtNombre);
		
		JLabel etiEdad = new JLabel("Edad");
		etiEdad.setForeground(Color.WHITE);
		etiEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiEdad.setBounds(483, 71, 38, 29);
		contentPane.add(etiEdad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(530, 76, 79, 20);
		contentPane.add(txtEdad);
		
		JLabel etiDatosIMC = new JLabel("Datos IMC");
		etiDatosIMC.setForeground(Color.WHITE);
		etiDatosIMC.setFont(new Font("Tahoma", Font.BOLD, 16));
		etiDatosIMC.setBounds(10, 98, 102, 32);
		contentPane.add(etiDatosIMC);
		
		JLabel etiResultado = new JLabel("Resultado");
		etiResultado.setForeground(Color.WHITE);
		etiResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		etiResultado.setBounds(10, 157, 102, 32);
		contentPane.add(etiResultado);
		
		JLabel etiPeso = new JLabel("Peso");
		etiPeso.setForeground(Color.WHITE);
		etiPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiPeso.setBounds(10, 130, 38, 29);
		contentPane.add(etiPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(83, 135, 94, 20);
		contentPane.add(txtPeso);
		
		txtTalla = new JTextField();
		txtTalla.setColumns(10);
		txtTalla.setBounds(238, 135, 94, 20);
		contentPane.add(txtTalla);
		
		JLabel etiTalla = new JLabel("Talla");
		etiTalla.setForeground(Color.WHITE);
		etiTalla.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiTalla.setBounds(183, 130, 38, 29);
		contentPane.add(etiTalla);
		
		btnCalcularIMC = new JButton("Calcular IMC");
		btnCalcularIMC.setBounds(159, 388, 139, 23);
		contentPane.add(btnCalcularIMC);
		btnCalcularIMC.addActionListener(this);
		
		btnPromedio = new JButton("Calcular Promedio ");
		btnPromedio.setBounds(470, 388, 139, 23);
		contentPane.add(btnPromedio);
		btnPromedio.addActionListener(this);
		
		btnConsultarLista = new JButton("Consultar Lista");
		btnConsultarLista.setBounds(321, 388, 139, 23);
		contentPane.add(btnConsultarLista);
		btnConsultarLista.addActionListener(this);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(10, 388, 139, 23);
		contentPane.add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		miLogica = new Logica();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCalcularIMC) {
			
			String res = miLogica.calcularIMC(miLogica.calcIMC(Double.parseDouble(txtPeso.getText()), Double.parseDouble(txtTalla.getText())));
			
			areaTexto.setText(res);
		}
        if (e.getSource() == btnConsultarLista) {
        	
        	String lista = miLogica.consultarLista();
        	System.out.println(lista);
        	areaTexto.setText(lista);
		}
        if (e.getSource() == btnPromedio) {
        	
			String res = miLogica.consultarPromedio();
			
			areaTexto.setText(res);
		}
        if (e.getSource()==btnRegistrar) {
    		
        	Persona miPersona = new Persona();
        	miPersona.setDocumento(txtDocumento.getText());
        	miPersona.setNombre(txtNombre.getText());
        	miPersona.setEdad(txtEdad.getText());
        	miPersona.setPeso(Double.parseDouble(txtPeso.getText()));
        	miPersona.setTalla(Double.parseDouble(txtTalla.getText()));       	
        	        	
			String res = miLogica.resgistrarPersona(miPersona);
			
			areaTexto.setText(res);
		}
	}
}
