package negocio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Obra {	

	    private int idObra;
	    private String titulo;
	    private String diretor;
	    private int anoLancamento;
	    private String genero;
	    private int classifacao;
	    static Map<Integer, Obra> map = new HashMap<>();

	    public Obra(int idObra, String titulosa, String diretor, int anoLancamento, String generolo, int classifacao) {
	        this.idObra = idObra;
	        this.titulo = titulosa;
	        this.diretor = diretor;
	        this.anoLancamento = anoLancamento;
	        this.genero = generolo;
	        this.classifacao = classifacao;
	        map.put(idObra, this);
	    }

	    public void excluirObra(int idObra) {
	        Iterator<Map.Entry<Integer, Obra>> iterator = map.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Integer, Obra> entry = iterator.next();
	            if (entry.getKey() == idObra) {
	                iterator.remove();
	            }
	        }
	    }
	    
	    public List<Obra> buscarPorGenero(String genero) {
	        List<Obra> aux = new ArrayList<>();

	        for (Obra obraAtual : map.values()) {
	            if (obraAtual.getGenero().equals(genero)) {
	                aux.add(obraAtual);
	            }
	        }

	        return aux;
	    }
	    
	    public List<Obra> buscarPorAno(int anoLancamento) {
	        List<Obra> aux = new ArrayList<>();

	        for (Obra obraAtual : map.values()) {
	            if (obraAtual.getAnoLancamento() == anoLancamento){
	                aux.add(obraAtual);
	            }
	        }

	        return aux;
	    }
	    
	    public List<Obra> buscarPorTitulo(String Titulo) {
	        List<Obra> aux = new ArrayList<>();

	        for (Obra obraAtual : map.values()) {
	            if (obraAtual.getGenero().equals(Titulo)){
	                aux.add(obraAtual);
	            }
	        }

	        return aux;
	    }

	    @Override
	    public String toString() {
	        return " idObra = " + idObra + "\n titulo = " + titulo + "\n diretor = " + diretor + "\n anoLancamento = "
	                + anoLancamento + "\n genero = " + genero + "\n classifacao = " + classifacao + "\n";
	    }



		public int getIdObra() {
			return idObra;
		}

		public void setIdObra(int idObra) {
			this.idObra = idObra;
		}

		public String getTitulosa() {
			return titulo;
		}

		public void setTitulosa(String titulosa) {
			this.titulo = titulosa;
		}

		public String getDiretor() {
			return diretor;
		}

		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}

		public int getAnoLancamento() {
			return anoLancamento;
		}

		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenerolo(String generolo) {
			this.genero = generolo;
		}

		public int getClassifacao() {
			return classifacao;
		}

		public void setClassifacao(int classifacao) {
			this.classifacao = classifacao;
		}




	

}
