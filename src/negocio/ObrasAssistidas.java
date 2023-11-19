package negocio;

import java.util.ArrayList;
import java.util.List;

public class ObrasAssistidas {
    private List<Obra> obrasAssistidas;
    private List<Obra> obrasFavoritas; // Adicionando uma lista separada para obras favoritas

    public ObrasAssistidas() {
        this.obrasAssistidas = new ArrayList<>();
        this.obrasFavoritas = new ArrayList<>();
    }

    public void adicionarObraAssistida(Obra obra) {
        this.obrasAssistidas.add(obra);
    }

    public List<Obra> listarObrasAssistidas() {
        return this.obrasAssistidas;
    }

    public void adicionarObraFavorita(Obra obra) {
        // Adiciona uma obra à lista de obras favoritas
        this.obrasFavoritas.add(obra);
    }

    public List<Obra> listarObrasFavoritas() {
   
        return this.obrasFavoritas;
    }
}
