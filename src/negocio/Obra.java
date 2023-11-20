package negocio;

import java.util.ArrayList;
import java.util.List;

public class Obra {
	private int idObra;
	private String titulo;
	private String diretor;
	private String anoLancamento;
	private String genero;
	private String sinopse;
	private int classificao;
	
	
	public Obra() {
    }

    // Construtor com parâmetros
    public Obra(int idObra, String titulo, String diretor, String anoLancamento, String genero, String sinopse,
            int classificao) {
        this.idObra = idObra;
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.sinopse = sinopse;
        this.classificao = classificao;
    }

    public String lerObra(int idObra) {
        // Implementação do método
        return null;
    }

    public void atualizarObra(int idObra, String titulo, String diretor, String anoLancamento, String genero,
            String sinopse, int classificao) {
        // Implementação do método
    }

    public void excluirObra(int idObra) {
        // Implementação do método
    }
	
    public List<String> buscarPorGenero(String genero) {
        // Supondo que você tem uma lista de gêneros associados a cada obra
        List<String> obrasPorGenero = new ArrayList<>();

        // Lógica para filtrar obras pelo gênero
        // Substitua isso pela lógica real de busca

        return obrasPorGenero;
    }
	
	public List<Obra> buscarPorAno(String anoLancamento) {
        // Supondo que você tenha uma lista de obras
        List<Obra> obrasPorAno = new ArrayList<>();

        // Lógica para filtrar obras pelo ano de lançamento
        // Substitua isso pela lógica real de busca

        return obrasPorAno;
    }
	
	public List<Obra> buscarPorTitulo(String titulo) {
        // Supondo que você tenha uma lista de obras
        List<Obra> obrasPorTitulo = new ArrayList<>();

        // Lógica para filtrar obras pelo título
        // Substitua isso pela lógica real de busca

        return obrasPorTitulo;
    }

	public int getIdObra() {
		return idObra;
	}

	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getClassificao() {
		return classificao;
	}

	public void setClassificao(int classificao) {
		this.classificao = classificao;
	}
	
	
	
	
	
	
	
	

}
