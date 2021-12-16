package Code;

public class TimerNeed {

	
	public void pass(String min,String sec) throws InterruptedException{
	    
        int timet= 4 * 60; // Convert to seconds
    long delay = timet * 1000;

    do
    {
      int minutes = timet / 60;
      int seconds = timet % 60;
      
     // Integer.parseInt(minutes);
    //  Integer.parseInt(seconds);
     
     System.out.println(minutes +" minute(s), " + seconds + " second(s)");
      
      Thread.sleep(1000);
      timet = timet - 1;
      delay = delay - 1000;

    }
    while (delay != 0);
    System.out.println("Time's Up!");
  }
}
