package televisionSetTest;

public class televisionSetTest
{
    public static void main(String[] args) {

    }
    //defining attributes
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;


    //Constructor method assigns values to the corresponding field
    public televisionSetTest(String brand, int size)
    {
        powerOn = false;
        volume = 20;
        channel= 2;

    }
    //Methods Set a value for channel
    public void setChannel(int c)
    {
        channel = c;
    }
    //Gets Channel and returns it
    public int getChannel()
    {
        return channel;
    }
    //Sets a value for volume
    public void setVolume(int v)
    {
        volume = v;
    }
    //Gets volume and returns it
    public int getVolume()
    {
        return volume;
    }
    //Gets manufacturer and returns it
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    //Get screen size and return it
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    //increasing volume by one
    public void increaseVolume()
    {
        volume+=1;
    }
    //decreasing volume by one
    public void decreaseVolume()
    {
        volume-=1;
    }
    //Turns power on into false
    public void setPowerOn()
    {
        powerOn = !powerOn;
    }

}