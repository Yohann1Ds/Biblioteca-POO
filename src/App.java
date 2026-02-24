public class App {
    public static void main(String[] args) throws Exception {
        Usuario glauber = new Usuario();
        glauber.nome = "Glauber";    
        System.out.println("Hello " + glauber.nome);
        System.out.println("Dono do e-mail: " + glauber.email);
    }
}
