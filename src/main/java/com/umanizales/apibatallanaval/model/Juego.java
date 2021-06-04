package com.umanizales.apibatallanaval.model;


import com.umanizales.apibatallanaval.model.dto.CoordenadaDTO;
import com.umanizales.apibatallanaval.model.entities.Barco;
import com.umanizales.apibatallanaval.model.entities.Usuario;

import java.io.Serializable;

public class Juego implements Serializable {


    public boolean AciertoBarco(Barco barco, CoordenadaDTO cordenada,ListaDE lista){
        while ( lista !=null){
            if(barco.getNumeroCasillas() == cordenada.getX() && barco.getNumeroCasillas() == cordenada.getY() ) {
                return true;
            }else  if (barco.getNumeroCasillas() == cordenada.getY()  && barco.getNumeroCasillas() == cordenada.getX()){
                return  true;
            }
        }
        return  false;
    }
    public boolean agua(CoordenadaDTO cordenada, Barco barco, ListaDE lista){
        while ( lista !=null){
            if(barco.getNumeroCasillas() != cordenada.getX() || barco.getNumeroCasillas() !=cordenada.getY()){
                return true;
            }
        }
        return false;
    }
    public boolean hundido(CoordenadaDTO cordenada, Barco barco, ListaDE lista){
        while ( lista !=null){
            if(barco.getNumeroCasillas() >= 1 || barco.getNumeroCasillas() <=2 ) {
                if (barco.getNumeroCasillas() == cordenada.getY() || barco.getNumeroCasillas() == cordenada.getX()) {
                    return true;
                }
            }else if (barco.getNumeroCasillas() >= 2 || barco.getNumeroCasillas() <= 4  ){
                if (barco.getNumeroCasillas() == cordenada.getY() || barco.getNumeroCasillas() == cordenada.getX()) {
                    return true;
                }else if (barco.getNumeroCasillas() >=4 || barco.getNumeroCasillas() <=6){
                    if (barco.getNumeroCasillas() == cordenada.getY() || barco.getNumeroCasillas() == cordenada.getX()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }



}
