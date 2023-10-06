import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1.c Skriv en Main klasse med en main metode, hvor der oprettes en ArrayList, som du kalder 'customers'.
        // (Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)
        ArrayList<Customer> customers = new ArrayList<>();

        Customer c1 = new Customer("Linda", "Hansen", "Linda_H" + "\n");
        Customer c2 = new Customer("Albert", "Mogensen", "A_M" + "\n");
        Customer c3 = new Customer("Christina", "Lindberg", "C.Lindberg");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        printCustomers(customers); // Test metoden (fra 1.d) fra main ved at kalde den med din ArrayList som argument.

    }

// 1.d Skriv en static metode i Main kaldet printCustomers(ArrayList customers),
// hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop.
    public static void printCustomers (ArrayList <Customer> customers) {
        for(Customer c: customers){
            System.out.println(c);
        }
    }
}