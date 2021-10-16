package com.obregon;

public class FordFocusFactory implements CocheFactory{


    public Motor crearMotor() {

        return new FocusMotor();
    }


    public Carroceria crearCarroceria() {

        return new FocusCarroceria();
    }



}