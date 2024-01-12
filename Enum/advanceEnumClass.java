package Codes.Enum;

public class advanceEnumClass {
    public static void main(String[] args) {
        laptop lap = laptop.Mac;
        System.out.println(lap.getPrice());
    }
}

// enum extends enum class
enum laptop{
    // below are the objects of that class
    Mac(2000),
    XPS(1500),
    ThinkPad(1200);

    private int price;
    private laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }  
    
}