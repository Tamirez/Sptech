/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author tamirez
 */
public class Medicamento {

    private Integer id;
    private String nomeMedicamento;
    private Integer quantidadeEstoque;
    private Double valorVenda;

    public Medicamento(Integer id, String nomeMedicamento, Integer quantidadeEstoque, Double valorVenda) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorVenda = valorVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nomeMedicamento=" + nomeMedicamento + ", quantidadeEstoque=" + quantidadeEstoque + ", valorVenda=" + valorVenda + '}';
    }
    
    
    

}
