class SortArray{
    public static void main(String[] args)
    {
        int arr[] = {3,1,6,8,3,2,0,7};
        int temp;

        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}