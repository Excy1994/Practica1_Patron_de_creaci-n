package com.obregon;

public class OpelAstracFactory implements CocheFactory{

    @Override
    public Motor crearMotor() {

        return new AstraMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
   
        return new AstraCarroceria();
    }
    
}
