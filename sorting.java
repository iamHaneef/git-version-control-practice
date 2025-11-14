import java.util.Arrays;

public class sorting{

    public static void sort(int[] arr)
    {
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            for(int j=i ; j<arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int arr[] = {12,3,1,88,77};
        sort(arr);
    }
}