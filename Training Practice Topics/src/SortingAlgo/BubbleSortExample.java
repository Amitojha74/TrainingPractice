package SortingAlgo;

public class BubbleSortExample {

    public static void main(String[] args){

        BubbleSortExample sort=new BubbleSortExample();
        int arr[] ={3,60,35,2,45,320,5};
        System.out.println("Before Sorting Array Is: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        sort.BubbleSort(arr);
        sort.PrintArray(arr);
    }

    private void PrintArray(int[] arr) {
        System.out.println();
        System.out.println("After Sorting Array Is: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
    }

    private void BubbleSort(int[] arr){
        int n=arr.length;
        int temp,i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
