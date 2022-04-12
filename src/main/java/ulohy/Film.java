package ulohy;

public class Film {
    package Prvypolrok.Tyden11.PornoFilm;
import java.util.ArrayList;
import java.util.List;
    public class PornoHerec {

        String menoPriezvisko;
        String Prefix;
        double dlzkaCikule;
        double objemVacku;
        double dostrek;
        List<String> filmy = new ArrayList<>();
        final double objemJednehoStriku = 6.0;
        public void hraVofilme(String nazovfilmu){
            filmy.add(nazovfilmu);
            objemVacku=objemVacku-objemJednehoStriku;
        }




        public PornoHerec(){

        }

        public PornoHerec(String Atribut1,String Atribut2,double Atribut3,double Atribut4,double Atribut5){
            this.menoPriezvisko=Atribut1;
            this.Prefix = Atribut2;
            this.dlzkaCikule=Atribut3;
            this.objemVacku=Atribut4;
            this.dostrek=Atribut5;
        }


        @Override
        public String toString() {
            return "PornoHerec{" +
                    "menoPriezvisko='" + menoPriezvisko + '\'' +
                    ", Prefix='" + Prefix + '\'' +
                    ", dlzkaCikule=" + dlzkaCikule +
                    ", objemVacku=" + objemVacku +
                    ", dostrek=" + dostrek +
                    ", filmy=" + filmy +
                    '}';
        }

        public double getObjemJednehoStriku() {
            return objemJednehoStriku;
        }

        public String getMenoPriezvisko(){return menoPriezvisko;}
        public double getDlzkaCikule(){return dlzkaCikule;}

    }
}
