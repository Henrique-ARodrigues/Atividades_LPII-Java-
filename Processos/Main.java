import java.util.List;

public class Main {
    public static void main(String[] args) {
        Setor protocolo = new Setor("Protocolo Central");
        Setor juridico = new Setor("Departamento Jurídico");
        Setor financeiro = new Setor("Financeiro");
        
        Processo proc = new Processo(1001, "Aberto", protocolo);
        System.out.println(">>> Processo n. " + proc.getNumero() + " aberto no setor: " + proc.getSetor().getNome());

        Documento doc = new Declaracao("PDF");
        doc.setProcesso(proc);
        
        doc.assinar(protocolo);

        System.out.println("\nEncaminhando processo...");
        proc.movimentar(juridico);
        
        System.out.println("Encaminhando processo...");
        proc.movimentar(financeiro);

        System.out.println("\n========================================");
        System.out.println("   RELATÓRIO DE RASTREABILIDADE (LOG)   ");
        System.out.println("========================================");

        List<Acao> historico = proc.getHistorico();
        
        for (Acao acao : historico) {
            System.out.println("DATA: " + acao.getData());
            System.out.println("AÇÃO: " + acao.getDescricao());
            System.out.println("SETOR RESPONSÁVEL: " + acao.getSetorResponsavel().getNome());
            System.out.println("ID ÚNICO DO SETOR: " + acao.getSetorResponsavel().getId());
            System.out.println("----------------------------------------");
        }
    }
}