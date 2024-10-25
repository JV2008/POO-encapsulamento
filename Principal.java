package tema;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tema tema = new Tema (1,"Casa do João", 1245,99, "Vermelha");
		ItemTema item1 = new ItemTema (1,"Sofá","Aconchegar e relaxar");
		Endereco lugar = new Endereco (1,"Francisco Weiss Jr",352,"cond.moradas","Vl Progresso","Itapetininga","18214-560","SP");

		 System.out.println("--------------TEMA---------------");
		 System.out.println(tema.getId());
		 System.out.println(tema.getNome());
		 System.out.println(tema.getValorAluguel());
		 System.out.println(tema.getCor());
		 System.out.println("--------------ITEM---------------");
		 System.out.println(item1.getId());
		 System.out.println(item1.getNome());
		 System.out.println(item1.getDescrição());
		 System.out.println("--------------LUGAR---------------");
		 System.out.println(lugar.getId());
		 System.out.println(lugar.getLogradouro());
		 System.out.println(lugar.getNumero());
		 System.out.println(lugar.getComplemento());
		 System.out.println(lugar.getBairro());
		 System.out.println(lugar.getCidade());
		 System.out.println(lugar.getCep());
		 System.out.println(lugar.getUf());

	}

}
