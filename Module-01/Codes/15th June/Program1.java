public class Main
{
	public static void main(String[] args) {
		String str = "abcde fghi jkl";
		
// 		System.out.println(str);
// 		System.out.println(str.length());
// 		System.out.println("Char At 6th index: " + str.charAt(6));
// 		System.out.println("Char At 10th index: " + str.charAt(10));
		
		String str1 = "abc";
		String str2 = "def";
		String str3 = "abc";
		
		str3 += "d";
		
		String str4 = new String ("abc");
		
// 		System.out.println(str1.equals(str2));
// 		System.out.println(str1.equals(str3));
		
// 		System.out.println(str1 == str3); // true
// 		System.out.println(str1 == str2); // false;

        System.out.println("String 4 is : " + str4);
        System.out.println("String 1 is : " + str1);
        
        System.out.println(str1.equals(str4));

        System.out.println(str1 == str4); // Used to compare address of strings 
		
	}
}
