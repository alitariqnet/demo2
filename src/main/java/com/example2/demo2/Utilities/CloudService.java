package com.example2.demo2.Utilities;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class CloudService {

    public JSONPObject getMovies(){
        
        return null;
    }
    public static String TreeConstructor(String[] strArr) {
        List<Integer> l = new ArrayList<Integer>(1000);
        System.out.println("list length: "+l.size());
        for(String s: strArr){
            l.add(Character.getNumericValue(s.charAt(3)),0);
            System.out.println(s);
            System.out.println(s.charAt(3));
            int x = l.get(Character.getNumericValue(s.charAt(3)));
            System.out.println("x "+x);
            System.out.println("list length: "+l.size());
            if(x<0){
                l.add(Character.getNumericValue(s.charAt(3)),0);
            }
            if(l.get(Character.getNumericValue(s.charAt(3)))<2) {
                l.add(Character.getNumericValue(s.charAt(3)), l.get(Character.getNumericValue(s.charAt(3))) + 1);
                System.out.println(l.get(Character.getNumericValue(s.charAt(3))));
            }else
                return "false";
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        //System.out.print(TreeConstructor(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
//        Set set = new TreeSet();
//        set.add(1);
//        // Compilation error
//        set.add(2);
//        set.add(3);
        System.out.println("In the main()");

        String s1 ="abc";
        String s2 ="abc";
        String s3 = new String(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1!=s3);

        CloudService c = new CloudService();
        System.out.println(c);
        Set set1 = new TreeSet();
        Set set2 = new HashSet();
        Set set3 = new LinkedHashSet();

        Map map1 = new HashMap<>();
        Map map2 = new TreeMap<>();
        Map map3 = new LinkedHashMap();
        Map map4 = new ConcurrentHashMap();
        Map map5 = new IdentityHashMap();
        Map map6 = new Hashtable();


//        Collections.sort();
    }
    public static void main (char[] args) {
        System.out.println("hello");
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof CloudService)){
            return false;
        }
        return this.equals(o);
    }
//    @Override
//    public int hashcode(Object o){
//        return 123;
//    }
}
