package Homework4;
/*This code uses different String methods. For better understanding of String methods, I created my own methods
to use each of these String methods separately and called the methods in Main method to execute. I've two such String
class with 15 different String methods in each, total of 30.
*/
public class StringManipulationExt extends StringManipulation{
    public static void main(String[] args) {

    StringManipulationExt obj = new StringManipulationExt();
    obj.trim();
    obj.sub();
    obj.intern();
    obj.getHashCode();
    obj.getLowerCase("Today is a Beautiful Day");
    obj.getUpperCase("Today is a Beautiful Day");
    obj.getJoin();
    obj.getSplit();
    obj.getContent();
    obj.getEmptyString();
    obj.getBytes();
    obj.getMatches();
    obj.getRegionMatches();
    obj.getEmailUserName("aartipathania@gmail.com");
    obj.isEmailAddress("aartipathania@gmail.com");


    }

    //16.trim method - eliminates leading and trailing spaces
    void trim(){
        String str1 = " I am learning Java ";
        System.out.println("with trim method, my sentence has no leading and " +
                "trailing spaces: "+ str1.trim());
    }

    //17. substring() method- gets a substring of a particular string
    void sub(){
        String str1 = new String("quick brown fox jumps over the lazy dog");
        System.out.println("Substring starting from index 0 to 5: "+str1.substring(0,5));
        System.out.println("Substring starting from index 15: "+str1.substring(15));
    }

    /*18. intern method - get the string from the memory if it is already present.This method ensures that
    all the same string share the same memory. Java automatically interns string the literals which are created
    without using 'new' keyword.*/
    void intern(){
        String str1 = "Java";
        String str2 = new String("Java").intern(); //prints true
        String str3 = new String("Python").intern();  //prints false
        System.out.println("str1==str2: "+(str1==str2));
        System.out.println("str1==str3: "+(str1==str3));
    }

    //19. hasCode() method - reurns the hash code for the string
    void getHashCode() {
        String str = new String("Welcome");
        System.out.println("Hash code for string "+str+": "+str.hashCode());
    }

    //20. toLowerCase() method- converts the characters of a string into lower case.
    void getLowerCase(String str){
        System.out.println("Converts "+str+" into lower case: "+str.toLowerCase());
    }

    //21. toUpperCase() method -  converts the characters of a string into Upper case.
    void getUpperCase(String str){
        System.out.println("Converts "+str+" into lower case: "+str.toUpperCase());
    }

    //22. join() method - concatenates the given string, first argument of this method specifies the delimiter
    //that is used to join multiple strings.
   void getJoin(){
        String str1 = "Java";
        String str2 = "is";
        String str3 = "awesome";
        String str = String.join(" ",str1,str2,str3);
       System.out.println(str1+", "+str2+", "+str3+" can be joined by using join method: "+str);
   }

    //23. split method - used for splitting a string into its substring based on the given delimiter.
    void getSplit(){
        String str1 = "12/07/2017";
        String str2 = "17/07/2017";
        String array1[] = str1.split("/");
        System.out.println("using split(): ");
        for (String temp: array1){
            System.out.println(temp);
        }
    }

    //24.contentEquals method - compares the string with the string buffer and returns a boolean value
    void getContent(){
        String str1 = "First String";
        String str2 = "Second String";
        StringBuffer str3 = new StringBuffer("First String");
        StringBuffer str4 = new StringBuffer("Second String");
        System.out.println("str1 equals to str3: "+ str1.contentEquals(str3));
        System.out.println("str1 equals to str4: "+ str1.contentEquals(str4));
    }

    //25.isEmpty() method - checks whether a string is empty or not. Returns true if given string is empty
    void getEmptyString(){
        String str1 = "";
        String str2 = "Java";
        System.out.println("String ' ' is empty: "+str1.isEmpty());
        System.out.println("String 'Java' is not empty: "+ str2.isEmpty());
    }

    //26.getBytes() method - encodes a given string into a sequence of bytes and return an array of bytes.
    void getBytes(){
        String str = new String("Hello");
        byte[] array = str.getBytes();
        System.out.println("Default charset encoding: ");
        for(byte b: array){
            System.out.println(b);
        }
    }

    //27. matches() method - checks whether the string is matching with the
    // specified regular expression, regex
    void getMatches(){
        String str = new String("Java String methods");
        boolean result = str.matches("(.*)String(.*)");
        System.out.println(str+", string matches with (.*string*.): "+result);
    }

    //28.regionMatches() method - checks if the two strings are equal.
    void getRegionMatches(){
        String str1 = new String("Hello, how are you?");
        String str2 = new String("How");
        String str3 = new String("how");

        boolean result1 = str1.regionMatches(7,str2,0,3);
        boolean result2 = str1.regionMatches(7,str3,0,3);

        System.out.println("Result of region match of string with 'How' is: "+result1);
        System.out.println("Result of region match of string with 'how' is: "+result2);
    }

    //29.IndexOf method - is used for finding out the index of the specified character
    // or substring in a particular string
    void getEmailUserName(String a){
        String name = a.substring(0,a.indexOf("@"));
        System.out.println("From emailid, "+a+" username is: "+name);
    }

    //30.LastIndexOf method, is used to find out the index of last occurrence of a
    // char or string in a particular string
    void isEmailAddress(String st){
        boolean b = false;
        if(st.indexOf("@")!= -1){
            if(st.indexOf("@") ==st.lastIndexOf("@")){
                if(st.indexOf(" ")== -1){
                    if(st.indexOf("\n")==-1){
                        if(st.indexOf("\t")== -1)
                            b = true;}}}}
        System.out.println("Check if the string is an email or not: "+b);
    }




}
