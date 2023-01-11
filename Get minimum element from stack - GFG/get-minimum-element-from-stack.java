//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> min=new Stack<>();
    Stack<Integer> st=new Stack<>();
    

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    if(min.size()==0) return -1;
	    return min.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	    if(st.size()==0) return -1;
        if (min.peek() == st.peek()) {
            min.pop();
            return st.pop();
        } else {
           return st.pop();
        }
        
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	   
        if (min.size() == 0 && st.size() == 0) {
            st.push(x);
            min.push(x);
        } else {
            if (min.peek() >= x) {
                st.push(x);
                min.push(x);
            } else {
                st.push(x);
            }
        }
    }	
}

