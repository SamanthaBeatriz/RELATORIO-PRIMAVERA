package teste;

import java.util.ArrayList;
import java.util.List;
import report.CandidatoREL;
import model.Candidato;

public class RelatorioTeste {
	public static void main(String[] args)
	{
		try {
			List<Candidatos> candidatos = new ArrayList<Candidatos>();
			Candidato pessoa1 = new Candidato();
			pessoa1.setId(23);
			pessoa1.setIdade(22);
			pessoa1.setNome("markus");
			pessoa1.setRm(156489);
			pessoa1.setSala("1fun");
			pessoa1.setSexo("masculino");
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
