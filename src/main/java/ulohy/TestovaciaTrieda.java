package ulohy;

import java.util.List;

public class TestovaciaTrieda {
    public static void main(String[] args) {
        Osoba defaultnaOsoba = new Osoba();


        System.out.println(defaultnaOsoba);
        Osoba Patrik = new Osoba("Patrik","Smolicek",182);
        System.out.println(Patrik);
        Osoba Jozef = new Osoba("Jozef","Pradlovsky",183);
        System.out.println(Jozef);
        Osoba Tomas = new Osoba("Tomas","Kvackaj",188);
        System.out.println(Tomas);
        
        }


    }
}
