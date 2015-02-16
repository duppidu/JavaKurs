/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thomas.duppenthaler
 */
public class Clock
{
    protected int hour = 0;
    protected int min = 0;
    protected int sec = 0;
    private boolean mode12h = false;

    public Clock()
    {
    }

    /**
     *
     *
     * @param hour
     * @param min
     * @param sec
     */
    public Clock(int hour, int min, int sec)
    {
        setClock(hour, min, sec);
    }

    private void tick() // setzt die zeit um 1 sec weiter
    {

        sec++;
        if (sec >= 60)
        {
            sec = 0;
            min++;

            if (min >= 60)
            {
                min = 0;
                hour++;
                if (hour >= 24)
                {
                    hour = 0;
                }

            }

        }

    }

    public void setMode12h(boolean mode12h) // Aktivieren des 12 Stunden Modus
    {
        this.mode12h = mode12h;
    }

    public void nTicks(int anzTicks) // Anzahl der verstreichenden Sekunden
    {
        int n = anzTicks;
        int x = 0;
        do
        {
            tick();
            x++;
        } while (x < n);
    }

    public void setClock(int hour, int min, int sec) // Setzen der gesammten Zeit
    {
        if (hour <= 23 & mode12h == false)
        {
            this.hour = hour;
        }
        if (hour <= 11 & mode12h == true)
        {
            this.hour = hour;
        }
        if (min <= 59)
        {
            this.min = min;
        }
        if (sec <= 59)
        {
            this.sec = sec;
        }

    }

    public void setHour(int hour) // Setzen der Stunden
    {
        if (hour <= 23 & mode12h == false)
        {
            this.hour = hour;
        }
        if (hour <= 11 & mode12h == true)
        {
            this.hour = hour;
        }
    }

    public void setMinute(int min) // Setzen der Minuten
    {
        if (min <= 59)
        {
            this.min = min;
        }
    }

    public void setSecond(int sec) // Setzen der Sekunden
    {
        if (sec <= 59)
        {
            this.sec = sec;
        }
    }

    public String getTime() // Rückgabe der ganzen Zeit
    {
        String time;
        time = getHour() + ":" + min + ":" + sec;

        return time;
    }

    public int getHour() // Rückgabe der Stunden
    {
        if (mode12h)
        {
            int tmphour = hour % 12;
            if (hour == 12)
            {
                tmphour = 12;
            }
            return tmphour;

        } else

        {
            return hour;
        }

    }

    public int getMinute() // Rückgabe der Minuten
    {
        int m;
        m = min;
        return m;
    }

    public int getSecond() // Rückgabe der Sekunden
    {
        int s;
        s = sec;
        return s;
    }

    public void showTime() // automatische Ausgabe
    {
        System.out.println(getHour() + ":" + min + ":" + sec);
    }

    public void taktTick() // sekundentakt
    {
        boolean x = true;
        do
        {
            tick();
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(getTime());
        } while (x = true);

    }

    public static void main(String[] args)
    {

        Clock newYork = new Clock(5, 23, 12);
        Clock bern = new Clock(17, 34, 55);

        newYork.setMode12h(true);
        newYork.setClock(11, 34, 33);
        newYork.nTicks(2 * 3600);
        newYork.showTime();

        bern.setClock(26, 66, 45);
        bern.nTicks(3000);
        bern.taktTick();

    }

}
