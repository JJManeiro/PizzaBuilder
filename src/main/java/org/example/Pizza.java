package org.example;

public class Pizza {
String tipoSalsa,especia;
Boolean relleno,salsa,cebolla,gluten,exQueso,piJa,champiJones,jamon;
int masa,tamaJo,recogida;

public static final int Integral=0;
public static final int Fina=1;
public static final int Pan=2;
public static final int Matambre=3;

public static final int PequeJa=0;
public static final int Media=1;
public static final int Grande=2;

public static final int Tienda=0;
public static final int Domicilio=1;

public static final int no=0;
public static final int si=1;

public Pizza(){

        this.masa=Matambre;
        this.tamaJo=Grande;
        this.recogida=Tienda;
        this.relleno=true;
        this.salsa=true;
        this.cebolla=false;
        this.gluten=true;
        this.exQueso=true;
        this.piJa=true;
        this.champiJones=true;
        this.jamon=true;
        this.tipoSalsa="tomate frito";
        this.especia="oregano";
    }

    public Pizza(int masa, String tipoSalsa, Boolean relleno, Boolean salsa, Boolean cebolla, Boolean gluten, Boolean exQueso, Boolean piJa, Boolean champiJones, Boolean jamon, String especia, int tamaJo, int recogida) {
        this.masa = masa;
        this.tipoSalsa = tipoSalsa;
        this.relleno = relleno;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.gluten = gluten;
        this.exQueso = exQueso;
        this.piJa = piJa;
        this.champiJones = champiJones;
        this.jamon = jamon;
        this.especia = especia;
        this.tamaJo = tamaJo;
        this.recogida = recogida;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public Boolean getRelleno() {
        return relleno;
    }

    public void setRelleno(Boolean relleno) {
        this.relleno = relleno;
    }

    public Boolean getSalsa() {
        return salsa;
    }

    public void setSalsa(Boolean salsa) {
        this.salsa = salsa;
    }

    public Boolean getCebolla() {
        return cebolla;
    }

    public void setCebolla(Boolean cebolla) {
        this.cebolla = cebolla;
    }

    public Boolean getGluten() {
        return gluten;
    }

    public void setGluten(Boolean gluten) {
        this.gluten = gluten;
    }

    public Boolean getExQueso() {
        return exQueso;
    }

    public void setExQueso(Boolean exQueso) {
        this.exQueso = exQueso;
    }

    public Boolean getPiJa() {
        return piJa;
    }

    public void setPiJa(Boolean piJa) {
        this.piJa = piJa;
    }

    public Boolean getChampiJones() {
        return champiJones;
    }

    public void setChampiJones(Boolean champiJones) {
        this.champiJones = champiJones;
    }

    public Boolean getJamon() {
        return jamon;
    }

    public void setJamon(Boolean jamon) {
        this.jamon = jamon;
    }

    public String getTipo() {
        return especia;
    }

    public void setEspecia(String especia) {
        this.especia = especia;
    }

    public int getTamaJo() {
        return tamaJo;
    }

    public void setTamaJo(int tamaJo) {
        this.tamaJo = tamaJo;
    }

    public int getRecogida() {
        return recogida;
    }

    public void setRecogida(int recogida) {
        this.recogida = recogida;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipoSalsa='" + tipoSalsa + '\'' +
                ", especia='" + especia + '\'' +
                ", relleno=" + relleno +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", gluten=" + gluten +
                ", exQueso=" + exQueso +
                ", piJa=" + piJa +
                ", champiJones=" + champiJones +
                ", jamon=" + jamon +
                ", masa=" + masa +
                ", tamaJo=" + tamaJo +
                ", recogida=" + recogida +
                '}';
    }
}
