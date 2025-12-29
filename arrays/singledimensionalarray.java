package arrays;

public class singledimensionalarray {
    public static void main(String args[]){
        int[] myarr = new int[5];
        myarr[0]=1;
        myarr[1]=2;
        myarr[2]=3;
        myarr[3]=4;
        myarr[4]=5;

        //1.sum of array elements
        int sum = 0;
        int n = myarr.length;
        for(int i=0;i<n;i++){
            sum = sum+myarr[i];
        }
        System.out.println("SUM OF ARRAY ELEMENTS: " + sum);

        //2.maximum element in array
        int max = myarr[0];
        for(int i = 0;i<n;i++){
            if(myarr[i]>max){
                max = myarr[i];
            }
        }
    System.out.println("MAXIMUM ELEMENT IN ARRAY: " + max);

    //3.check if array is sorted
    boolean sorted = false;
    for(int i=0;i<n-1;i++){
        if(myarr[i]>myarr[i+1]){
            sorted = false;
            break;
        }
    System.out.println("ARRAY IS SORTED: " + sorted);
    }

    //4.reverse the array
    System.out.print("ORIGINAL ARRAY: ");
    for(int i=0;i<=n-1;i++){
        System.out.print(myarr[i] + " ");
    }
    System.out.print("\nREVERSED ARRAY: ");
    for(int j=n-1;j>=0;j--){
        System.out.print(myarr[j] + " ");
    }
    }
}
