package Collections;

import java.util.*;

public class Programs {
    public List<String> usernames(){
        List<String> users=new ArrayList<String>();
        users.add("bhavani");
        users.add("anusha");
        users.add("prasanna");
        users.add("ravishankar");
        return users;
    }
    public Map<String,Integer> employee(){
        Map<String,Integer> hashmap=new LinkedHashMap<String,Integer>();
        hashmap.put("bhavani",30);
        hashmap.put("anusha",31);
        hashmap.put("prasanna",27);
        hashmap.put("ravi",25);
        return hashmap;
    }


    public static void main(String[] args) throws Exception {
        Programs obj=new Programs();
        List<String> name=obj.usernames();
        System.out.println(name);
        for(String users:name){
            System.out.println(users);
        }
        System.out.println(name.contains("anusha"));
        System.out.println(name.size());
        Map<String,Integer> name1=obj.employee();
        System.out.println(name1);
        for(Map.Entry<String,Integer> hashmap:name1.entrySet()){
            System.out.println(hashmap.getKey());
            System.out.println(hashmap.getValue());
        }
        boolean flag=false;
        for(String emp:name1.keySet())
        {
            if(name1.get(emp)<30) {
                System.out.println(emp);
                System.out.println(name1.get(emp));
            }
            if(emp.equals("anusha1")){
                System.out.println(name1.get(emp));
                flag=true;
                break;
            }
        }
        if(!flag){
            throw new Exception("anusha name is not available in "+name1);
        }

    }
}
