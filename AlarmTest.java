public class AlarmTest

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				21/10/2015
/* Purpose : 			Lab 3a, Q13 - Clock
*/

{
   public static void main(String args[])
   {
     AlarmClock myAlarm = new AlarmClock(11, 0);  // it's now 11 am
     myAlarm.setAlarmTime(11, 10);      // set the Alarm time to 11:10

     // while the alarm clock has not yet rung
     while (myAlarm.checkAlarmTime() == false)
     {
        // read the current time in milliseconds and
        // add on a second (1000ms = 1s)
        long wait = System.currentTimeMillis() + 1000;
        // wait for a second...
        while (System.currentTimeMillis() < wait);
        // move the current time on by one second
        myAlarm.tick();
	  // print the current time
        System.out.println(myAlarm.showCurrentTime());
     }
     System.out.println("Ring ring");
   }
}
