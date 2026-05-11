import java.util.ArrayList;


public abstract class Documento {
    private String tipo;
    private Processo processo;
    private String especie;
    private ArrayList<Setor> assinaram;
    
    public Documento(String tipo, String especie) {
        this.tipo = tipo;
        this. especie = especie;
        this.assinaram = new ArrayList<>();
    }
    
    public Documento(String tipo, String especie, Processo processo) {
        this(tipo, especie);
        this.processo = processo;
    }
    
    public void addAssinatura(Setor setor) {
        this.assinaram.add(setor);
    }
    
    // Getters
    public String getTipo() { 
        return tipo;
    }
    public String getEspecie() {
        return especie; 
    }
    public Processo getProcesso() { 
        return processo;
    }
    public ArrayList<Setor> getAssinaram() { 
        return assinaram;
    }
    
    // Setters
    
    public void setProcesso(Processo processo) { 
        this.processo = processo;
    }
    public void setEspecie(String especie) { 
        this.especie = especie;
    }
    public void setTipo(String tipo) { 
        this.tipo = tipo;
    }
    
    public abstract void assinar(Setor setor);
    
}