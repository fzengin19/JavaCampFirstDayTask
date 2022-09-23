public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(3,5);
        int toplam = topla2(2,3,4);
        System.out.println(sayi);
        System.out.println(toplam);

    }
    public static void add(){
        System.out.println("Added");
    }
    public static void update(){
        System.out.println("Updated");
    }
    public static void delete(){
        System.out.println("Deleted");
    }
    public static int topla(int sayi1, int sayi2){
        return  sayi1+sayi2;
    }

    public static int topla2(int... sayilar ){
        int toplam=0;

        for(int sayi:sayilar)
            toplam+=sayi;

        return toplam;
    }
}