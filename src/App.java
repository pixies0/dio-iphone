import iphone.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 15 Pro", "iOS 17");

        // Testando Reprodutor Musical
        System.out.println("=== Reprodutor Musical ===");
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        System.out.println("\n=== Aparelho Telefônico ===");
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        System.out.println("\n=== Navegador Internet ===");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
