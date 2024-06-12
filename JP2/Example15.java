//Write a Java program to insert an element(specific position) into an array.
class Example15
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,5,6};
        int item=4;
        int pos=0;

        for(int i=a.length-1; i>=pos; i--)
        {
            a[i] = a[i-1];
             System.out.print(a[i]);
        }
       
       
    }
}