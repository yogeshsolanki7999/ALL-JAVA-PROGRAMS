package com.practice;

public class All_String_methods {
    public static void main(String[] args) {
        String str="YOGESH solanki ";
        String str1=new String("THIS IS YOGESH STRING solanki ki bhi");
        String str2="YOGESH SO ";


        //1 chartAt(0) Returns the character at the specified index (position)
       // System.out.println(str.charAt(5)); // H

        //2 codePointAt(5) Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
       // System.out.println(str.codePointAt(1));

        //3 codePointBefore(6) This method returns the Unicode value of the character before the specified index in a string.
        //System.out.println(str.codePointBefore(6));

        //4 codePointCount(0, 5) The codePointCount() method returns the number of Unicode values found in a string.
        //Use the startIndex and endIndex parameters to specify where to begin and end the search.
        //System.out.println(str.codePointCount(2,6));

        //5 compareTo() The method returns 0 if the string is equal to the other string. A value less than 0 is returned
        // if the string is less than the other string (less characters) and a value greater than 0
        // if the string is greater than the other string (more characters).
        //System.out.println(str.compareTo(str2));

        //6 concat()  The method appends (concatenate) a string to the end of another string.
        //System.out.println(str.concat(str1));

        //7 The contains() method checks whether a string contains a sequence of characters.
        //Returns true if the characters exist and false if not.
        //System.out.println(str.contains("YOG"));

        //8 The contentEquals() method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.
        //Returns true if the characters exist and false if not.
        //System.out.println(str.contentEquals("YOGESH"));

        //
    }
}
