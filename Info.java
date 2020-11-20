public class Info {
    String imie;
    String nazwisko;
    int wiek;
    int Nrdzien;
    String get_imie() {
        return imie;
    }
    String get_nazwisko(){
        return nazwisko;
    }
    int get_Wiek(){
        return wiek;
    }
    int get_Nrdzien(){
        return Nrdzien;
    }
    void set_all(String imie, String nazwisko, int wiek, int Nrdzien)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.Nrdzien = Nrdzien;
    }
    public static void methodInfo(String imie, String nazwisko, int wiek, int Nrdzien){
        System.out.println("imie:" + imie);
        System.out.println("nazwisko;" + nazwisko);
        System.out.println("wiek:" + wiek);
        System.out.println("nr w dzienn:" + Nrdzien);
    }
}
