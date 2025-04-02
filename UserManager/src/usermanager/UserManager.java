/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usermanager;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import model.User;

/**
 *
 * @author ADMIN
 */
public class UserManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Tinhuynh", 25, "Da Nang"),
                new User("NgocQuang", 22, "Da Nang"),
                new User("ThanhHai", 28, "Da Nang"),
                new User("DucThanh", 35, "Ha Noi"),
                new User("QuangHai", 24, "Sai Gon"),
                new User("HoangAnh", 27, "Yen Bai"),
                new User("TamHuynh", 21, "Ha Noi")
        );

        List<User> filteredUser = users.stream()
                .filter(user -> user.getUserOld() >= 20 && user.getUserOld() <= 30)
                .collect(Collectors.toList());

        System.out.println("User Filter: (20<Old<30");
        filteredUser.forEach(System.out::println);

        Map<String, Long> usersByCity = users.stream()
                .collect(Collectors.groupingBy(User::getUserCity, Collectors.counting()));

        System.out.println("\nUsers grouped by city (with count):");
        usersByCity.forEach((city, count) -> System.out.println(city + ": " + count));

        Optional<List<String>> citiesWithAtLeastTwoUsers = Optional.of(
                usersByCity.entrySet().stream()
                        .filter(entry -> entry.getValue() >= 2)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList())
        );

        System.out.println("\nCities with at least 2 users:");
        citiesWithAtLeastTwoUsers.ifPresent(cities -> cities.forEach(System.out::println));
    }

}
