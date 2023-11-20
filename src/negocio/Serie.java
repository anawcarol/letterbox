package negocio;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Obra {
	public int numEpisodios;
	public int numTemporadas;
	public String elencoRecorrente;
	
	public Serie(int idObra, String titulo, String diretor, String anoLancamento,
            String genero, String sinopse, int classificacao,
            int numEpisodios, int numTemporadas, String elencoRecorrente) {
   super(idObra, titulo, diretor, anoLancamento, genero, sinopse, classificacao);
   this.numEpisodios = numEpisodios;
   this.numTemporadas = numTemporadas;
   this.elencoRecorrente = elencoRecorrente;
}

	// Métodos getters e setters
	public int getNumEpisodios() {
	   return numEpisodios;
	}
	
	public void setNumEpisodios(int numEpisodios) {
	   this.numEpisodios = numEpisodios;
	}
	
	public int getNumTemporadas() {
	   return numTemporadas;
	}
	
	public void setNumTemporadas(int numTemporadas) {
	   this.numTemporadas = numTemporadas;
	}
	
	public String getElencoRecorrente() {
	   return elencoRecorrente;
	}
	
	public void setElencoRecorrente(String elencoRecorrente) {
	   this.elencoRecorrente = elencoRecorrente;
	}
	
    public int buscarNumeroEpisodio() {
        
        return numEpisodios;
    }

    public int buscarNumeroTemporada() {
       
        return numTemporadas;
    }

    public int mediaDuracao() {
       
        return 0;
    }

    public List<String> listarElencoRecorrente() {
        List<String> elenco = new ArrayList<>();

        // Supondo que o elencoRecorrente seja uma string com nomes de atores separados por vírgula
        String[] atores = this.elencoRecorrente.split(",");

        for (String nomeAtor : atores) {
            // Adicionando o nome do ator à lista
            elenco.add(nomeAtor.trim());
        }

        return elenco;
    }
}
	

