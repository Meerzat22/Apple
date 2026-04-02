package c.demoqa.utils;

import c.demoqa.models.UserPracticeForm;
import com.github.javafaker.Faker;

public class RandomUtils {

    private static Faker faker = new Faker();

    public static UserPracticeForm generatePracticeFormUser(){

        UserPracticeForm userPracticeForm = new UserPracticeForm();

        userPracticeForm.setFirsName(faker.name().firstName());
        userPracticeForm.setLastName(faker.name().lastName());
        userPracticeForm.setUserEmail(faker.internet().emailAddress());
        userPracticeForm.setMobileNumber(String.valueOf(faker.number().randomNumber()));
        userPracticeForm.setGender(faker.options().option("male","female","other"));
        userPracticeForm.setSubject(faker.options().option("Math","English"));
        userPracticeForm.setUserCurrentAddress(faker.address().fullAddress());
        return userPracticeForm;
    }

    public static void main(String[] args) {
        UserPracticeForm userPracticeForm = generatePracticeFormUser();
        System.out.println(userPracticeForm);
    }
}
