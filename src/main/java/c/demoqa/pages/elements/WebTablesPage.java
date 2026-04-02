package c.demoqa.pages.elements;

import c.demoqa.models.Employee;
import c.demoqa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WebTablesPage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    private WebElement addBtn;

    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "userEmail")
    private WebElement userEmail;
    @FindBy(id = "age")
    private WebElement age;
    @FindBy(id = "salary")
    private WebElement salary;
    @FindBy(id = "department")
    private WebElement department;
    @FindBy (id = "submit")
    private WebElement submit;

    public WebTablesPage clickAdd(){
        elementActions.clickButton(addBtn);
        return this;
    }

    public WebTablesPage firstName (String name){
        elementActions.inputText(firstName,name);
        return this;
    }

    public WebTablesPage lastName (String name){
        elementActions.inputText(lastName,name);
        return this;
    }
    public WebTablesPage email (String name){
        elementActions.inputText(userEmail,name);
        return this;
    }

    public WebTablesPage age (String ageUser){
        elementActions.inputText(age,ageUser);
        return this;
    }

    public WebTablesPage salary (String name){
        elementActions.inputText(salary,name);
        return this;
    }

    public WebTablesPage department (String name){
        elementActions.inputText(department,name);
        return this;
    }

    public WebTablesPage submit(){
        elementActions.clickButton(submit);
        return this;
    }

    @FindBy(css = ".rt-tr-group")
    private List<WebElement> rowsList;

    public WebTablesPage addNewEmployee(){
        return this;
    }

    public ArrayList<Employee> getEmployeesFromTables(){
        ArrayList<Employee> employees = new ArrayList<>();
        for(WebElement row: rowsList){
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String firstName = cells.getFirst().getText();
            String lastName = cells.get(1).getText();
            String ageTxt = cells.get(2).getText().replaceAll("[^0-9]","");
            String email = cells.get(3).getText();
            String salaryTxt = cells.get(4).getText().replaceAll("[^0-9]","");;
            String department = cells.get(5).getText();

            if(firstName.isEmpty() || lastName.isEmpty() || ageTxt.isEmpty() || email.isEmpty() ||
            salaryTxt.isEmpty() || department.isEmpty()){
                continue; 
            }

            int age = Integer.parseInt(ageTxt.trim());
            int salary = Integer.parseInt(salaryTxt.trim());

            employees.add(new Employee(firstName, lastName, age, email, salary, department));
        }
        return employees;
    }

//    public ArrayList<Employee> deleteEmployee(){
//
//    }


}
