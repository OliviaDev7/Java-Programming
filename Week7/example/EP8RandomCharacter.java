
public class EP8RandomCharacter {

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