package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Serie extends Obra {
	
	private int numEpisodeos;
	private int numTemporada;
	private double duracao; 
	private String elencoRecorrente;
	private String sinopseEp;

  	
	public Serie(int idObra, String titulosa, String diretor, int anoLancamento, String generolo, int classifacao,
			int numEpisodeos, int numTemporada, double duracao, String elencoRecorrente, String sinopseEp) {
		super(idObra, titulosa, diretor, anoLancamento, generolo, classifacao);
		this.numEpisodeos = numEpisodeos;
		this.numTemporada = numTemporada;
		this.duracao = duracao;
		this.elencoRecorrente = elencoRecorrente;
		this.sinopseEp = sinopseEp;
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
	    

	    public String buscarNumeroTemporada() {
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

	        int numeroTemporada = scanner.nextInt();      

	        List<String> elencoRecorrente = listarElencoRecorrente(); // Utilizando o método já existente
	        
	        // Convertendo o número da temporada para String e adicionando um caractere de separação
	        String representacaoTemporada = String.valueOf(numeroTemporada) + " - ";

	        // Concatenando a representação da temporada com a lista de elenco
	        return representacaoTemporada + String.join(", ", elencoRecorrente);
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
        List<Serie> Ator = new ArrayList<>();

        for (Map.Entry<Integer, Obra> corre : map.entrySet()) {
            Obra obra = corre.getValue();
            if (obra instanceof Serie) {
                Serie serie = (Serie) obra;
                if (serie.getElencoRecorrente().contains(ator)) {
                    Ator.add(serie);
                }
            }
        }

        return Ator;
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
