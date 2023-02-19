package views;
import java.util.ArrayList;
import models.Employee;
import models.Restapi;

/*
* File: Console.java
* Author: Serényi Zsolt Ödön
* Copyright: 2023, Serényi Zsolt Ödön
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/

public class Console {
    Restapi restapi;
    public Console(Restapi restapi) {
        this.restapi = restapi;
        this.start();
    }
    public void start() {
        ArrayList<Employee> employees = this.restapi.getEmployees();
        for
        (Employee employee: employees) {
            System.out.printf("%s %10s %12s %10s\n", "Qty", "Desc.", "Unit \$", "Total");
             employee.city,
             employee.address,
             employee.size,
             employee.price
             );
        }
    }
    
}
