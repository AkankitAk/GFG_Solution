//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int value=0;
        char cha=' ';
       
        TreeMap<Character,Integer> hm=new TreeMap<>();
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(hm.containsKey(ch)){
                int freq=hm.get(ch);
                freq++;
                hm.put(ch,freq);
            }
            
            else hm.put(ch,1);
        }
        for(Character key:hm.keySet()){
            int val=hm.get(key);
            if(value<val){
                value=val;
                cha=key;
                
            }
            // System.out.println(key+" "+val);
        }
        return cha;
    }
    
}