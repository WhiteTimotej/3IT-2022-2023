package ulohy;

import java.util.Arrays;
import java.util.List;

public class film2 {

    public static List<Film.PornoHerec> pornoherci(){
        Pornoherec jarko = new Pornoherec("Jaro Slavik","Hulibrk",19,9,100);
        Pornoherec ferko = new Pornoherec("Fero Vrana","MaHoJakoTyc",21,7,93);

        return Arrays.asList(jarko,ferko);
    }
    public static List<Film.PornoHerec> pornoherci(){
        Pornoherecka jana = new Pornoherecka("Jana Slavikova","hulibrcka",19,9,100);
        Pornoherecka jozefina = new Pornoherecka("jozefina pradlovska","Majudlhu",1,6,93);

        return Arrays.asList(jana,jozefina);
}
