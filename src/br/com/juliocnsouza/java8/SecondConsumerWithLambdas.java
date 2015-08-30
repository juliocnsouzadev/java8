package br.com.juliocnsouza.java8;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juliocnsouza
 */
public class SecondConsumerWithLambdas {

    public static void main( String[] args ) {

        List<String> palavras = Arrays.asList( "julio" , "cesar" , "nunes" ,
                                               "de" , "souza" );

        //sintaxes mais enxuta
        palavras.sort(
                ( s1 , s2 ) -> Integer.compare( s1.length() , s2.length() ) );

        palavras.forEach( palavra -> System.out.println( palavra ) );

    }

}
