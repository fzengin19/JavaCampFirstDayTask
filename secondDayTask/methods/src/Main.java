public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = {1,2,3,4,5,7,9,0};
        int aranacak = 7  ;
        boolean varMi=false;
        for(int i : sayilar)
        {
            if(i == aranacak)
                varMi=true;
        }
        if(varMi)
            System.out.println("sayı bulundu");
        else
            System.out.println("sayı bulunamadı");

    }
}