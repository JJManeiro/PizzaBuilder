package org.example;

public class Main {
    public static void main(String[] args) {
        Pizza def = new Builder().build();
        Pizza hawaii = new Builder()
                .setPiJa(true).setSalsa(true).setJamon(true).setGluten(true).setChampiJones(true).setTipoSalsa("tomate frito").setCebolla(false)
                .setRelleno(false).setEspecia("oregano").setMasa(Pizza.Pan).setRecogida(Pizza.Domicilio).setTamaJo(Pizza.Media).build();
        System.out.println("pizza hawaii: "+hawaii.toString());
        System.out.println("pizza por defecto: "+def.toString());
    }
}