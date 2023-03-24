package com.example2.demo2.Entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class User {
    int id;
    String name;
    int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Map<Integer,User> map = new HashMap<Integer,User>();
        map.put(1,new User(1,"Hamid",70));
        map.put(2,new User(2,"Arsalan",80));
        map.put(3,new User(4,"Bilal",60));
        map.put(4,new User(4,"Imran",60));
        System.out.println(map.get(1).hashCode());
        System.out.println(map.get(2).hashCode());
        System.out.println(map.get(3).hashCode());
        System.out.println(map.get(4).hashCode());

        System.out.println(map);
        System.out.println("***********************");
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"Shoaib",45));
        list.add(new User(3,"Faisal",35));
        list.add(new User(2,"Mansoor",25));
        System.out.println(list.toString());
    }
}
