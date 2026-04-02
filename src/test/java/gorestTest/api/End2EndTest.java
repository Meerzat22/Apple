package gorestTest.api;


import gorest.controller.UserController;
import gorest.file.ConfigurationManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("API")
public class End2EndTest {

    UserController userController;


    @BeforeAll
    static void initController(){
        new UserController(ConfigurationManager.getBaseConfig().gorestBaseUrl());
    }

    @Test
    @DisplayName("End2End create user -> create comment -> create todo -> delete user")
    void endToEndUserFlowTest(){

    }

}
