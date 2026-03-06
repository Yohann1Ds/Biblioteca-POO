//Importando Arrays e Painel
import java.util.Arraylist;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
//Lista para armazenar livros e usuários
        Arraylist<Livros> livros = new Arraylist<>();
        Arraylist<Usuario> usuarios = new Arraylist<>();

        int opcao;

//Laço principal do menu        
       do {
//Menu principal        
        String menu = "===== BIBLIOTECA =====\n"
        + "1 - Listar acervo\n"
        + "2 - Listar usuários\n"
        + "3 - Emprestar livro\n"
        + "4 - Devolver livro\n"
        + "5 - Cadastrar livro\n"
        + "6 - Cadastrar usuário\n"
        + "7 - Sair\n";

    opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

    switch (opcao) {
//Listar livros
        case 1:
            if (livros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum livros cadastrado");
            } else {
                String lista = "";
                for (int i = 0; i < livros.size(); i++) {
                    lista += (i + 1) + " - " + livros.get(i) + "\n\n";
                }
                JOptionPane.showMessageDialog(null, lista);
            }
            break;
//Listar usuários            
            case 2:
                if (usuarios.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");                   
                } else {
                    String lista = "";
                    for (int i = 0; i < suarios.size(); i++) {
                        lista += (i + 1) + " - " + usuarios.get(i) + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                }
                break;
//Emprestar Livro                
                case 3:
                    if (livros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
                        break;
                    }

                    String listaEmprestar = "";
                    for (int i = 0; i < livros.size(); i++) {
                        listaEmprestar += (i + 1) + " - " + livros.get(i) + "\n\n";
                    }

                    int numEmprestar = Integer.parseInt(
                        JOptionPane.showInputDialog(listaEmprestar + "\nEscolha o número do livro:")
                    );

                    if (numEmprestar > 0 && numEmprestar <= livros.size()) {
                        Livro livro = livros.get(numEmprestar - 1);

                        if (!livro.isEmprestado()) {
                            livro.emprestar();
                            JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Livro já está emprestado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção inválida.")
                        }

                    }
                    break;
                    
    }   

       }
    }
}
