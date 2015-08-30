package br.com.juliocnsouza.java8;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juliocnsouza
 */
public class FirstConsumerWithLambdas {

    public static void main( String[] args ) {

        List<String> palavras = Arrays.asList( "julio" , "cesar" , "nunes" ,
                                               "de" , "souza" );

        palavras.sort( ( String s1 , String s2 ) -> {
            if ( s1.length() < s2.length() ) {
                return -1;
            }
            if ( s1.length() > s2.length() ) {
                return 1;
            }
            return 0;
        } );

        palavras.forEach( ( String palavra ) -> {
            System.out.println( palavra );
        } );

    }

}
