import java.util.Scanner;

import javax.swing.JOptionPane;

public class Procesos {
	
	public void ejercicio2 () {
		
		int c = 8;
		int a = 2;
		int b = -2;
		c = (a * b) + 2;
		a = a - 2 + b * (b + 3) - c;
		b = c;
		
		System.out.println("Ejercicio2: La variable a es: " + a + "La variable b es: " + b + "La variable c es: " + c);
	}
	
	public void ejercicio3 () {
		
		double valorConstante = 70;
		double operacion = valorConstante * 15 / 100;
		double resultado = operacion;
		
		System.out.println("Ejercicio3: " + resultado);
	}
	
	public void ejercicio4 () {
		
		Scanner sc = new Scanner(System.in);
		
		double porcentaje = 15;
		System.out.println("Por favor ingrese el valor: ");
		int valor = sc.nextInt();
		
		System.out.println("Ejercicio4: El 15% de " + valor + " es: " + (porcentaje * valor) / 100);
	}
	
	public void ejercicio5 () {
		
		int salarioAntiguo = 1000;
		int operacion = salarioAntiguo * 25 / 100;
		int resultado = operacion;
		
		System.out.println("Ejercicio5: Su nuevo salario es de: " + resultado);
	}
	
	public void ejercicio6 () {
		
		int sueldoPersona = 5000;
		int horasExtrasTrabajadas = 4;
		int valorHoraExtra = horasExtrasTrabajadas * 3000;
		int sueldoTotal = valorHoraExtra + sueldoPersona;
		
		System.out.println("Ejercicio6: Su sueldo es de: " + sueldoTotal);
	}
	
	public void ejercicio7 () {
		
		double costoTratamiento = 5000;
		double diasHospitalizacion = 4;
		double costoDiaHospitalizacion = diasHospitalizacion * 100000;
		double costoMedicamentos = 3000;
		double sumaTotal = costoDiaHospitalizacion + costoTratamiento + costoMedicamentos;
		double valorTotal = sumaTotal;
		
		System.out.println("Ejercicio7: El valor total a pagar al hospital debido al tratamiento es de: " + valorTotal);
	}
	
	public void ejercicio8 () {
		
		int base = 3;
		int altura = 6;
		int area = base * altura / 2;
		
		System.out.println("Ejercicio8: El área del triágulo rectángulo es: " + area);
	}
	
	public void ejercicio9 () {
		
		double a = 2;
		double b = 4;
		double x = (b * 2 * a) + a; 
		
		System.out.println("Ejercicio9: " + x);
	}
	
	public void ejercicio10 () {
		
		double number1 = 2.6;
		double number2 = 2.6;
		double number3 = 2.6;
		double sum = number1 + number2 + number3;
		
		System.out.println("Ejercicio10: " + sum);
	}
	
	public void ejercicio11 () {
		
		double number1 = 2.6;
		double number2 = 2.6;
		double number3 = 2.6;
		double sum = number1 + number2 + number3;
		double multiplication = sum * 2;
		
		System.out.println("Ejercicio11: " + multiplication);
	}
	
	public void ejercicio12 () {
		
		double nota1 = 2;
		double nota2 = 5;
		double nota3 = 4.5;
		double resultado = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Ejercicio12: " + resultado);
	}
	
	public void ejercicio13 () {
		
		String nombreCompleto = "Pepito Pérez";
		int documento = 10934566;
		int edad = 21;
		String profesion = "Estudiante";
		
		
		System.out.println("Ejercicio13: Datos ingresados:");
		System.out.println("Nombre completo: " + nombreCompleto);
		System.out.println("Documento: " + documento);
		System.out.println("Edad: " + edad);
		System.out.println("Profesión: " + profesion);
		System.out.println("¡Bienvenido!");
	}
	
	public void ejercicio16 () {
		
		int precioArticulo = 100000;
		int cantidadCompra = 18;
		int valorEntregadoCliente = 1000000;
		
		int cuenta = cantidadCompra * precioArticulo;
		int devuelta = valorEntregadoCliente - cuenta;
		
		if (valorEntregadoCliente > cuenta) {
			System.out.println("Ejercicio16: " + devuelta);
		} else {
			System.out.println("Ejercicio16: Hace falta dinero para pagar la cuenta.");
		}
	}
	
	public void ejercicio17 () {
		String nombreCompleto = "Pepito Pérez";
		int documento = 10934566;
		int edad = 21;
		String profesion = "Estudiante";
		String telefono = "3113841824";
		
		
		System.out.println("Ejercicio17: Datos ingresados:");
		System.out.println("Nombre completo: " + nombreCompleto);
		System.out.println("Edad: " + edad);
		System.out.println("Documento: " + documento);
		System.out.println("Profesión: " + profesion);
		System.out.println("Teléfono: " + telefono);
	}
	
	public void ejercicio21 () {
		
		double valorHoras = 2000;
		double horasTrabajadas = 50 * valorHoras;
		double descuentoImpuesto = (horasTrabajadas * 10) / 100;
		double totalSalario = horasTrabajadas - descuentoImpuesto;
		
		System.out.println("Ejercicio21: " + totalSalario);
	}
	
	public void ejercicio25 () {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioAnterior = 1000000;
		
		System.out.println("Por favor ingrese el incremento: ");
		double porcentaje = sc.nextInt();
		double incremento = (porcentaje * salarioAnterior) / 100;
		double salarioNuevo = salarioAnterior + incremento;
		
		System.out.println("Ejercicio25: El salario con el " + porcentaje + " es de: " + salarioNuevo);
	}
	
	public void ejercicio26 () {
		
		int n = 2;
		int operacion = n * (n + 1) / 2;
		
		System.out.println("Ejercicio26: " + operacion);
	}
	
	public void ejercicio27 () {
		
		double porcentaje1 = 0.2;
		double porcentaje2 = 0.3;
		
		double nota1 = 5 * porcentaje1;
		double nota2 = 5 * porcentaje1;
		double notaTrabajos = 5 * porcentaje2;
		double examenFinal = 5 * porcentaje2;
		
		double notaDefinitiva = nota1 + nota2 + notaTrabajos + examenFinal;
		
		System.out.println("Ejercicio27: " + notaDefinitiva);
	}
	
	public void ejercicio28 () {
		
		int monto = 9;
		int plazoDias = 10;
		int tasaInteresAnual = 1000000;
		
		int operacion = (monto * plazoDias * tasaInteresAnual) / 360;
		
		System.out.println("Ejercicio28: " + operacion);
	}
	
	//2ciclo for
	
	public void ejercicioCicloFor12 () {

		double resultado = 0;
		double notas [] = {2, 5, 4.5};
		
		for(int i = 0; i < notas.length; i++) {
			resultado += notas[(int)i] / 3;
		} System.out.println(resultado);
	}
	
	public void ejercicioCicloFor10 () {
		
		double suma = 0;
		double numbers [] = {2.6, 2.6, 2.6};
		
		for(int i = 0; i < numbers.length; i++) {
			suma += numbers[(int)i];
		} System.out.println(suma);
	}
	
	//2ciclo do while
	
	public void ejercicioCicloDoWhile27 () {
		
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        
        int i=0;
        
        do {
            JOptionPane.showMessageDialog(null, "Estudiante "+(i+1));
           
            double porcentaje1 = 0.2;
            double porcentaje2 = 0.3;
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1")) * porcentaje1;
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2")) * porcentaje1;
            double notaTrabajos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de trabajos")) * porcentaje2;
            double examenFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final")) * porcentaje2;
           
            double notaDefinitiva = nota1 + nota2 + notaTrabajos + examenFinal;
            System.out.println("Su nota definitiva es de: " + notaDefinitiva);
        
            System.out.println("___");
            System.out.println();
            i++;
        } while (i<cant);
		
	}
	
	public void ejercicioCicloDoWhile7 () {
		
		int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pacientes"));
		
        int i=0;
        
        do {
            JOptionPane.showMessageDialog(null, "Paciente "+(i+1));

            double costoTratamiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
            double diasHospitalizacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuantos días estuvó hospitalizado")) * 100000;
            double costoMedicamentos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los medicamentos"));
           
            double sumaTotal = costoTratamiento + diasHospitalizacion + costoMedicamentos;
            double valorTotal = sumaTotal;
            System.out.println("El valor total a pagar al hospital debido al tratamiento es de: " + valorTotal);
            
            System.out.println("___");
            System.out.println();
            i++;
        } while (i<cant);
         
    }
	
	//2ciclo while
	
	public void ejercicioCicloWhile4 () {
		
		int i=0;
		
		while (i<2) {
			
			JOptionPane.showMessageDialog(null, "valor " + (i+1));
			
	        double porcentaje = 15;
	        double valor = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor: "));
	       
	        double operacion = (porcentaje * valor) / 100;
	        System.out.println("El 15% de " + valor + " es: " + operacion);
	        
			i++;	
		}
	}
	
	public void ejercicioCicloWhile5 () {
		
		int i=0;
		
		while (i<2) {
			
			JOptionPane.showMessageDialog(null, "salario anterior " + (i+1));
			
			double salarioAntiguo = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese su salario anterior: "));
			double operacion = salarioAntiguo * 25 / 100;
			double resultado = operacion;
			
			System.out.println("Su nuevo salario es de: " + resultado);
			
			i++;
		}
		
	}

}