import javax.xml.namespace.QName;

class Course {
    String name;
    private double price;

    //Constructor
    public Course (String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Method
    public double getPrice (){
        return this.price ;
    }
    //Method for discount
    public void applyDiscount (double discountAmount){
        price -= discountAmount;
    }
}

class PremiumCourse extends Course {
   private int mentorShipHours;

   //Constructor
    public PremiumCourse (String name, double price, int mentorShipHours){
        super (name, price);
        this.mentorShipHours = mentorShipHours;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (this.mentorShipHours * 50);
    }
}

public class Main{
    public static void main(String[] args) {

        PremiumCourse Economy = new PremiumCourse("BTC", 100, 5);
        Economy.applyDiscount(20);

            System.out.println("Course " +Economy.name);
            System.out.println("Final price with mentorship = " +Economy.getPrice()+ " Dollars");
    }
}