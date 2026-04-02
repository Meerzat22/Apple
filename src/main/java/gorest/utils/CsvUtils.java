package gorest.utils;


import gorest.models.UserResponse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvUtils {

    public static void writeUsersToCsv(String filePath, List<UserResponse> users) {
        try (FileWriter writer = new FileWriter(filePath)) {

            writer.append("id,name,email,gender,status\n");

            for (UserResponse user : users) {
                writer.append(String.valueOf(user.getId())).append(",");
                writer.append(user.getName()).append(",");
                writer.append(user.getEmail()).append(",");
                writer.append(user.getGender()).append(",");
                writer.append(user.getStatus()).append("\n");
            }
                              // append пишет в черновик
            writer.flush();   // flush переносит в файл
            System.out.println("CSV файл успешно создан: " + filePath);

        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи CSV", e);
        }
    }
}
