class CPU
{
  double price;
  class Processor
  {
    double cores;
	String manufacturer;
	double getCache()
	{
	  return 4.3;
	}
  }
  protected class RAM
  {
	  double memory;
	  String manufacturer;
	  double grtClockSpeed()
	  {
        return 5.5;
      }
  }
}
public class CPUDetails
{
   public static void main(String[]args)
   {
     CPU CPU=new CPU();
     CPU.Processor Processor=CPU.new Processor();
     CPU.RAM ram=CPU.new RAM();	 
	 System.out.println("Processor cache="+processor.getCache());
	 System.out.println("Ram clock speed="+ram.getClockSpeed());
   }
}