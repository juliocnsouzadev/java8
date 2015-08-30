package br.com.juliocnsouza.java8.consumer;

import java.util.Arrays;
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

        palavras.forEach( new Consumer<String>() {
            @Override
            public void accept( String palavra ) {
                System.out.println( palavra );
            }
        } );

    }

}
