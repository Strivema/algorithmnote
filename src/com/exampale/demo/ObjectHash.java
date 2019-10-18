package com.exampale.demo;

import java.util.Objects;

/**
 * @author Ray.Ma
 * @date 2019/10/16 16:30
 */
public class ObjectHash {
    private String name;

    private int age;

    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectHash that = (ObjectHash) o;
        return age == that.age &&
                name.equals(that.name) &&
                msg.equals(that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, msg);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
