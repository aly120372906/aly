package practise.practise15;

public class Browser {
    public static void main(String[] args) {
        String adresCubugu= "Her Browserda adresCubugu vardir";

        Edge edge = new Edge();
        edge.search();
        edge.sifreKaydetme();
        edge.get();

        Edge edge2 = new Edge(adresCubugu);
        edge2.adresCubugu();





    }






    public void get(){
        System.out.println("Browserlar Web sayfasina gider");
    }
    public void search(){
        System.out.println("Browserlar Web arastirma yapar");
    }
    public void sifreKaydetme(){
        System.out.println("Browserlar istediginde sifreyi kayit eder");
    }
}