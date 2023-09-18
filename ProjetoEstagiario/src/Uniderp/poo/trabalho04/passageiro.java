package Uniderp.poo.trabalho04;

public class passageiro {
    
    private String numeroCartao;
    private String documento;
    
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public passageiro(String numeroCartao, String documento) {
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

    
}
