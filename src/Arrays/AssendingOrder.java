package Arrays;

public class AssendingOrder {
    public void assending(){
        int temp;
        int[] b={10,7,11,12,1,2,15,3,4,6,9,8};
        System.out.println("array assending order is: ");
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                 temp=b[i];
                 b[i]=b[j];
                 b[j]=temp;
                }
            }
        }
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args) {
        AssendingOrder obj=new AssendingOrder();
        obj.assending();
    }
}
