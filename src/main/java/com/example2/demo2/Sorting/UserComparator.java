package com.example2.demo2.Sorting;

import com.example2.demo2.Entity.User;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(@NotNull User o1, @NotNull User o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public static void main(String[] args) {
        User user = new User(1,"Abu Bakr",99);
        List<UserComparator> list = new ArrayList<UserComparator>();
    }
}
