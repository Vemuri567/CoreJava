package Arrays;

public class FindDuplicatesInArray {

        public void duplicates(){
            int duplicateindex=0;
            int[] a={1,2,1,4,5,2,3,4,6,8,7,2,1};
            int[] duplicateArray=new int[a.length];

            for(int i=0;i< a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]!=a[j]){
                        int count=0;
                        for(int n=0;n<duplicateArray.length;n++){
                            if(a[i]==duplicateArray[n]){
                                count++;
                                break;
                            }
                        }
                        if(count==0){
                            duplicateArray[duplicateindex] =a[i];
                            duplicateindex++;
                            break;
                        }

                    }
                }
            }
            for(int k=0;k<duplicateArray.length;k++){
                System.out.println(duplicateArray[k]);
            }
        }

        public static void main(String[] args) {
            FindDuplicatesInArray obj=new FindDuplicatesInArray();
            obj.duplicates();
        }
    }

