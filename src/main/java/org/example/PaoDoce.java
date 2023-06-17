package org.example;

public class PaoDoce extends Pao{
    public String verificarPromocao(){
        if(this.calcularPreco() >= 4){
            return "promocao ativa.";

        }else{
            return "promocao nao ativa.";
        }

    }


    @Override
    public String getTipo(){
        return "Pao doce";
    }

}