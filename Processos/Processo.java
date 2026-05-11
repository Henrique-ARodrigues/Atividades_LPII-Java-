import java.util.UUID;
import java.util.ArrayList;


public class Processo  {
    private int numero;
    private String status;
    private Setor setor;
    private ArrayList<Acao> historico;
    
    public Processo(int numero, String status, Setor setor) {
        this.numero = numero;
        this.status = status;
        this.setor = setor;
        this.historico = new ArrayList<>();
        
    }
    
    // Getters 
    public int getNumero() {
        return numero;
    }
    
    public UUID getId() {
        return setor.getId();
    }
    
    public String getStatus() {
        return status;
    }
    
    public Setor getSetor() {
        return setor;
    }
    
    
    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    
    public void registrarAcao(String descricao, Setor setor) {
        this.historico.add(new Acao(descricao, setor));
    }
    
    public ArrayList<Acao> getHistorico() {
        return historico;
    }
    
    public void movimentar(Setor novoSetor) {
        this.setor = novoSetor;
        
        String menssagem = "Processo movido para o setor: " + novoSetor.getNome();
        
        this.registrarAcao(menssagem, novoSetor);
    }
    
}