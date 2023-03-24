package org.example;

public class Builder {
protected Pizza pizzas;
public Pizza build(){
    return this.pizzas;
    }
public Builder (){
    pizzas = new Pizza();
    }
public Builder setMasa (int masa){
    pizzas.setMasa(masa);
    return this;
    }
public Builder setTamaJo (int TamaJo){
    pizzas.setTamaJo(TamaJo);
    return this;
    }
public Builder setRecogida (int recogida){
    pizzas.setRecogida(recogida);
    return this;
    }
public Builder setTipoSalsa (String tipoSalsa){
    pizzas.setTipoSalsa(tipoSalsa);
    return this;
    }
public Builder setEspecia (String especia){
    pizzas.setEspecia(especia);
    return this;
    }
public Builder setRelleno (boolean relleno){
    pizzas.setRelleno(relleno);
    return this;
    }
public Builder setSalsa(boolean salsa){
    pizzas.setSalsa(salsa);
    return this;
    }
public Builder setCebolla (boolean cebolla){
    pizzas.setCebolla(cebolla);
    return this;
    }
public Builder setGluten (boolean gluten){
    pizzas.setGluten(gluten);
    return this;
    }
public Builder setExQueso (boolean exQueso){
    pizzas.setExQueso(exQueso);
    return this;
    }
public Builder setPiJa (boolean piJa){
    pizzas.setPiJa(piJa);
    return this;
    }
public Builder setChampiJones (boolean champiJones){
    pizzas.setChampiJones(champiJones);
    return this;
    }
public Builder setJamon (boolean jamon){
    pizzas.setJamon(jamon);
    return this;
    }
}
