import java.util.UUID;


public class Setor {
    private String nome;
    private UUID id;
    
    public Setor(String nome) {
        this.nome = nome;
        id = UUID.randomUUID();
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public UUID getId() {
        return id;
    }
    
    
    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}