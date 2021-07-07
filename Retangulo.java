/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_exemplo03.desenho;

/**
 *
 * @author RonaldoCandido
 */
public class Retangulo {

    private int largura, altura, x, y;

    public Retangulo(Retangulo outro) {
        largura = outro.getLargura();
        altura = outro.getAltura();
        x = outro.getX();
        y = outro.getY();
    }

    public Retangulo(int largura, int altura, int x, int y) {
        this.largura = largura;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public Retangulo() {
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
