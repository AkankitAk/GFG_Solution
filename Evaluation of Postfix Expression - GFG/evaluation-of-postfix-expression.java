//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        int n=S.length();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(ch=='*'){
                int b=st.pop();
                int a=st.pop();
                st.push(a*b);
            }
            else if(ch=='/'){
                int b=st.pop();
                int a=st.pop();
                st.push(a/b);
            }
            else if(ch=='+'){
                int b=st.pop();
                int a=st.pop();
                st.push(a+b);
            }
            else if(ch=='-'){
                int b=st.pop();
                int a=st.pop();
                st.push(a-b);
            }
            else st.push(ch-48);
        }
        return st.pop();
    }
}





