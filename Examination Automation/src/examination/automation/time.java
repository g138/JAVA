/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination.automation;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author hp
 */
public class time {
    int i = 0;
    public static void main(String[] args){
        time a = new time();
        a.runTimer();
    }
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            
           System.out.println(i);
            i++;
            if(i == 30){
                timer.cancel();
            }
            //timer.cancel();
        }
    };
    
    public void runTimer(){
        
            
            timer.schedule(task,1000,1000);
           // timer.cancel();
    }
}
