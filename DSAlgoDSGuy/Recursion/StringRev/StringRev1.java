/*Reverse a give string using recursion

for example

Input: Techie Delight

Output: thgileD eihceT
*/

package StringRev;

public class StringRev1 {
	public static void rev(String s)
	{
		if(s.length()<1)
			return;
		System.out.print(s.charAt(s.length()-1));
		rev(s.substring(0, s.length()-1));
	}
	
	public static void main(String[] args)
	{
		String s = "Techie Delight";
		rev(s);
	}
}
