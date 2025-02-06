package br.com.seteupTec.ERP.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "patrimonio")
public class Patrimonio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cidadeMatriz", length = 100, nullable = true)
    private String cidadeMatriz;

    @Column(name = "bairroFilial", length = 100, nullable = true)
    private String bairroFilial;

    @Column(name = "numeroInventario", length = 100, nullable = true)
    private Integer numeroInventario;

    @Column(name = "placaPatrimonio", length = 100, nullable = true)
    private String placaPatrimonio;

    @Column(name = "centroCusto", length = 100, nullable = true)
    private String centroCusto;

    @Column(name = "contaContabil", length = 100, nullable = true)
    private String contaContabil;

    @Column(name = "tipoPatrimonio", length = 100, nullable = true)
    private String tipoPatrimonio;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCidadeMatriz() {
        return cidadeMatriz;
    }

    public void setCidadeMatriz(String cidadeMatriz) {
        this.cidadeMatriz = cidadeMatriz;
    }

    public String getBairroFilial() {
        return bairroFilial;
    }

    public void setBairroFilial(String bairroFilial) {
        this.bairroFilial = bairroFilial;
    }

    public Integer getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(Integer numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    public String getPlacaPatrimonio() {
        return placaPatrimonio;
    }

    public void setPlacaPatrimonio(String placaPatrimonio) {
        this.placaPatrimonio = placaPatrimonio;
    }

    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getContaContabil() {
        return contaContabil;
    }

    public void setContaContabil(String contaContabil) {
        this.contaContabil = contaContabil;
    }

    public String getTipoPatrimonio() {
        return tipoPatrimonio;
    }

    public void setTipoPatrimonio(String tipoPatrimonio) {
        this.tipoPatrimonio = tipoPatrimonio;
    }
}
