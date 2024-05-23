package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args)  {
        Exceptions obj1=new Exceptions();
        try{
            obj1.verifyFile("C:\\text1.img");
            //System.out.println("naveen");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("file path not found");
        }
        try{
            int sum=obj1.addition(10,20);
            System.out.println(sum);
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
            System.out.println("Addition test case is failed becuse of "+ex.getMessage());
        }
        catch (ArithmeticException ex)
        {
            try{
                int sum=obj1.addition(10,20);
                System.out.println(sum);
            }
            catch (Exception ex1){
                ex1.printStackTrace();
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        try{
            int difference=obj1.subtraction(20,10);
            System.out.println(difference);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            List<String> obj=new ArrayList<String>();
            obj.add("Naveen");
            obj.add("srikanth");
            System.out.println(obj);
            for(int i=0;i<=obj.size()-1;i++)
            {
                System.out.println(obj.get(i));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public int addition(int a,int b){
        int s=a/0;
        return a+b;
    }
    public int subtraction(int a,int b)
    {
        return a-b;
    }

    public void verifyFile(String s) throws IOException {
        FileInputStream fs=new FileInputStream("");
        fs.read();
    }
}
