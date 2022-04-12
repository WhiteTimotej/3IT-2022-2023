package ulohy;

public class Pes {
  private  String rasa;
  private  String pohlavie;
  private  String meno;
  private  double vek;





    public Pes(String rasa, String pohlavie, String meno, double vek){
        this.rasa=rasa;
        this.pohlavie=pohlavie;
        this.meno=meno;
        this.vek=vek;


    }
    @Override
    public String toString() {
        return "Pes{" +
                "rasa='" + rasa + '\'' +
                ", pohlavie='" + pohlavie + '\'' +
                ", meno='" + meno + '\'' +
                ", vek=" + vek +
                '}';
    }
    public void pessahra(){
        if(Pes.pohlavie.equals("Fena")) {


            System.out.println(meno + "hra sa s" + Pes.meno);
        }else{
            System.out.println(meno + "pokusal" + Pes.meno);

            System.out.println(Tomas.getRasa());
            System.out.println(Tomas.getVek());
            System.out.println(Tomas.getMeno());
            System.out.println(Tomas.getPohlavie);
            Tomas.setVek(69);
            System.out.println(Tomas.getVek());
    }
    }

}
