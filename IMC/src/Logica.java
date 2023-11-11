import java.util.ArrayList;

public class Logica {
	
	ArrayList<Persona> listaPersonas;
	VentanaPrincipal miVentana;
	Persona miPersona;
	double imc;

	public Logica(){
		listaPersonas = new ArrayList<>();
	}

	
	
	public String resgistrarPersona(Persona persona) {
		
		String resultado = "---------------------------------\n";
		resultado+="_______________DATOS_________________\n";
		resultado+="Nombre: "+persona.getNombre()+"\n";
		resultado+="Documento: "+persona.getDocumento()+"\n";
		resultado+="Edad: "+persona.getEdad()+"\n";
		resultado+="Peso: "+persona.getPeso()+"\n";
		resultado+="Talla: "+persona.getTalla()+"\n";
		this.imc = calcIMC(persona.getPeso(),persona.getTalla());
		String imc = calcularIMC(this.imc);
		resultado+=imc;
		
        persona.setIMC(this.imc);
        persona.setImcMsj(imc);
        
        listaPersonas.add(persona);
        System.out.println(listaPersonas.size());
		
		return resultado;
		
		
	}

	public double calcIMC(double peso, double talla) {
		double i = peso /(talla*talla);
		
		return i;
	}



	public String calcularIMC(double imc) {

		
		
		String msj = null;
		
		if (imc < 18) {
			msj = "Anorexia";
		}else if (imc >=18 && imc < 20) {
			msj = "Delgadez";
		}else if (imc >=20 && imc < 27) {
			msj = "Normalidad";
		}else if (imc >=27 && imc < 30) {
			msj = "Obesidad (Grado 1)";
		}else if (imc >=30 && imc < 35) {
			msj = "Obesidad (Grado 2)";
		}else if (imc >=35 && imc < 40) {
			msj = "Obesidad (Grado 3)";
		}else if (imc >=40) {
			msj = "Obesidad Morbida";
		}
		String i = "su IMC es de: "+ imc+"\n" + "lo que nos da un resultado de: "+ msj;
		

		return i;
	}



	public String consultarLista() {

		String resultado ="";
		Persona persona=null;
		
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			persona = listaPersonas.get(i);
			
			resultado+="_______________DATOS_________________\n";
			resultado+="Nombre: "+persona.getNombre()+"\n";
			resultado+="Documento: "+persona.getDocumento()+"\n";
			resultado+="Edad: "+persona.getEdad()+"\n";
			resultado+="Peso: "+persona.getPeso()+"\n";
			resultado+="Talla: "+persona.getTalla()+"\n";
			resultado+=persona.getImcMsj()+"\n";
		}
		
		return resultado;
	}



	public String consultarPromedio() {

		String resultado = "";
		double suma = 0;
		for (int i = 0; i < listaPersonas.size(); i++) {
			suma = suma + listaPersonas.get(i).getImc();
		}
		
		double promedio = suma / listaPersonas.size();
		resultado = calcularIMC(promedio);
		
		return resultado;
	}
	
	
	

	
	
	
	
	
}
