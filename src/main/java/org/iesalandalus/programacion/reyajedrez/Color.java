package org.iesalandalus.programacion.reyajedrez;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    private final String colorFicha;
    private String cadenaAMostrar;

    Color(String colorFicha) {
        this.colorFicha = colorFicha;
    }

    public String getRepresentacion() {
        return colorFicha;
    }
}
