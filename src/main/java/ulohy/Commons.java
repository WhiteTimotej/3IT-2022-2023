package ulohy;

public class Commons {
    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Commons {

        public static List<Film.PornoHerec> pornoHerci(){
            Film.PornoHerec jarko = new PornoHerec("Jaro Slavik", "Hulibrk"
                    ,19,9,100);
            PornoHerec ferko = new PornoHerec("Fero Vrana", "Mahojakotyc"
                    ,21,7,93);

            return Arrays.asList(jarko,ferko);
        }

        public static List<PornoHerecka> pornoHerecky(){
            PornoHerecka evka = new PornoHerecka(" Jane Doe",
                    "HmmMlask",50.6,21);
            PornoHerecka erzika = new PornoHerecka(" Jane Boo",
                    "huhucoctail",2.1,19);

            return Arrays.asList(erzika,evka);
        }
    }
}
