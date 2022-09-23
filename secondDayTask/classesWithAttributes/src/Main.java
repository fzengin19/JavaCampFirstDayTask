public class Main {
    public static void main(String[] args) {
        //Product product = new Product(1,"Laptop","beyaz","Asus Laptop",5000,1);
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(22);
        System.out.println(product.getName());


        ProductManager productManager= new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}