//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class getMin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Taking all the testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //Taking total number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //adding all the elements to the array
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
             
            //calling _push method of class GetMin 
            //and storing the result in a new Stack
            Stack<Integer>mys = new GetMin()._push(arr,n);
            
            //calling _getMinAtPop method of class GetMin
            new GetMin()._getMinAtPop(mys);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        return st;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        int [] arr=new int[s.size()];
        int i=s.size()-1;
        while(!s.isEmpty()){
            arr[i--]=s.pop();
        }
        for(i=0;i<arr.length;i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }
            else if(s.peek()>=arr[i]){
                s.push(arr[i]);
            }
            else{
                s.push(s.peek());
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}




