package com.exampale.option;

import java.util.Optional;

/**
 * @author Ray.Ma
 * @date 2019/10/12 15:15
 */

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public static String getName(User user) {
        return Optional.ofNullable(user).map(u -> u.name).orElse("Unknown");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
