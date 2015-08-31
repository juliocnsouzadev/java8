package br.com.juliocnsouza.java8.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author juliocnsouza
 */
public class Datas {

    public static void main( String[] args ) {
        LocalDate hoje = LocalDate.now();

        LocalDate data = LocalDate.of( 2009 , Month.JANUARY , 25 );

        Period periodo = Period.between( hoje , data );

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern(
                "dd 'do' MM 'de' yyyy" );

        System.out.println( formatador.format( data ) );
    }

}
