package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Serie extends Obra {
	
	private int numEpisodeos;
	private int numTemporada;
	private String elencoRecorrente;
	private double duracao; 


	public Serie(int idObra, String titulosa, String diretor, int anoLancamento, String generolo, int classifacao,
			int numEpisodeos, int numTemporada, String elencoRecorrente, double duracao) {
		super(idObra, titulosa, diretor, anoLancamento, generolo, classifacao);
		this.numEpisodeos = numEpisodeos;
		this.numTemporada = numTemporada;
		this.elencoRecorrente = elencoRecorrente;
		this.duracao = duracao;
	}

	public double calcularMediaDuracao() {
	    double somaDuracoes = 0;
	    int numSeries = 0;

	    for (Obra obra : map.values()) {
	        if (obra instanceof Serie) {
	            Serie serie = (Serie) obra; // Cast para Serie
	            somaDuracoes += serie.getDuracao();
	            numSeries++;
	        }
	    }

	    if (numSeries > 0) {
	        return somaDuracoes / numSeries;
	    } else {
	        return 0; // Ou outra ação apropriada se não houver séries no mapa
	    }
	}
	

    public List<Serie> listarElencoRecorrente(String ator) {
        List<Serie> seriesComAtor = new ArrayList<>();

        for (Map.Entry<Integer, Obra> entry : map.entrySet()) {
            Obra obra = entry.getValue();
            if (obra instanceof Serie) {
                Serie serie = (Serie) obra;
                if (serie.getElencoRecorrente().contains(ator)) {
                    seriesComAtor.add(serie);
                }
            }
        }

        return seriesComAtor;
    }
	
	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getNumEpisodeos() {
		return numEpisodeos;
	}


	public void setNumEpisodeos(int numEpisodeos) {
		this.numEpisodeos = numEpisodeos;
	}


	public int getNumTemporada() {
		return numTemporada;
	}


	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}


	public String getElencoRecorrente() {
		return elencoRecorrente;
	}


	public void setElencoRecorrente(String elencoRecorrente) {
		this.elencoRecorrente = elencoRecorrente;
	}
	
	
	
	
	
}
