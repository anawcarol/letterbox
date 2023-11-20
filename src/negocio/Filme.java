package negocio;
import java.util.List;
import java.util.Arrays;

public class Filme extends Obra{
	
	private double duracao;
	private boolean oscar;
	private String trailer;
	private String elencoFixo;
	
    public Filme(int idObra, String titulo, String diretor, String anoLancamento, String genero, String sinopse,
            int classificao, double duracao, boolean oscar, String trailer, String elencoFixo) {
        this.duracao = duracao;
        this.oscar = oscar;
        this.trailer = trailer;
        this.elencoFixo = elencoFixo;
    }

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public boolean isOscar() {
		return oscar;
	}

	public void setOscar(boolean oscar) {
		this.oscar = oscar;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getElencoFixo() {
		return elencoFixo;
	}

	public void setElencoFixo(String elencoFixo) {
		this.elencoFixo = elencoFixo;
	}
	
	public boolean verificarOscar() {
			return this.oscar;
	}
	
	public String ObterTrailer() {
		return this.trailer;
		
	}
	public List<String> listarElencoFixo(){
		String[] elencoArray = this.elencoFixo.split(",");
	    return Arrays.asList(elencoArray);
	}
	
	
}
