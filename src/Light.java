// compute distance light travels using long variables
public class Light {
    public static void main (String[] args){
        int lightspeed;
        long days;
        long distance;
        long seconds;
        // approximate speed or light in miles per second
        lightspeed=186000;
        days=1000;//specify number of days here
        seconds=days*24*60*60;//covert to seconds
        distance=lightspeed*seconds;//compute distance
        System.out.print("In"+ days);
        System.out.print("days light will travel about");
        System.out.println(distance+"miles");

    }
}
