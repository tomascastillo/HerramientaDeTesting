package algCalidad;


public class Utilitaria {
	
	public Utilitaria(){
	}
	
	public String evaluar(float prom){
		if(prom>=5)
			return "Excelente";
		else
		{
			if(prom>=4)
				return "Buena";
			else
			{
				if(prom>=2)
					return "Regular";
				else
					return "Mala";
			}
		}
	}
}
