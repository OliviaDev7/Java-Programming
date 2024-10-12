import java.util.Scanner;// Import Scanner object from Java.util
public class ReadingFromKeyboard {
public static void main(String[] args){
  Scanner input =new Scanner(System.in);
// Bytevalue
  System.out.print("Enter a Byte value:");
  byte byteValue =input.nextByte();
  System.out.println("The byte value is:"+ byteValue);
//shortValue
System.out.print("Enter a short value:");
  short shortValue = input.nextShort();
  System.out.println("The short value is:"+ shortValue);
// floatValueSystem.out.print("Enter a float value:");
  float floatValue =input.nextFloat();
  System.out.println("The float value is:"+ floatValue);
}
}
