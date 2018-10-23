package com.apple.com;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args)
    {
        
        System.out.println(" Enter input string :" );
        Scanner in = new Scanner (System.in);
        String str=in.nextLine();
        char ch=firstNonRepeatedCharacter(str);
        System.out.println("The first non repeated character is :  " + ch);
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
    	
        HashMap<Character,Integer>  character= new HashMap<Character,Integer>();
        Character ch ;
        for (int i=0;i < str.length();i++)
        {
            ch=str.charAt(i);
            if(character.containsKey(ch))
            {
                // increment count if character is already present
                character.put(ch , character.get(ch) +1);
            }
            else
            {
                character.put(ch , 1);
            }
        }
        // Search character in order of string 
        
        for (int i =0 ; i < str.length() ; i++ )
        {
            ch= str.charAt(i);
            if( character.get(ch)  == 1 )
            return ch;
        }
        return null ;
    }
} 



