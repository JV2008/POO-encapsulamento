package pessoa;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta("10/10","Junior","João");
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
	

	}

}
