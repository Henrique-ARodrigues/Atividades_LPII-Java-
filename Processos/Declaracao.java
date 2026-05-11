public class Declaracao extends Documento {
    public Declaracao(String tipo) {
        super(tipo, "Declaração");
    }
    
    @Override
    public void assinar(Setor setor) {
        System.out.println("A declaração foi assinada digitalmente pelo setor: " + setor.getNome());
    }
}