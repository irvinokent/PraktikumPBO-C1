public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("Vehicle price: " + price);
    }

    void sewa() {
        System.out.println("Sewa kendaraan.");
    }
}
