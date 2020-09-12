package EightBitAddingApplication;

public class FullAdder {
  
  HalfAdder halfAdder1 = new HalfAdder();
  HalfAdder halfAdder2 = new HalfAdder();
  int sum;
  int co;
  int input1;
  int input2;
  int ci;
  
  public FullAdder(int input1, int input2, int ci){
    this.input1 = input1;
    this.input2 = input2;
    this.ci = ci;
  }
  
  public void add(){
    
    var halferAdder1Output = halfAdder1.add(this.input1, this.input2);
    if(halferAdder1Output.output1 == 1){
      this.co = 1;
    }
    
    var halfAdder2Output = halfAdder2.add(ci, halferAdder1Output.output2);
    if(halfAdder2Output.output1 == 1){
      this.co = 1;
    }
    if(halfAdder2Output.output2 == 1){
      this.sum = 1;
    }
    
  }

}
