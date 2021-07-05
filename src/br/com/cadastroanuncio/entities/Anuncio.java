package br.com.cadastroanuncio.entities;

import br.com.cadastroanuncio.service.Calculadora;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Anuncio {

    private String nomeDoAnuncio;

    private String cliente;

    private Date datadeInicio;

    private Date dataDeTermino;

    private double investimentoPorDia;

    public Anuncio(String nomeDoAnuncio, String cliente, Date datadeInicio, Date dataDeTermino, double investimentoPorDia) {
        this.nomeDoAnuncio = nomeDoAnuncio;
        this.cliente = cliente;
        this.datadeInicio = datadeInicio;
        this.dataDeTermino = dataDeTermino;
        this.investimentoPorDia = investimentoPorDia;
    }

    public String getNomeDoAnuncio() {
        return nomeDoAnuncio;
    }

    public void setNomeDoAnuncio(String nomeDoAnuncio) {
        this.nomeDoAnuncio = nomeDoAnuncio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDatadeInicio() {
        return datadeInicio;
    }

    public void setDatadeInicio(Date datadeInicio) {
        this.datadeInicio = datadeInicio;
    }

    public Date getDataDeTermino() {
        return dataDeTermino;
    }

    public void setDataDeTermino(Date dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    public double getInvestimentoPorDia() {
        return investimentoPorDia;
    }

    public void setInvestimentoPorDia(double investimentoPorDia) {
        this.investimentoPorDia = investimentoPorDia;
    }

    public double getTotalInvestimento() {
        long totalDeDias = retornaDiferencaEntreDatas(dataDeTermino, datadeInicio);
        return totalDeDias * investimentoPorDia;
    }

    private long retornaDiferencaEntreDatas(Date dataDeTermino, Date datadeInicio) {
        long milisegundos = Math.abs(dataDeTermino.getTime() - datadeInicio.getTime());
        long diferenca = TimeUnit.DAYS.convert(milisegundos, TimeUnit.MILLISECONDS);
        return diferenca;
    }

    public void relatorio() {
        System.out.println("*** Anuncio ***");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Valor total investido R$%.2f%n", getTotalInvestimento());
        Calculadora c1 = new Calculadora();
        c1.calculaInvestimeto(getTotalInvestimento());
    }
}
