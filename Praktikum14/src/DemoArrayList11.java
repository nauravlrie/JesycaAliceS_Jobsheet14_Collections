import java.util.ArrayList;

public class DemoArrayList11 {
    public static void main(String[] args) {
        ArrayList<Customer11> customers = new ArrayList<>(2);
        Customer11 customer1 = new Customer11(1, "Zakia");
        Customer11 customer2 = new Customer11(5, "Budi");
        customers.add(customer1);
        customers.add(customer2);

        System.out.println("===Data Awal===");
        for (Customer11 cust : customers) {
            System.out.println(cust);
        }
        customers.add(new Customer11(4, "Cica"));
        System.out.println("\n=== Setelah Menambah Cica ===");
        for (Customer11 cust : customers) {
            System.out.println(cust);
        }

        customers.add(2, new Customer11(100, "Rosa"));
        System.out.println("\n===Setelah Menambah Rosa pada Index 2===");
        for (Customer11 cust : customers) {
            System.out.println(cust);
        }
        System.out.println("\nPosisi/Index customer2: " + customers.indexOf(customer2));

        Customer11 customer = customers.get(1);
        System.out.println("\nData pada index 1:");
        System.out.println(customer.name);

        customer.name = "Budi Utomo";

        System.out.println("\n===Setelah Mengubah Nama Customer===");
        for (Customer11 cust : customers) {
            System.out.println(cust);
        }
        ArrayList<Customer11> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer11(201, "Della"));
        newCustomers.add(new Customer11(202, "Victor"));
        newCustomers.add(new Customer11(203, "Sarah"));

        customers.addAll(newCustomers);
        System.out.println("\n===Setelah addAll()===");
        for (Customer11 cust : customers) {
            System.out.println(cust);
        }
        System.out.println("\n===Cetak Langsung ArrayList===");
        System.out.println(customers);
    }
}