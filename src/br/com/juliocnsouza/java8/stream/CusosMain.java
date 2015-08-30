package br.com.juliocnsouza.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author juliocnsouzadev
 */
public class CusosMain {

    public static void main( String[] args ) {
        List<Curso> cursos = Arrays.asList(
                getCurso( "Culinária" , 45 ) ,
                getCurso( "Corte e Costura" , 150 ) ,
                getCurso( "Moda" , 113 ) ,
                getCurso( "Confeireiro" , 55 ) );

        cursos.sort( Comparator.comparingInt( c -> c.getAlunos() ) );

        cursos
                .stream()
                .filter( c -> c.getAlunos() > 50 )
                .forEach( c -> System.out.println( c.getNome() ) );

        Stream<Integer> map = cursos
                .stream()
                .map( c -> c.getAlunos() );

        cursos.stream()
                .filter( c -> c.getAlunos() > 50 )
                .map( Curso :: getAlunos )
                .forEach( System.out :: println );
    }

    private static Curso getCurso( String nome , int alunos ) {
        Curso c = new Curso( alunos , nome );
        return c;
    }

}
