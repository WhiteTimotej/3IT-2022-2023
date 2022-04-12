package ulohy;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeAttributePropertyInfo;

public class Main {
    public static void main(String[] args) {
        Pes Tomas=new Pes("ratlik","pes","Patko",4);
        Pes Patrik=new Pes("pitbull","Pes","Jozinko",7);
        Pes Jozefina=new Pes("labrador","fena","Tominko",3);

        Tomas.pessahra();
        Patrik.pessahra();
        Jozefina.pessahra();
        System.out.println(Tomas.getRasa());
        System.out.println(Tomas.getVek());
        System.out.println(Tomas.getMeno());
        System.out.println(Tomas.getPohlavie);
        Tomas.setVek(69);
        System.out.println(Tomas.getVek());
    }
}