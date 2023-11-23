
package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import negocio.*;
import dados.*;


public class Main {

    private static Dados d = new Dados();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int op = -1;
        int aux;

        while (op != 0) {
            System.out.print(imprimirMenu());
            op = in.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Obrigado por utilizar o sistema. Até logo!");
                    break;
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    cadastrarFilme();
                    break;
                case 3:
                    cadastrarSerie();
                    break;
                case 4:
                	System.out.println("Escolha um dos usuários a seguir para adicionar um comentário:\n");
                	 listarUsuarios();
                	 aux = in.nextInt();
                	 Usuario usuario = d.getUsuarios()[aux];
                	 System.out.println("Escolha uma filme para adicionar um comentário:\n");
                	 listarFilmes();
                	 int escolhaObra = in.nextInt();
                	 Serie serie = d.getSeries()[escolhaObra];
                	 adicionarComentarioSerie(usuario, serie);
                    break;
                case 5:
                	listarUsuarios();
                    aux = in.nextInt();
                    Usuario usuario1 = d.getUsuarios()[aux];
                    System.out.println("Escolha uma filme para adicionar um comentário:\n");
                    listarSeries();
                    int escolhaObra1 = in.nextInt();
                    Serie serie1 = d.getSeries()[escolhaObra1];
                    adicionarComentarioSerie(usuario1, serie1);
                    break;
              

                

                case 7:
                    System.out.println("Digite o ID do usuário que deseja excluir: ");
                    int idUsuarioExcluir = in.nextInt();
                    for (Usuario usuario11 : d.getUsuarios()) {
                        if (usuario11.getIdUsuario() == idUsuarioExcluir) {
                            usuario11.excluirUsuario(idUsuarioExcluir);
                            System.out.println("Usuário excluído com sucesso!\n");
                            break;
                        }
                    }
                    break;
             

                case 10:
                    System.out.println("Digite o ID do comentário que deseja excluir: ");
                    int idComentarioExcluir = in.nextInt();
                    for (Comentario comentario : d.getComentarios()) {
                        if (comentario.getIdCometario() == idComentarioExcluir) {
                            comentario.excluirCometario(idComentarioExcluir);
                            System.out.println("Comentário excluído com sucesso!\n");
                            break;
                        }
                    }
                    break;


               
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
        in.close();
    }
    
    public static int getSeries() {
        return 0;
    }
    public static int getFilmes() {
        return 0;
    }

    public static String imprimirMenu() {
		String saida = new String("Escolha uma das opcoes a seguir:\n");
		saida = saida + "00 - Sair da aplicacao\n";
		saida = saida + "01 - cadastrarUsuario\n";
		saida = saida + "02 - cadastrarFilme\n";
		saida = saida + "03 - cadastrarSerie\n";
		saida = saida + "04 - listarUsuariosSerie\n";
		saida = saida + "05 - listarUsuariosFilme\n";
		
		return saida;
	}

	public static void cadastrarUsuario() {
        Usuario u = lerDadosUsuario();
        if (d.getnUsuarios() < 100) {
            d.setUsuarios(d.getnUsuarios(), u);
            d.setnUsuarios(d.getnUsuarios() + 1);
            System.out.println("Usuário cadastrado com sucesso!\n");
        } else {
            System.out.println("Não foi possível cadastrar o usuário!\n");
        }
    }

	public static Usuario lerDadosUsuario() {
        int idUsuario;
        String nome;
        String email;
        String senha;

        in.nextLine(); //esvazia dados do teclado
        System.out.println("Digite o nome do usuário: ");
         nome = in.nextLine();
        System.out.println("Digite o email do usuário:");
         email = in.nextLine();
        System.out.println("Digite a senha do usuário:");
         senha = in.nextLine();
        idUsuario = (int) Math.random();
        return new Usuario(idUsuario,nome,email,senha);
    }

    public static void cadastrarFilme() {
        Filme f = lerDadosFilme();
        if (d.getnFilmes() < 100) {
            d.setFilme(d.getnFilmes(), f);
            d.setnFilmes(d.getnFilmes() + 1);
            System.out.println("Filme cadastrado com sucesso!\n");
        } else {
            System.out.println("Não foi possível cadastrar o filme!\n");
        }
    }

    public static Filme lerDadosFilme() {
        int idObra = (int) (Math.random() * 1000); 
        in.nextLine(); 
        System.out.println("Digite o título do filme: ");
        String titulo = in.nextLine();
        System.out.println("Digite o nome do diretor: ");
        String diretor = in.nextLine();
        System.out.println("Digite o ano de lançamento do filme:");
        int anoLancamento = in.nextInt();
        in.nextLine(); 
        System.out.println("Digite o gênero: ");
        String genero = in.nextLine();
        System.out.println("Digite a classificação: ");
        int classificacao = in.nextInt();
        in.nextLine(); 
        System.out.println("Digite a duração: ");
        double duracao = in.nextDouble();
        in.nextLine(); 
        System.out.println("Digite se ele tem Oscar (true/false): ");
        boolean oscar = in.nextBoolean();
        in.nextLine(); 
        System.out.println("Digite a URL do trailer: ");
        String trailer = in.nextLine();
        System.out.println("Digite o elenco fixo: ");
        String elencoFixo = in.nextLine();
        return new Filme(idObra, titulo, diretor, anoLancamento, genero, classificacao, duracao, oscar, trailer, elencoFixo);
    }

   
 

    public static void listarUsuarios() {
        for (int i = 0; i < d.getnUsuarios(); i++)
            System.out.println(i + " -> " + d.getUsuarios()[i].toString());
    }

    
    

    

    public static void listarComentariosUsuario(Usuario usuario) {
        System.out.println("Comentários do usuário " + usuario.getNome() + ":\n");


        List<Comentario> comentarios = usuario.obterComentarios();

        for (Comentario comentario : comentarios) {
            System.out.println(comentario.toString());
        }
    }


    public static void cadastrarSerie() {
        if (d.getnSeries() < 100) {
            d.setnSeries(d.getnSeries() + 1);
            lerDadosSerie();
            System.out.println("Série cadastrada com sucesso!\n");
        } else {
            System.out.println("Não foi possível cadastrar a série!\n");
        }
    }


    public static Serie lerDadosSerie() {
        System.out.println("Digite o id da série:");
        int idObra = in.nextInt();
        in.nextLine(); //esvazia dados do teclado
        System.out.println("Digite o título da série: ");
        String titulo = in.nextLine();
        System.out.println("Digite o diretor da série:");
        String diretor = in.nextLine();
        System.out.println("Digite o ano de lançamento da série:");
        int anoLancamento = in.nextInt();
        in.nextLine(); //esvazia dados do teclado
        System.out.println("Digite o gênero da série:");
        String genero = in.nextLine();
        System.out.println("Digite a classificação da série:");
        int classificacao = in.nextInt();
        System.out.println("Digite o número de episódios da série:");
        int numEpisodios = in.nextInt();
        System.out.println("Digite o número de temporadas da série:");
        int numTemporadas = in.nextInt();
        System.out.println("Digite a duração média dos episódios da série:");
        double duracao = in.nextDouble();
        in.nextLine(); //esvazia dados do teclado
        System.out.println("Digite o elenco recorrente da série:");
        String elencoRecorrente = in.nextLine();
        System.out.println("Digite a sinopse do episódio da série:");
        String sinopseEp = in.nextLine();

        return new Serie(idObra, titulo, diretor, anoLancamento, genero, classificacao, numEpisodios, numTemporadas, duracao, elencoRecorrente, sinopseEp);
    }


    public static void listarFilmes() {
        for (int i = 0; i < d.getnFilmes(); i++)
            System.out.println(i + " -> " + d.getFilmes()[i].toString());
    }
    public static void listarSeries() {
        for (int i = 0; i < d.getnSeries(); i++)
            System.out.println(i + " -> " + d.getSeries()[i].toString());
    }

  


public static void adicionarComentarioFilme(Usuario usuario, Filme filme) {
    in.nextLine(); //esvazia dados do teclado
    System.out.println("Digite o comentário para o filme:");
    String texto = in.nextLine();
    Comentario comentario = new Comentario(usuario, "24/12/2023",texto,33,5);
    System.out.println("Comentário adicionado com sucesso!\n");
}
 public static void adicionarComentarioSerie(Usuario usuario, Serie serie) {
    in.nextLine(); //esvazia dados do teclado
    System.out.println("Digite o comentário para a serie:");
    String texto = in.nextLine();
    Comentario comentario = new Comentario(usuario, "24/12/2023",texto,33,5);
    System.out.println("Comentário adicionado com sucesso!\n");
}}
 
 
