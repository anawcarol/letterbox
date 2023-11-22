package negocio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Comentario {
	
	private Usuario autor;
	private String data;
	private String conteudo;
	private int idCometario;
	private int nota;
    static Map<Integer, Comentario> map = new HashMap<>();
    private int i;

	public Comentario(Usuario autor, String data, String conteudo, int idCometario, int nota) {
		super();
		this.autor = autor;
		this.data = data;
		this.conteudo = conteudo;
		this.idCometario = idCometario;
		this.nota = nota;
		map.put(idCometario, this);
		i++;
	}
	
	 public void excluirObra(int idComentario) {
	        Iterator<Map.Entry<Integer, Comentario>> iterator = map.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Integer, Comentario> entry = iterator.next();
	            if (entry.getKey() == idComentario ) {
	                iterator.remove();
	            }
	        }
	    }
	 
	
	 
	public double mediaAvaliacao(Comentario comentario) {
		double soma = 0;
		for(int k = 0; k <= i; k++) {
			soma += comentario.getNota();
		}
		return soma/i;
	}

	@Override
	public String toString() {
		return "Comentario [autor=" + autor + ", data=" + data + ", conteudo=" + conteudo + ", idCometario="
				+ idCometario + ", nota=" + nota + "]";
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getIdCometario() {
		return idCometario;
	}

	public void setIdCometario(int idCometario) {
		this.idCometario = idCometario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	

}
