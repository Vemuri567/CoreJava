package Collections;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> hashmap=new LinkedHashMap<String,Integer>();
        hashmap.put("Naveen",33);
        hashmap.put("Ravi",30);
        hashmap.put("srikanth",30);
        hashmap.put("Anusha",34);
        hashmap.put("Naveen",35);
        hashmap.put("Naveen",null);
        hashmap.put("Naveen",null);
        System.out.println(hashmap);
        //System.out.println(hashmap.get("Naveen"));
        System.out.println(hashmap.size());
        for(String key:hashmap.keySet())
        {
            System.out.println(key);
            System.out.println(hashmap.get(key));
        }
        for(Map.Entry<String,Integer> map:hashmap.entrySet())
        {
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
        System.out.println(hashmap.containsKey("Naveen"));

        String name="naveen";
        Map<Character,Integer> namemap=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<=name.length()-1;i++)
        {
            char ch=name.charAt(i);
            if(namemap.containsKey(ch))
            {
                int count=namemap.get(ch);
                namemap.replace(ch,count+1);
            }
            else
            {
                namemap.put(name.charAt(i),1);
            }

        }
        System.out.println(namemap);
        for(Character key:namemap.keySet())
        {
            System.out.println(key+"  is occurs "+namemap.get(key)+" times");
        }


    }
}
