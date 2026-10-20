package com.mycompany.ejercicio7;

public class TrianguloRect extends FiguraRecta {
    public TrianguloRect(int ancho, int alto) {
        this.alto = alto;
        this.ancho=ancho;
    }
        @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return ancho + alto + Math.sqrt((ancho * ancho) + (alto * alto));
    }
        @Override
    public String imprimeFigura() {
 return super.imprimeFigura() + "\n\nSe imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + ", area: " + String.format("%.2f", calcularArea()) + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}