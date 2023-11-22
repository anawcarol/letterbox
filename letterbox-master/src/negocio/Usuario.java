package negocio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Usuario {
    private int idUsuario;
    private String nome;
	private String email;
	private String senha;
    static Map<Integer, Usuario> map = new HashMap<>();

   private ObrasAssistidas obrasAssistidas;

public Usuario(int idUsuario, String nome, String email, String senha) {
	
	this.idUsuario = idUsuario;
	this.nome = nome;
	this.email = email;
	this.senha = senha;
	
	map.put(idUsuario, this);
}

public void excluirUsuario(int idUsuario) {
    Iterator<Map.Entry<Integer, Usuario>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<Integer, Usuario> entry = iterator.next();
        if (entry.getKey() == idUsuario) {
            iterator.remove();
        }
    }
}


@Override
public String toString() {
	return "idUsuario = " + idUsuario + ", nome = " + nome + ", email = " + email + ", senha = " + senha
			+ ", obrasAssistidas = " + obrasAssistidas  ;
}


public int getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public ObrasAssistidas getObrasAssistidas() {
	return obrasAssistidas;
}

public void setObrasAssistidas(ObrasAssistidas obrasAssistidas) {
	this.obrasAssistidas = obrasAssistidas;
}
   

   

}
