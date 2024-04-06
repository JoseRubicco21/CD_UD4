package ud4.e1;

public class Fecha {

	private int dia;

	private int mes;

	private int anio;

	public Fecha(int dia, int mes, int anio) {

		this.dia = dia;

		this.mes = mes;

		this.anio = anio;

	}

	// Check if day is between the specified range.
	public boolean diaIsInRange() {
		if (this.dia < 1 || this.dia > 31)
			return false;
		return true;
	}

	// Check if mes is between the specified range.
	public boolean mesIsInRange() {
		if (this.mes < 1 || this.mes > 12)
			return false;
		return true;
	}
	
	// Return 28 or 29 depending if the year field is a leap year.
	public int calcularBisiesto() {
		if ((this.anio % 400 == 0) || ((this.anio % 4 == 0) && (this.anio % 100 != 0)))
			return 29;
		return 28;
	}
	
	// Calculate how many days a month will have.
	public int calcularDiasDelMes() {
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			diasMes = 31; 
			break;
		case 4:
		case 6:
		case 9:
		case 11 : 
			diasMes = 30; 
			break;
		case 2 : 
			diasMes = this.calcularBisiesto(); 
			break;
		}
		return diasMes;
	}


	public boolean valida () {
		// validation usage occures here. Otherwise it's the implementation.
		// Validates day range.
		if (!this.diaIsInRange()) return false;
		// Validates month range.
		if (!this.mesIsInRange()) return false;
		// validate if days of the date correspond to the days it should have.
		if (this.dia > this.calcularDiasDelMes()) return false;
		// Return true ( Valid ) if none of those conditions were not met.
		return true;
	}

}
