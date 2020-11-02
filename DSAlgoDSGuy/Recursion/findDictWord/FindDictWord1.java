package findDictWord;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDictWord1 {
	
	    public static  boolean wordBreak(String s, List<String> wordDict) {
	        Set<String> set = new HashSet<>();
	        
	        for(int i=0; i<wordDict.size(); i++)
	        {
	            set.add(wordDict.get(i));
	        }
	        
	        StringBuffer sb = new StringBuffer();
	        
	        for(int i=0; i<s.length(); i++)
	        {
	            sb.append(s.charAt(i));
	            
	            if(set.contains(sb.toString()))
	            {
	            	if(i==s.length()-1) return true;
	                sb = new StringBuffer();
	            }else if(i==s.length()-1)
	            {
	                return false;
	            }
	        }
	        
	        return false;
	    }
	
	
		public static void main(String[] args) {
			List<String> list = Arrays.asList("cats", "dog", "sand", "and", "cat");
			System.out.println(wordBreak("catsandog", list));
		}
}
