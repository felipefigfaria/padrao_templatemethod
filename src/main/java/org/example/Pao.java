package org.example;

public abstract class Pao {

    private Integer id;
    private String nome;
    private double kg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getTipo(){
        return "pao";
    }

    public double calcularPreco(){
        return this.kg * 1.5;
    }

    public abstract String verificarPromocao();


    public String getInfo() {
        return getTipo() + "{" +
                "id =" + this.id +
                ", nome='" + this.nome + '\'' +
                ", preco=" + this.calcularPreco() +
                '}';
    }
}