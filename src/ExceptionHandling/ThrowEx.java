package ExceptionHandling;

public class ThrowEx {
    public static void main(String[] args)  {
        /*String data=null;
        if(data==null)
        {
            try{
                throw new Exception("DataNotFound");
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }
        try{
            int result=1/0;
        }
        catch (ArithmeticException ex)
        {
            try{
                throw  new Exception("ArithmeticException while divide by zero");
            }
            catch (Exception ex1){
                System.out.println(ex1.getMessage());
            }

        }

        int add=10+20;
        System.out.println(add);*/
        String browser="ie";
        if(browser.equals("ie")){
            System.out.println("open ie browser");
        }
        else if(browser.equals("chrome")){
            System.out.println("open in chrome");
        }
        else if(browser.equals("safari")){
            System.out.println("open in safafi");
        }
        else {
            System.out.println("please pass the correct browser name");
            throw new MyException("Wrong browser Exception");
        }
    }
}
