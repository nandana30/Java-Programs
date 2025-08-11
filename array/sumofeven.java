import java.util.Scanner;
class sumofeven{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i;
    System.out.println("enter the limit:");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("enter the elements:");
    for(i=0;i<n;i++)
    {
        
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(i=0;i<n;i++){
    if(arr[i]%2==0){
    sum+=arr[i];
    }}
    System.out.println("the sum is:"+sum);
}
}