package ConditionalStatements;
public class EvendotOddstar {
    public static void main(String[] args) {
        char Ch = '*';
        char c = '.';

    for (int i = 0; i< 5; i++)
    {
        for (int j = 0; j<=i; j++)
        {

            if (j % 2 == 0)
            {
                System.out.print(Ch);
            }
            else
            {
                System.out.print(c);

            }

        }
        System.out.println();


    }
}
}