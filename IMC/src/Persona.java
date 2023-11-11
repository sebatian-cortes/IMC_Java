
public class Persona {

	double peso;
	double talla;
	double imc;
	String documento;
	String nombre;
	String edad;
	String imcMsj;
	
	
	public Persona(){
		
	}


	public Persona(double peso, double talla, double imc, String documento, String nombre, String edad, String imcMsj ) {
		super();
		this.peso = peso;
		this.talla = talla;
		this.imc = imc;
		this.documento = documento;
		this.nombre = nombre;
		this.edad = edad;
		this.imcMsj = imcMsj;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getImc() {
		return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}


	public String getImcMsj() {
		return imcMsj;
	}


	public void setImcMsj(String imcMsj) {
		this.imcMsj = imcMsj;
	}


	public double getTalla() {
		return talla;
	}


	public void setTalla(double talla) {
		this.talla = talla;
	}


	public double getIMC() {
		return imc;
	}


	public void setIMC(double iMC) {
		this.imc = iMC;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
}
