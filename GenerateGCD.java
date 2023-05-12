class GenerateGCD
{
  
  public static void main(String args[]){
    badGCDCount= 0;
    System.out.println("badGCD Found GCD of GCD(11200,5500)           --- "+badGCD(11200,5500)+ 
                       " --- after " + badGCDCount + " comparisons");
    goodGCDCount= 0;
    System.out.println("goodGCDIterative Found GCD of GCD(11200,5500) --- "+goodGCDIterative(11200,5500)+ 
                       " --- after " + goodGCDCount + " comparisons");
    goodGCDCount= 0;
    System.out.println("goodGCDRecurive Found GCD of GCD(11200,5500)  --- "+goodGCDRecurive(11200,5500)+ 
                       " --- after " + goodGCDCount + " comparisons");
    
    badGCDCount= 0;
    System.out.println("badGCD Found GCD of GCD(11200,5501)           --- "+badGCD(11200,5501)+ 
                       " --- after " + badGCDCount + " comparisons");
    goodGCDCount= 0;
    System.out.println("goodGCDIterative Found GCD of GCD(11200,5501) --- "+goodGCDIterative(11200,5501)+ 
                       " --- after " + goodGCDCount + " comparisons");
    goodGCDCount= 0;
    System.out.println("goodGCDRecurive Found GCD of GCD(11200,5501)  --- "+goodGCDRecurive(11200,5501)+ 
                       " --- after " + goodGCDCount + " comparisons");
    
  }
  
  
  
  
  
  
  private static int badGCDCount = 0;
  private static int goodGCDCount = 0;
  
  //O(n)
  public static int badGCD(int a, int b){
    int min = Math.min(a,b);
    for(int i = min; i > 0; i--){
      badGCDCount++;
      if (a%i==0 && b%i==0) 
        return i;
    }
    return 1;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //O(Log (max(a,b))
  public static int goodGCDIterative(int a, int b){
    int temp;
    while(b>0){
      temp = a;
      a = b;
      b = temp%b;
      goodGCDCount++;
    }
    return a;
  }
  
  //O(Log (max(a,b))
  public static int goodGCDRecurive(int a, int b){
    goodGCDCount++;
    if (b==0) 
      return a;   
    return goodGCDRecurive(b,a%b);
  }
  
  
  
  
} 