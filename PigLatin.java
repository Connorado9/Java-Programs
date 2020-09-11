import java.util.*; //importing util package
import java.lang.*; //importing
import java.io.*; //importing
public class PigLatin //converting an entered word into pig latin
{
    public static void main (String [] args) //main method:
    {
        Scanner scan = new Scanner(System.in); //Scanner keyboard
        System.out.println("Enter the word you would like to change into pig latin: "); //directions
        String userInput = scan.nextLine().toLowerCase(); //gathers word from the user

        StringBuffer buff = new StringBuffer(userInput); //string buffer
        convertToPigLatin(buff); //executes the convertToPigLatin method

        System.out.println("The Pig Latin word is " + buff); //returnd pig latin word
    }
    public static void convertToPigLatin(StringBuffer word) //main helper method: changes the word into pig latin
    {
        StringBuffer copy = new StringBuffer(word); //string buffer
        if(beginsWithVowel(word.toString())==true) //if the beginWithVowel method is true, then...
        {
            word.append("yay"); //then yay will be added onto the end
        }
        else if(beginWithPrefix(word.toString()) == true) //if the beginWithPrefix is true...
        {
            //copy.replace(0, word.length(), copy.substring(2)); //replace what is in word with what is in copy at slot 2
            //copy.append(copy.substring(0,2));//moves first two letters to end of word
            word.replace(0,word.length(), copy.substring(2));
            word.append(copy.substring(0,2));
            word.append("ay");
        }
        else //if the others are not true...
        {
            //copy.append("ay"); //adds ay
            word.replace(0, word.length(), copy.substring(1));
            word.append(copy.charAt(0));
            word.append("ay");
        }
    }

    public static boolean beginsWithVowel(String word) //helper method: checks if begins with a vowel
    {
        if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')
        //checks if first letter is a vowel
        {
            return true; //if the above is true, it will return true
        }
        else //if not...
        {
            return false; //if the above if statement is false, beginsWithVowel will retrun false
        }
    }

    public static boolean beginWithPrefix(String word) //helper method: checks if string begins with prefix
    {
        if( word.startsWith("bl") || word.startsWith("fr") || word.startsWith("ch") || word.startsWith("cl") || word.startsWith("cr")
        || word.startsWith("dr") || word.startsWith("fl") || word.startsWith("gl") || word.startsWith("gr") || word.startsWith("kl") 
        || word.startsWith("ph") || word.startsWith("pl") || word.startsWith("pr") || word.startsWith("sh") || word.startsWith("sl") 
        || word.startsWith("sp") || word.startsWith("sr") || word.startsWith("st") || word.startsWith("th") || word.startsWith("tr") 
        || word.startsWith("wh") || word.startsWith("wr")) //if the word begins with one of the baover prefixes, the method will return true
        {
            return true; //if the above if statement is true, beginWithPrefix will return true
        }
        else //if not...
        {
            return false; //if the if statement is false, then beginWithPrefix will return false
        }
    }
}
