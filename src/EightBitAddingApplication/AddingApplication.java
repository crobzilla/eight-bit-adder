package EightBitAddingApplication;

import java.util.Arrays;

public class AddingApplication {
  
  public static void main(String[] args){
    
    var number1 = 44;
    var number2 = 200;

    var answer = add(number1, number2);
    System.out.println(answer);
    
  }
 
  public static Integer add(Integer num1, Integer num2){
    
    var number1 = convertToBinaryArray(num1);
    var number2 = convertToBinaryArray(num2);
    
    var adder1 = new FullAdder(number1[8 - 1], number2[8 - 1], 0);
    adder1.add();
    
    var adder2 = new FullAdder(number1[7 - 1], number2[7 - 1], adder1.co);
    adder2.add();
    
    var adder3 = new FullAdder(number1[6 - 1], number2[6 - 1], adder2.co);
    adder3.add();
    
    var adder4 = new FullAdder(number1[5 - 1], number2[5 - 1], adder3.co);
    adder4.add();
    
    var adder5 = new FullAdder(number1[4 - 1], number2[4 - 1], adder4.co);
    adder5.add();
    
    var adder6 = new FullAdder(number1[3 - 1], number2[3 - 1], adder5.co);
    adder6.add();
    
    var adder7 = new FullAdder(number1[2 - 1], number2[2 - 1], adder6.co);
    adder7.add();
    
    var adder8 = new FullAdder(number1[1 - 1], number2[1 - 1], adder7.co);
    adder8.add();
    
    var answer = new int[]{
        adder8.sum,
        adder7.sum,
        adder6.sum,
        adder5.sum,
        adder4.sum,
        adder3.sum,
        adder2.sum,
        adder1.sum
    };

    return convertBinaryToDecimal(
        Arrays.toString(answer)
            .replace("[", "")
            .replace("]", "")
            .replace(",", "")
            .replace("\"", "")
            .replace(" ", "")
    );
    
  }
  
  public static int[] convertToBinaryArray(int number){

    int[] digits = new int[8];

    for (int j = 0; j < 8; ++j) {
      digits[8-j-1] = number & 0x1;
      number >>= 1;
    }
    
    return digits;

  } 
  
  public static Integer convertBinaryToDecimal(String number){
    return Integer.parseInt(number, 2);
  }
  
}