// Classe do usuário
public class Usuario {
  private String nome;
  private String cpf;

//Construtor
public Usuario(String nome, String cpf){
  this.nome = nome;
  this.cpf = cpf;
}

//Retorna o nome
public String getNome() {
  return nome;
}

//Retorna o cpf
public String getCpf() {
  return cpf;
}

//Mostra as informações do usuário
@Override
public String toString(
  return "Nome:" + nome + "\nCPF:" + cpf;
)

}
