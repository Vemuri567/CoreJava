package Arrays;

public class ArrayReturnType {
    public String getname(String name){
        return name;

    }
    public int sumoftwonos(int a,int b){
        return a+b;
    }
    public boolean verifysum(int x,int y){
        int sum=x+y;
        if(sum==15){
            return  true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayReturnType obj=new ArrayReturnType();
        String name=obj. getname("bhavani");
        System.out.println(name);
        int sum=obj.sumoftwonos(5,9);
        System.out.println(sum);
        boolean vsum=obj.verifysum(8,7);
        System.out.println(vsum);
    }

}
