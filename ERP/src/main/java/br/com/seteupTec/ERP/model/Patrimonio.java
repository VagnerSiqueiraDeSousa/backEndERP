package br.com.seteupTec.ERP.model;

public class Patrimonio {
    private String cidadeMatriz;
    private String bairroFilial;
    private int numeroInvetario;
    private String placaPatrimonio;
    private String centroCusto;
    private String contaContabil;
    private String tipoPatrimonio;

    public Patrimonio(String cidadeMatriz, String bairroFilial, int numeroInvetario, String placaPatrimonio, String centroCusto, String contaContabil, String tipoPatrimonio) {
        this.cidadeMatriz = cidadeMatriz;
        this.bairroFilial = bairroFilial;
        this.numeroInvetario = numeroInvetario;
        this.placaPatrimonio = placaPatrimonio;
        this.centroCusto = centroCusto;
        this.contaContabil = contaContabil;
        this.tipoPatrimonio = tipoPatrimonio;
    }

    public String getCidadeMatriz() {
        return cidadeMatriz;
    }

    public String getBairroFilial() {
        return bairroFilial;
    }

    public int getNumeroInvetario() {
        return numeroInvetario;
    }

    public String getPlacaPatrimonio() {
        return placaPatrimonio;
    }

    public String getCentroCusto() {
        return centroCusto;
    }

    public String getContaContabil() {
        return contaContabil;
    }

    public String getTipoPatrimonio() {
        return tipoPatrimonio;
    }

    public int getNumeroInventario() {
        return numeroInvetario;
    }
}
