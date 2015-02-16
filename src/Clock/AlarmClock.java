/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author thomas.duppenthaler
 */
public class AlarmClock extends Clock
{
    private int aHour, aMin, aSec;

    
    
    public void setAlarmTime(int h, int m, int s)
    {
        aHour = h;
        aMin = m;
        aSec = s;
 
    }
    

    public int getaHour()
    {
        return aHour;
    }

    public int getaMin()
    {
        return aMin;
    }

    public int getaSec()
    {
        return aSec;
    }

   public boolean checkAlarm()
   {
       return (this.aHour == this.hour && this.aMin == this.min && this.aSec == this.sec );
   }
 
   
}

