package br.com.juliocnsouza.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author juliocnsouza
 */
public class LambdasWithMethodReference {

    public static void main( String[] args ) {

        List<String> palavras = Arrays.asList( "julio" , "cesar" , "nunes" ,
                                               "de" , "souza" );

        palavras.sort( Comparator.comparing( s -> s.length() ) );
        palavras.sort( Comparator.comparing( String :: length ) );

        palavras.sort( Comparator.comparing( s -> s.hashCode() ) );
        palavras.sort( Comparator.comparing( String :: hashCode ) );

        palavras.forEach( System.out :: println );

    }

}
