package Dowhile;

public  class Avgof100 {
    public void Avgof100num() {

        int i = 1, sum = 0;
        double avg;

        do {
            System.out.println(i);
            sum = sum + i;

          avg = (double) sum / 100;
            i++;


        }
        while (i <= 100);
        System.out.println(avg);

    }

        public static void main(String[] args) {
            Avgof100 obj=new Avgof100();
            obj.Avgof100num();
    }


}

