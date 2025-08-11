import java.util.Scanner;
class common{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i,j;
    System.out.println("enter the limit for first array");
    int n=sc.nextInt();
    int []arr1=new int[n];
    System.out.println("enter the elements for first array");
    for(i=0;i<n;i++)
    {
        
        arr1[i]=sc.nextInt();
    }
    System.out.println("enter the limit for second array");
    int m=sc.nextInt();
    int []arr2=new int[m];
    System.out.println("enter the elements for second array");
    for(j=0;j<m;j++)
    {
        
        arr2[j]=sc.nextInt();
    }
    
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(arr1[i]==arr2[j]){
                System.out.println("common elements:"+arr1[i]);
                break;
            }}}
            }
        }
        
    