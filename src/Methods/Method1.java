package Methods;

public class Method1 {

        public static void main(String[] args) {

            Method1 s = new Method1();

            System.out.println(s.multiply());//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");
        }
        public float multiply()
        {
            float a=34.6f;
            float b=2.1f;
            float c= a*b;
            return c;
        }
    }

