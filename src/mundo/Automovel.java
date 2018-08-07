/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author tony
 */
public class Automovel {

    //atributos do automóvel
    /**
     * Modelo do automóvel
     */
    private String modelo;

    /**
     * Ano do automóvel
     */
    private int ano;

    /**
     * Cor do automóvel
     */
    private String cor;

    /**
     * O automóvel está ligado?
     */
    private boolean ligado = false;

    /**
     * Velocidade do automóvel
     */
    private int velocidade = 0;

    /**
     * Rotação do motor do automóvel
     */
    private int rotacao = 0;

    /**
     * Torque do automóvel
     */
    private int torque = 0;

    /**
     * Potência do automóvel
     */
    private int potencia;

    /**
     * Este é o método construtor de Automovel
     */
    public Automovel() {
        System.out.println("Construindo o automóvel.\n\tI'm alive! Vrum! Vrum!");
    }

    /**
     * Este é outro método construtor de Automovel que aceita parâmetros.
     *
     * @param modelo
     * @param ano
     * @param cor
     */
    public Automovel(String modelo, int ano, String cor, int potencia) {
        this();
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.potencia = potencia;
    }

    /**
     * Desliga o automóvel
     */
    public void apertarBuzina() {
        System.out.println("Buzinando\n\tBeep-Beep");
    }

    /**
     * @return a rotação
     */
    public int getRotacao() {
        return rotacao;
    }

    /**
     * @param rotacao a rotação a ser alterada
     */
    public void setRotacao(int rotacao) {
        this.rotacao = rotacao;
    }

    /**
     * @return o torque
     */
    public int getTorque() {
        return torque;
    }

    /**
     * @param torque o torque a ser alterado
     */
    public void setTorque(int torque) {
        this.torque = torque;
    }

    /**
     * @return o modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo o modelo a ser alterado
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return o ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano o ano a ser alterado
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return a cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor a cor a ser alterada
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @return a velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Liga o automóvel
     */
    public void ligar() {
        ligado = true;
    }

    /**
     * Desliga o automóvel
     */
    public void desligar() {
        ligado = false;
    }

    /**
     * Acelera o automóvel
     */
    public void acelerar() {
        velocidade++;
    }

    /**
     * Freia o automóvel
     */
    public void frear() {
        velocidade--;
    }

    @Override
    public String toString() {
        return String.format("Imprimindo o automóvel\n\tModelo: %s\n\tAno: %s\n\tCor: %s\n\tPotencia: %s",
                modelo, ano, cor, potencia);
    }
}
