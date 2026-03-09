// Classe dos livros
public class Livros {
// Atributos do livro
    private String  titulo;
    private String  autor;
    private boolean emprestado; // true = emprestado | false = disponível
    
// Constrtutor da classe
// Serve para criar um novo objeto Livro já definindo título e autor
public Livros(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.emprestado = false; //Todo livro começa disponível
}

// Método GET
// Método retorna o título
public String getTitulo() {
    return titulo;
}
 
// Método GET 
// Método retorna o autor
public String getAutor() {
    return autor;
} 

// Método que verifica se o livro está emprestado
// Retorna true se estiver emprestado ou false se estiver disponível
public boolean isEmprestado(){
    return emprestado;
}

// Método para marcar o livro como emprestado
// Muda o valor da variável emprestado para true
public void emprestar() {
    emprestado = true;
}

// Método para devolver o livro
// Muda o valor da variável emprestado para false
public void devolver() {
    emprestado = false;
}

// @Override indica que estamos sobrescrevendo
// Método toString()
// Serve para retornar uma representação em texto do objeto
@Override
public String toString() {
    return "Título: " + titulo +
           "\nAutor: " + autor +
           "\nStatus: " +
(emprestado ? "Emprestado" : 
"Disponível");           
}

}
