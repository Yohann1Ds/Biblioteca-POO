import java.util.ArrayList;
import javax.swing.JOptionPane;

// Classe principal do sistema
public class Main {

    public static void main(String[] args) {

        // Listas para armazenar livros e usuários
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcao;

        // Laço principal do menu
        do {

            // Menu principal
            String menu = "===== BIBLIOTECA =====\n"
                    + "1 - Listar acervo\n"
                    + "2 - Listar usuários\n"
                    + "3 - Emprestar livro\n"
                    + "4 - Devolver livro\n"
                    + "5 - Cadastrar livro\n"
                    + "6 - Cadastrar usuário\n"
                    + "7 - Sair";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {

                case 1:
                    // Listar livros
                    if (livros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
                    } else {
                        String lista = "";
                        for (int i = 0; i < livros.size(); i++) {
                            lista += (i + 1) + " - " + livros.get(i) + "\n\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 2:
                    // Listar usuários
                    if (usuarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");
                    } else {
                        String lista = "";
                        for (int i = 0; i < usuarios.size(); i++) {
                            lista += (i + 1) + " - " + usuarios.get(i) + "\n\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 3:
                    // Emprestar livro
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
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }
                    break;

                case 4:
                    // Devolver livro
                    if (livros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
                        break;
                    }

                    String listaDevolver = "";
                    for (int i = 0; i < livros.size(); i++) {
                        listaDevolver += (i + 1) + " - " + livros.get(i) + "\n\n";
                    }

                    int numDevolver = Integer.parseInt(
                            JOptionPane.showInputDialog(listaDevolver + "\nEscolha o número do livro:")
                    );

                    if (numDevolver > 0 && numDevolver <= livros.size()) {
                        Livro livro = livros.get(numDevolver - 1);

                        if (livro.isEmprestado()) {
                            livro.devolver();
                            JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esse livro não está emprestado.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }
                    break;

                case 5:
                    // Cadastrar livro
                    String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
                    String autor = JOptionPane.showInputDialog("Digite o autor do livro:");

                    livros.add(new Livro(titulo, autor));
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    break;

                case 6:
                    // Cadastrar usuário
                    String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
                    String cpf = JOptionPane.showInputDialog("Digite o CPF do usuário:");

                    usuarios.add(new Usuario(nome, cpf));
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    break;

                case 7:
                    //Encerrar sistema
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 7);
    }
}