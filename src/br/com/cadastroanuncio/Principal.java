package br.com.cadastroanuncio;

import br.com.cadastroanuncio.entities.Anuncio;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Anuncio anuncio = new Anuncio("Procura-se analista de sistemas java", "Stefane",
                simpleDateFormat.parse("08/07/2021"), simpleDateFormat.parse("10/08/2021"), 50.00);

        anuncio.relatorio();
        System.out.println();
        System.out.println();

        Anuncio anuncio2 = new Anuncio("proucura-se programador capgemini", "luck",
                simpleDateFormat.parse("04/07/2021"), simpleDateFormat.parse("11/07/2021"), 100.00);
        anuncio2.relatorio();
    }
}
