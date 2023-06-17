package org.example;

public class PaoDeForma extends Pao{
    public String verificarPromocao(){
        if(this.calcularPreco() >= 5){
            return "promocao ativa.";

        }else{
            return "promocao nao ativa.";
        }

    }

    @Override
    public String getTipo(){
        return "Pao de forma";
    }


}
