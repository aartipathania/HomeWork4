package Homework4;
/*This code uses different String methods. For better understanding of String methods, I created my own methods
to use each of these String methods separately and called the methods in Main method to execute. I've two such String
class with 15 different String methods in each, total of 30.
*/
public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello";


    StringManipulation obj = new StringManipulation();
    obj.len("Hello there, how are you?");
    obj.rep();
    obj.repFirst();
    obj.repAll();
    obj.eq();
    obj.ignoreeq();
    obj.con();
    obj.retChar();
    obj.compare("Java", "Mysql");
    obj.compareIgnorCase();
    obj.makeSubjectLine("Winter break");
    obj.starting();
    obj.ending();
    obj.value();
    obj.formatting();
   }


    //1.length of string - return total length of string
    void len(String st){
        System.out.println("Length of given string is: "+st.length());
    }

    //2.Replace() method - replace all the words or characters inside the string that matches ctiteria
    void rep(){
        String st1= "This is your book and that book is mine. The Last book belongs to author";
        System.out.println("After using replace method, " +"'"+st1+"'"+" becomes:\'\n "+st1.replace("book","pen"));
    }

    //3.ReplaceFirst() method - replaces the first substring that fits the specified cirteria
    void repFirst(){
        String st1= "This is your book and that book is mine. The Last book belongs to author";
        System.out.println("After using replaceFirst method, " +"'"+st1+"'"+" becomes:\'\n "+st1.replaceFirst("book","pen"));
    }

    //4.ReplaceAll() method - replaces all characters substring that fits the specified cirteria
    void repAll(){
        String st1= "This is your book and that book is mine. The Last book belongs to author";
        System.out.println("After using replaceAll method, " +"'"+st1+"'"+" becomes:\'\n "+st1.replaceAll("book", "pen"));
    }

    //5.equals() method - compare strings
    void eq(){
        String str1 = "Apple";
        String str2 = "Mango";
        String str3 = "APPLE";
        String str4 = "Mango";
        System.out.println("'Apple' equals to 'Mango': "+str1.equals(str2));
        System.out.println("'Apple' equals to 'APPLE': "+str1.equals(str3));
        System.out.println("'Mango' equal to 'Mango;: "+str2.equals(str4));
    }

    //6.Ignore case equals method - compare strings by ignorinf case
    void ignoreeq(){
        String str1 = "Apple";
        String str2 = "Mango";
        String str3 = "APPLE";
        String str4 = "Mango";
        System.out.println("Using 'ignore case equals' method, 'Apple' becomes equals to 'APPLE': "
                +str1.equalsIgnoreCase(str3) );
    }

    //7. Contains method - method returns true if a specified sequence is present in a given string
    void con(){
        String str = "I like watching Friends";
        String str2 = "Friends";
        System.out.println(str+", contains the word- "+str2+ ": "+str.contains(str2));
    }

    //8. chatAt() - returns the character at specified index
    void retChar(){
        String str = "Welcome to my world of Java";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(13);
        System.out.println("Character at 0 index is: "+ch1);
        System.out.println("Character at 13 index is: "+ch2);
   }

   //9. compareTo method - compare to string lexixographically(dictionary order), means each character is converted into
    //unicode value for comparison. for equals it returns 0, positivevalue for greater than and negative for smaller
    void compare(String a, String b){
        String larger;
        if(a.compareTo(b)>0)
            larger = a;
        else
            larger = b;
        System.out.println("Out of " +a+ " and "+b+" larger is: "+larger);
    }

    //10. compareToIgnoreCase method - compare as compareTo method however it ignores the case during comparision
    void compareIgnorCase(){
        int larger;
        String str1 = "HELLO";
        String str2 = "hello";
        larger = str1.compareToIgnoreCase(str2);
        System.out.println("comparing ignoring case "+str1+ " and "+str2+ " larger is: "+larger);
    }

    //11. Concatenation - Concatenate the other string at the end of the first string
    void makeSubjectLine(String a){
        String sub ="Subject: "+a;
        System.out.println("Concatenate 'subject' in front of "+a+ ": "+sub);
    }

    //12. startsWith() - checks prefix of a string, it returns boolean value true if specified string is prefix of given string
    void starting(){
        String str = new String("quick brown fox jumps over the lazy dog");
        System.out.println(str+": "+ str.startsWith("quick"));
        System.out.println(str+": "+ str.startsWith("fox"));
        System.out.println(str+" starting from 6th index: "+str.startsWith("brown", 6) );
    }

    //13. endsWith() - checks prefix of a string, it returns boolean value true if specified string is prefix of given string
    void ending(){
        String st = "Best language is Java";
        String str = new String("quick brown fox jumps over the lazy dog");
        System.out.println(str+": "+ str.endsWith("Java"));
        System.out.println(str+": "+ str.endsWith("is"));
    }

    //14. valueOf method - converts different types of values into string, like, int to string, boolean to string etc..
    void value(){
        int i = 30;
        char ch = 'A';
        double d = 30.8;
        String str1 = String.valueOf(i);
        String str2 = String.valueOf(ch);
        String str3 = String.valueOf(d);
        System.out.println("Addition of converted int(30) to String value with 10: "+i+10);
        System.out.println("Putting the converted character(A) at the end of this sentence: "+ch);
        System.out.println("Addition of converted double(30.8) to String value with 10: "+d+10);
    }

    //15.format method - returns a formatted string using the specified format string and arguments
    void formatting(){
        String name = "Aarti";
        String str1 = String.format("Formating example: My name is %s",name);
        System.out.println(str1);
        System.out.println(String.format("Format method example: value of %f",32.34));
    }
}
