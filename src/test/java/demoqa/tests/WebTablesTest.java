package demoqa.tests;

import c.demoqa.models.Employee;
import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.List;
@Tag("UI")
public class WebTablesTest extends BaseTest {

    @Test
    void webTablesTest(){
        driver.get("https://demoqa.com/webtables");
        List<Employee> employeeList = webTablesPage.getEmployeesFromTables();

        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
