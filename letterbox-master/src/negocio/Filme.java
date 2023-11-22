package negocio;

import java.util.List;
import java.util.Arrays;

public class Filme extends Obra{

    private double duracao;
    private boolean oscar;
    private String trailer;
    private String elencoFixo;

  

    public Filme(int idObra, String titulosa, String diretor, int anoLancamento, String generolo, int classifacao,
			double duracao, boolean oscar, String trailer, String elencoFixo) {
		super(idObra, titulosa, diretor, anoLancamento, generolo, classifacao);
		this.duracao = duracao;
		this.oscar = oscar;
		this.trailer = trailer;
		this.elencoFixo = elencoFixo;
	}


	public double getDuracao() {

        return duracao;
    }


    public boolean isOscar() {
        return oscar;
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


    public boolean verificarOscar(Filme filme) {
        if (filme.oscar) {
        return this.oscar;
        } else {
            return false;
        }

    }



    public List<String> listarElencoFixo(){
        String[] elencoArray = this.elencoFixo.split(",");
        return Arrays.asList(elencoArray);
    }


}
