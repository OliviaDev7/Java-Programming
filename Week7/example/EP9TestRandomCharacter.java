
public class EP9TestRandomCharacter {
     public static void main(String[] args) {
         final int NUMBER_OF_CHARS = 175;
         final int CHAR_PER_LINE = 25;
// Print random characters between a and z,25 chars per line
         for (int i = 0; i < NUMBER_OF_CHARS; i++) {
             char ch = RandomCharacter.getRandomLowercaseLetter();

             if ((i + 1) % CHAR_PER_LINE == 0) System.out.println(ch);
             else
                 System.out.print(ch);
         }
     }
}


class RandomCharacter {

    // Generate a random character between chl and ch2
    public static char getRandomCharacter(char ch1, char ch2){
        return(char)(ch1+Math.random()*(ch2-ch1+ 1));
    }
    // Generate a random lowercase letter
    public static char getRandomLowercaseLetter(){
        return getRandomCharacter('a','z');
    }
    // Generate a random lowercase letter
    public static char getRandomUppercaseLetter(){
        return getRandomCharacter('A','Z');
    }
}