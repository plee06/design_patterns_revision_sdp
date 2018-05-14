package proxy.virtual;

import java.util.ArrayList;
import java.util.List;

// Our gigantic ContactList that should only be loaded into JVM when necessary ...



public class ContactListImpl implements ContactList {

    // Pretend this is some gigantic list ...
    private List<Employee> employees = new ArrayList<Employee>();

    @Override
    public List<Employee> getEmployeeList() {
        return employees;
    }
}
