package br.com.asty.mvc.mudi.dto;

import br.com.asty.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {

    private String nome;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {

        Pedido pedido = new Pedido();
        pedido.setNome(getNome());
        pedido.setUrlImagem(getUrlImagem());
        pedido.setUrlProduto(getUrlProduto());
        pedido.setDescricao(getDescricao());

        return pedido;
    }

}