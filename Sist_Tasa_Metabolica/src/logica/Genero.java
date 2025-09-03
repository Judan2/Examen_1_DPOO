package logica;

public abstract class Genero {
	//atributos 
	protected double peso;
	protected double altura;
	protected int edad;
	protected String genero;
	
	
	public Genero (double peso, double altura, int edad, String genero) {
		this.peso= peso ;
		this.altura = altura;
		this.edad = edad; 
		this.genero = genero;
	}
	
	//GETTTERS AND SETTERS ;
	//peso
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso ;
	}			
		
	// Altura 
	public double getAltura() {
		return this.altura;
		}
	public void setAltura(double altura) {
		this.altura = altura;		
	}
	//edad ;
	
	public double getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getGenero( ) {
		return this.genero;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	
	//los calculeeeee; 
	public abstract double calcularTMB();
	public abstract boolean cumpleCondiciones();

	public double calcularIMC() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String obtenerGenero() {
		// TODO Auto-generated method stub
		return null;
	}

	public  String getNombre(String nombre) {
		  
		return this.nombre
	}

	
}

