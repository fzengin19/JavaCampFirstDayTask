public class Main {
    public static void main(String[] args) {
        double[] mylist = {22.11, 1.3, 4.3, 5.6};
        double total = 0;
        double max = mylist[0];
        for (double number : mylist) {
            if (max < number)
                max = number;
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam" + total);
        System.out.println("En büyük" + max);

        

    }
}