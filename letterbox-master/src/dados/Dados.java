package Dados;

import negocio.*;

public class Dados {
	private Comentario[] comentarios;
	private int nComentarios = 0;
	private Filme[] filmes;
	private int nFilmes = 0;
	private Serie[] series;
	private int nSeries = 0;
	private Usuario[] usuarios;
	private int nUsuarios = 0;
	private ObrasAssistidas[] obrasAssistidas;
	private int nObrasAssistidas = 0 ;
	
	
	public Dados() {
		usuarios = new Usuario[100];
		filmes = new Filme[100];
		series = new Serie[100];
		comentarios = new Comentario[100];
		obrasAssistidas = new ObrasAssistidas[100];
	}


	public Comentario[] getComentarios() {
		return comentarios;
	}
	
	public Comentario getComentario(int i) {
		return comentarios[i];
	}
	
	public  String[] getConteudoComentarios() {
		String[] s = new String[nComentarios];
		for (int i=0; i < nComentarios;i++) {
			s[i] = comentarios[i].getConteudo();
		}
		return s;
	}
	

	public void setComentario(Comentario[] comentarios) {
		this.comentarios = comentarios;
	}
	
	public void setComentarios(int i, Comentario c) {
		comentarios[i] = c;
	}


	public int getnComentario() {
		return nComentarios;
	}


	public void setnComentario(int nComentarios) {
		this.nComentarios = nComentarios;
	}


	public Filme[] getFilmes() {
		return filmes;
	}
	
	public Filme getFilme(int i) {
		return filmes[i];
	}
	
	public  String[] getNomeFilmes() {
		String[] s = new String[nFilmes];
		for (int i=0; i < nFilmes;i++) {
			s[i] =filmes[i].getTitulo();
		}
		return s;
	}
	

	public void setFilmes(Filme[] filmes) {
		this.filmes = filmes;
	}
	
	public void setFilme(int i , Filme f) {
		filmes[i] = f;
	}


	public int getnFilmes() {
		return nFilmes;
	}


	public void setnFilmes(int nFilmes) {
		this.nFilmes = nFilmes;
	}


	public Serie[] getSeries() {
		return series;
	}
	
	public Serie getSerie(int i) {
		return series[i];
	}
	
	public  String[] getNomeSeries() {
		String[] s = new String[nSeries];
		for (int i=0; i <nSeries;i++) {
			s[i]=series[i].getTitulo();
		}
		return s;
	}


	public void setSeries(Serie[] series) {
		this.series = series;
	}
	
	public void setSerie(int i,Serie s) {
		series[i]= s;
	}


	public int getnSeries() {
		return nSeries;
	}


	public void setnSeries(int nSeries) {
		this.nSeries = nSeries;
	}


	public Usuario[] getUsuarios() {
		return usuarios;
	}
	
	public Usuario getUsuario(int i) {
		return usuarios[i];
	}
	
	public  String[] getNomeUsuarios() {
		String[] s = new String[nUsuarios];
		for (int i=0; i <nUsuarios;i++) {
			s[i]=usuarios[i].getNome();
		}
		return s;
	}


	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
	public void setUsuarios(int i ,Usuario u) {
		usuarios[i] = u;
	}


	public int getnUsuarios() {
		return nUsuarios;
	}


	public void setnUsuarios(int nUsuarios) {
		this.nUsuarios = nUsuarios;
	}


	public ObrasAssistidas[] getObrasAssistidas() {
		return obrasAssistidas;
	}
	
	public ObrasAssistidas getObrasAssistidass(int i) {
		return obrasAssistidas[i];
	}


	public void setObrasAssistidas(ObrasAssistidas[] obrasAssistidas) {
		this.obrasAssistidas = obrasAssistidas;
	}
	
	public void setObrasAssistidas(int i , ObrasAssistidas o) {
		obrasAssistidas[i] = o;
	}


	public int getnObrasAssistidas() {
		return nObrasAssistidas;
	}


	public void setnObrasAssistidas(int nObrasAssistidas) {
		this.nObrasAssistidas = nObrasAssistidas;
	}

	public void preencherDados() {
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			usuarios[i] = new Usuario("idUsuario".concat(s),"nome".concat(s), "email".concat(s),"senha".concat(s)); 
			filmes[i]= new Filme("idObra".concat(s),"titulo".concat(s),"diretor".concat(s),"anoLancamento".concat(s),"genero".concat(s),"sinopse".concat(s),"classificao".concat(s),"duracao".concat(s),"elencoFixo".concat(s));
			series[i]= new Serie("idObra".concat(s),"titulo".concat(s),"diretor".concat(s),"anoLancamento".concat(s),"genero".concat(s),"sinopse".concat(s),"classificao".concat(s),"numEpisodios".concat(s),"numTemporada".concat(s),"elencoRecorrente".concat(s));
			comentarios[i]= new Comentario(usuarios[i], "data".concat(s),"conteudo".concat(s),"idComentario".concat(s), i);
			obrasAssistidas[i]=("idObra".concat(s),"idUsuario".concat(s));
			obrasAssistidas[i] = new ObrasAssistidas(); 
	        obrasAssistidas[i].setFilme(filmes[i]);     
	        obrasAssistidas[i].setSerie(series[i]);
			}
	}
}