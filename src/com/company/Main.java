package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] input={1,11,22,33,333,23,333,1234567,2345,123};
        Map<Integer,List<Integer>> my_map=new HashMap<Integer,List<Integer>>();
        int D;
        for (int num:input) {
            D=(int)Math.log10(num)+1;
            if(!my_map.containsKey(D)){
                List<Integer> m=new ArrayList<>();
                m.add(num);
                my_map.put(D,m);
            }
            else{
                my_map.get(D).add(num);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : my_map.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values);
        }
    }
}
