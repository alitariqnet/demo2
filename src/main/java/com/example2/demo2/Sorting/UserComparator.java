package com.example2.demo2.Sorting;

import com.example2.demo2.Entity.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public static void main(String[] args) {
        User user = new User();
        List<UserComparator> list = new ArrayList<>();
    }
}
