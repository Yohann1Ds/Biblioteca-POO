// Classe dos livros
public class Livros {
// Atributos do livro
    private String  titulo;
    private String  autor;
    private boolean emprestado; // true = emprestado | false = disponível
    
// Constrtutor da classe
public Livros(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.emprestado = false; //Todo livro começa disponível
}

// Método retorna o título
public String getTitulo() {
    return titulo;
}
 
// Método retorna o autor
public String getAutor() {
    return autor;
} 

// Verifica se está emprestado
public boolean isEmprestado(){
    return emprestado;
}

// Método para emprestar o livro
public void emprestar() {
    emprestado = true;
}

// Método para devolver o livro
public void devolver() {
    emprestado = false;
}

// Método que mostra as informações dos livros
@Override
public String toString() {
    return "Título: " + titulo +
           "\nAutor: " + autor +
           "\nStatus: " +
(emprestado ? "Emprestado" : 
"Disponível");           
}

}
