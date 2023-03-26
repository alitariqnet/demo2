package com.example2.demo2.Utilities;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Component;

@Component
public class CloudUtils {

    public JSONPObject getMovies(){
        
        return null;
    }



    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof CloudUtils)){
            return false;
        }
        return this.equals(o);
    }
//    @Override
//    public int hashcode(Object o){
//        return 123;
//    }
}
