// Encapsulation
class Students{
    private String name;
    private double marks;
    private int rollNo;
    private String course;


    public Students(String name, double marks, int rollNo, String course) {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
        this.course = course;
    }

    public String getName(){
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// Inheritance
class Order{
    private int orderId;
    private String address;
    private String product_name;
    private String payment_mode;
    private int customer_id;

    public Order(int orderId, String address, String product_name, String payment_mode, int customer_id) {
        this.orderId = orderId;
        this.address = address;
        this.product_name = product_name;
        this.payment_mode = payment_mode;
        this.customer_id = customer_id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}

class Mobiles{
    private String brand;
    private String model;
    private double price;

    public Mobiles(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}


class iPhone extends Mobiles{
    private boolean appleCarePlus;

    public iPhone(String brand, double price, String model, boolean appleCarePlus){
        super(brand, price, model);
        this.appleCarePlus = appleCarePlus;
    }
    public void display(){
        System.out.println("****** " + getBrand() + " ******");
        System.out.println("Model "+getModel());
        System.out.println("Cost "+getPrice());
        System.out.println("Apple Care+ "+appleCarePlus);
    }
}

// Polymorphism and Abstraction

abstract class Vehicles{
    private String brand;
    private String model;
    private int feulCapacity;

    public Vehicles(String brand, String model, int feulCapacity) {
        this.brand = brand;
        this.model = model;
        this.feulCapacity = feulCapacity;
    }

    public abstract void start();
    public abstract void breaks();
}


class Truck extends Vehicles{

    public Truck(String brand, String model, int feulCapacity){
        super(brand, model, feulCapacity);
    }

    // Runtime Polymorphism
    @Override
    public void start(){
        System.out.println("Truck Started...");
    }

    @Override
    public void breaks(){
        System.out.println("Truck Stopped...");
    }
}


class Cars extends Vehicles{

    public Cars(String brand, String model, int feulCapacity) {
        super(brand, model, feulCapacity);
    }

    // Runtime Polymorphism
    @Override
    public void start(){
        System.out.println("Car Started...");
    }

    @Override
    public void breaks(){
        System.out.println("Car Stopped...");
    }

}


class Bikes extends Vehicles{

    public Bikes(String brand, String model, int feulCapacity) {
        super(brand, model, feulCapacity);
    }

    // Runtime Polymorphism
    @Override
    public void start(){
        System.out.println("Bike Started...");
    }

    @Override
    public void breaks(){
        System.out.println("Bike Stopped...");
    }
}




public class OOPs {

    static void main(String[] args) {

//        Students std = new Students("Dishant", 80.25, 1001,"FSD");
//        System.out.println("Student Name "+std.getName());

//        iPhone mob1 = new iPhone("Apple ", 5, "iPhone Duo", true);
//        mob1.display();


        Truck truck = new Truck("Ashok Layland", "Samrat", 40);

        truck.start();
        truck.breaks();


        Bikes bike = new Bikes("Ducati", "Panigale V4", 17);

        bike.start();
        bike.breaks();
    }

}
