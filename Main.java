package pq1;

public class Main {

	public static void main(String[] args) {
		
		Ejercicio ejercio = new Ejercicio( new MultiplicacionRusa() );
		
		System.out.println("El resultado de la multiplicacion rusa de 37 y 12 es:"+"\n"+ejercio.resolverMultiplicacion(37, 12));
	}

}
