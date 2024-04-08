package Arrays;

public class DuplicateNumberPrgm {
    public void duplicatenum(){
        int duplicateindex=0;
        int[] a={1,2,1,4,5,2,3,4,6,8,7,2,1};
        int[] duplicatearray=new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    int count=0;
                    for(int n=0;n<duplicatearray.length;n++){
                        if(a[i]==duplicatearray[n]){
                            count++;
                            break;
                        }
                    }
                    if(count==0){
                        duplicatearray[duplicateindex]=a[i];
                        duplicateindex++;
                        break;
                    }
                }
            }
        }
        for(int k=0;k<duplicatearray.length;k++){
            System.out.println(duplicatearray[k]);
        }
    }
    public static void main(String[] args) {
        DuplicateNumberPrgm obj=new DuplicateNumberPrgm();
        obj.duplicatenum();
    }
}
