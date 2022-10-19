package com.sptech.atividade.com.testes;

/**
 *
 * @author miniguiti
 */
public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos = 0;
    private Integer quantidadeDeHoraExtra = 0;
    
    public void realizarPagamento (Medico medico, Double valorPagamento) {
        if (medico.isAtivo() && valorPagamento > 0) {
            medico.setSalario(valorPagamento);
            
        } else if {
            
            
        }
  
    
    }
    
    
    
    
    
//    
//    
//    public void realizarPagamento (Medico medico, Double valorPago) {
//        
//        if (medico.isAtivo() && medico.setSalario(valorPago) > 0.0) {
//            

    public Hospital(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public void setQuantidadeDePagamentos(Integer quantidadeDePagamentos) {
        this.quantidadeDePagamentos = quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }

    public void setQuantidadeDeHoraExtra(Integer quantidadeDeHoraExtra) {
        this.quantidadeDeHoraExtra = quantidadeDeHoraExtra;
    }
            
   

   
    
    

}
