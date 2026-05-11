import java.time.LocalDate;


public class Acao {
    private String descricao;
    private LocalDate data;
    private Setor setorResponsavel;
    
    public Acao(String descricao, Setor setorResponsavel) {
        this.descricao = descricao;
        this.data = LocalDate.now();
        this.setorResponsavel = setorResponsavel;
    }
    
    // Getters 
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public Setor getSetorResponsavel() {
        return setorResponsavel;
    }
    
    // Setter
    public void setDescrcicao(String descricao) {
        this.descricao = descricao;
    }
}