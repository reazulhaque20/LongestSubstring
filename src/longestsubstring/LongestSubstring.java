/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longestsubstring;

/**
 *
 * @author Reazul-System
 */
public class LongestSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String test = "abcabced";
        Solution solution = new Solution();
        System.out.println("Longest String Length: " + solution.lengthOfLongestSubstring(test));
    }
    
}
