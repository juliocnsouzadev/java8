package br.com.juliocnsouza.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author juliocnsouza
 */
public class FirstConsumer {

    public static void main( String[] args ) {

        List<String> palavras = Arrays.asList( "julio" , "cesar" , "nunes" ,
                                               "de" , "souza" );

        palavras.sort( new Comparator<String>() {
            @Override
            public int compare( String s1 , String s2 ) {
                if ( s1.length() < s2.length() ) {
                    return -1;
                }
                if ( s1.length() > s2.length() ) {
                    return 1;
                }
                return 0;
            }
        } );

        palavras.forEach(
                new Consumer<String>() {
                    @Override
                    public void accept( String palavra
                    ) {
                        System.out.println( palavra );
                    }
                }
        );

    }

}
