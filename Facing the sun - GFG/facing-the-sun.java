//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] h = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(inputLine[i]);
            }


            int ans = new Solution().countBuildings(h, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int countBuildings(int h[], int n) {
      Stack<Integer> st = new Stack();
      int count =0;
      for(int i=0;i<n;i++){
          
          if(st.size()==0){
              count++;
              st.push(h[i]);
          }else {
              
              while(st.size()>0 && st.peek()<h[i])st.pop();
              if(st.size()==0){
                  count++;
                  st.push(h[i]);
              }else {
                  st.push(h[i]);
              }
              
          }
          
          
          
      }
      return count;
    }
}