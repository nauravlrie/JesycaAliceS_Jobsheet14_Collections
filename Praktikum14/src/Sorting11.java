import java.util.ArrayList;
import java.util.Collections;
public class Sorting11 {
    public static void main(String[] args) {

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);

        System.out.println();

        ArrayList<Customer11> customers = new ArrayList<>();
        customers.add(new Customer11(5, "Budi"));
        customers.add(new Customer11(1, "Zakia"));
        customers.add(new Customer11(4, "Cica"));
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}

