import java.util.*;

//Institute class representing the institute, with name, phone and address as
// fields
public class Institute {

    public Institute(String name, int phone, String address, ArrayList<Department> departments) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.departments = departments;
    }
    String name;
    int phone;
    String address;
    ArrayList<Department> departments;

}