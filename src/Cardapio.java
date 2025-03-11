import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Prato> pratos;

    // Construtor
    public Cardapio() {
        pratos = new ArrayList<>();
    }

    // Método para adicionar um prato ao cardápio
    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    // Método para remover um prato do cardápio
    public void removerPrato(Prato prato) {
        pratos.remove(prato);
    }

    // Método para listar todos os pratos no cardápio
    public void listarPratos() {
        System.out.println("Cardápio:");
        for (Prato prato : pratos) {
            System.out.println("- " + prato);
        }
    }
}
