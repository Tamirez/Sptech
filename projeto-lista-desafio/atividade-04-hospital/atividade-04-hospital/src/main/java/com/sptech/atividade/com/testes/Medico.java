package com.sptech.atividade.com.testes;

/**
 *
 * @author miniguiti
 */
public class Medico {

    private Integer Id;
    private String nome;
    private String especialidade;
    private boolean ativo = true;
    private Double salario = 0.0;
    
    

    public Medico(Integer Id, String nome, String especialidade) {
        this.Id = Id;
        this.nome = nome;
        this.especialidade = especialidade;
    }
    

    @Override
    public String toString() {
        return "Medico{" + "Id=" + Id + ", nome=" + nome + ", especialidade=" + especialidade + ", ativo=" + ativo + ", salario=" + salario + '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
