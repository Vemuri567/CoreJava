package Arrays;

public class FindDuplicates {
    public int[] duplicates(int[] a){
        int duplicateindex=0;
        int[] b=new int[a.length];

        for(int i=0;i< a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    int count=0;
                    for(int n=0;n<b.length;n++){
                        if(a[i]==b[n]){
                          count++;
                        }
                    }
                    if(count==0){
                        b[duplicateindex] =a[i];
                        duplicateindex++;
                        break;
                    }

                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        FindDuplicates obj=new FindDuplicates();
        int[] a={1,2,1,4,5,2,3,4,6,8,7,2,1};
        int[] duplicatearray=obj.duplicates(a);
        for(int k=0;k<duplicatearray.length;k++){
            System.out.println(duplicatearray[k]);
        }
        int lastindexvalue=a.length-1;
        System.out.println(lastindexvalue);
    }
}
