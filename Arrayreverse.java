// Array reversing

Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}

Input: original_array[] = {4, 5, 1, 2}
Output: array_reversed[] = {2, 1, 5, 4}

import java.io.*;
clas Arrayreverse{
  public static void mian(String[] args)
    {
     int arr[]={4,5,1.2};
     int revarr[]=new int[arr.length];
    
    for(int i=0;i<arr.length;i++)
      {
        revarr[i]=arr[arr.length-i-1];
        //here length is 4 so revarr[0] it becomes 4-0-1=3
        // here revarr[1] it becomes 4-1-1=2     similarly it goes on       
      }
    for(int i=0;i<revarr.length;i++)
      {
        System.out.println(" "+revarr[i]);
      }

  }

}
        
    


  }

}
