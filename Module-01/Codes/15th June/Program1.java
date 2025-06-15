public class Main
{
	public static void main(String[] args) {
// 		String str = "abcde fghi jkl";
		
// 		System.out.println(str);
// 		System.out.println(str.length());
// 		System.out.println("Char At 6th index: " + str.charAt(6));
// 		System.out.println("Char At 10th index: " + str.charAt(10));
		
// 		String str1 = "abc";
// 		String str2 = "def";
// 		String str3 = "abc";
		
// 		str3 += "d";
		
// 		String str4 = new String ("abc");
		
// 		System.out.println(str1.equals(str2));
// 		System.out.println(str1.equals(str3));
		
// 		System.out.println(str1 == str3); // true
// 		System.out.println(str1 == str2); // false;

        // System.out.println("String 4 is : " + str4);
        // System.out.println("String 1 is : " + str1);
        
        // System.out.println(str1.equals(str4));

        // System.out.println(str1 == str4); // Used to compare address of strings 
        
        String str = "abcdefghijkl";
        //            
        
        // System.out.println(str.substring(4,10));
        // System.out.println(str.substring(5));
        
        // System.out.println(str.substring(5,5)); // 1) error 2) empty (true)
        // System.out.println(str.substring(12,12)); // 1) error 2) empty(true)
        // System.out.println(str.substring(14,14)); // error 
        // System.out.println(str.substring(13,12)); //(13,11)
        
        // System.out.println(str.substring(6)); // ghijkl
        // System.out.println(str.substring(11));  // l
        System.out.println(str.substring(13)); // 12 in the length of the string => valid part => empty
        // System.out.println(str.substring(15)); // error -> out of range 
        
		
	}
}
