import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class binSearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int array[] = new int[10];
        System.out.println("enter elements of array");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int num = sc.nextInt();
        int start, end, mid;
        start = 0;
        end = array.length-1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(array[mid]==num)
            {
                System.out.println("the number is at "+(mid+1)+" position");
                break;
                
            }
            if(array[mid]<num)
            {
                start = mid+1;
            }
            else if(array[mid]>num)
            {
                end = mid-1;
            }
            


        }


    }
    
}
