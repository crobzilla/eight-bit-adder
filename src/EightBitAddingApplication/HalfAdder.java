package EightBitAddingApplication;

public class HalfAdder {
  
  public static HalfAdderOutput add(int input1, int input2){
    
    var output = new HalfAdderOutput();
    
    if(input1 == 1 && input2 == 1){
      output.output1 = 1;
    }
    if(input1 == 1 ^ input2 == 1){
      output.output2 = 1;
    }
    
    return output;
  }
  
}
