package br.com.juliocnsouza.java8;

/**
 *
 * @author juliocnsouza
 */
public class ThreadsWithLambda {

    public static void main( String[] args ) {
        new Thread( () -> System.out.println( "Executando um Runnable" ) ).start();
    }

}
