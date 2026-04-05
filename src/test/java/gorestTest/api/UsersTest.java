package gorestTest.api;
import gorest.controller.UserController;
import gorest.file.ConfigurationManager;
import gorest.models.UserRequest;
import gorest.models.UserResponse;
import gorest.utils.CsvUtils;
import io.restassured.response.Response;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Tag("API")
public class UsersTest {

    UserController userController = new UserController(ConfigurationManager.getBaseConfig().gorestBaseUrl());


    @Test
    void createUserTest(){
        UserRequest user = UserRequest.builder()
                .name("Miraida")
                .email("miraida" + System.currentTimeMillis() + "@example.com")
                .gender("female")
                .status("active")
                .build();

        UserResponse createdUser = userController.createNewUser(user);

        assertNotNull(createdUser);
        assertNotNull(createdUser.getId());
    }

    @Test
    void getUserTest(){
        UserResponse user = userController.getUser("8411646");

        System.out.println(user);

        assert user != null;
        assert user.getId() != null;
    }


//    @Test
//    void performFullCrudOperationsForUserTest() {   проверки для создания пользователей
//
//        userController.getAllUsers();
//
//        User user = RandomDataGenerator.createRandomUser();
//        User actualUser = userController.createNewUser(user);
//        Integer id = actualUser.getId();
//
//        Assertions.assertThat(userController.getResponse().getStatusCode())
//                .as("Actual and expected status code are mismatch")
//                .isEqualTo(201);
//
//        Assertions.assertThat(actualUser)
//                .as("Response body mismatch")
//                .usingRecursiveComparison()
//                .ignoringFields("id")
//                .isEqualTo(user);
//
//        Assertions.assertThat(userController.getResponse().getTime())
//                .as("Response time is more than 1 second")
//                .isLessThan(1000);
//
//        Assertions.assertThat(userController.getResponse().getHeader("x-frame-options"))
//                .as("Header is not SAMEORIGIN")
//                .isEqualTo("SAMEORIGIN");
//
//        Assertions.assertThat(userController.getResponse().asByteArray().length)
//                .as("Response size should be greater than 0")
//                .isGreaterThan(0);
//
//        userController.getSingleUserById(id);
//
//        User updatedUser = User.builder()
//                .name("NewNameUpdate")
//                .build();
//
//        userController.partialUpdateUserDetailById(id, updatedUser);
//
//        User userAllDetailsUpdated = RandomDataGenerator.createRandomUser();
//        userController.updateAllUserDetails(id, userAllDetailsUpdated);
//
//        userController.deleteUser(id);
//    }

    @Test
    void deleteUserTest(){
        Response response = userController.deleteUser("8410036");

        System.out.println(response.getStatusCode());
        assert response.getStatusCode() == 204;
    }

    @Test
    void saveUsersToCsv(){
        UserResponse[] users = userController.getAllUsers();
        List<UserResponse> usersList = Arrays.asList(users);
        CsvUtils.writeUsersToCsv("C:\\OrangeUiProject\\src\\test\\java\\api\\users.csv", usersList);
    }


}
// создать класс для генерации рандомного юзера            ???????????????????????????
// добавить assert на id чтобы не был null
