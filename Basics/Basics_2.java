public class Basics_2 {
  //Lets see about Java Strings
  public static void main(String args[]){
    System.out.println("*********Java Strings*********");
    String str="Hello,Welcome";
    String mystring="Pranav bhinge";
    System.out.println(mystring);
    //length function
    System.out.println(mystring.length());
    //finding the character in string
    System.out.println(mystring.indexOf("b"));
    //concatination of strings
    System.out.println(str+" "+mystring);
    System.out.println(str.concat(mystring));   //concating using concate() function

    //numbers and string
    String str1="20";
    String str2="30";
    System.out.println(str1+str2);
// datatype oftr is int and datatype of str1 is string using + opertator uill concate it 
    int tr=3;
    System.out.println(str1+tr);

    //Special charter and strings
  //   \n	New Line	
  //   \r	Carriage Return	
  //   \t	Tab	
  //   \b	Backspace	
  //   \f	Form Feed
  //   \'	'	Single quote
  //   \"	"	Double quote
  //   \\	\	Backslash

  String txt = "We are the so-called \"Vikings\" from the north.";
  System.out.println(txt);
  }   
}
