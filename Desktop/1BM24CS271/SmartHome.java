/*Imagine you are developing a software system for a smart home. In this system, different devices like SmartLights 
and SmartSpeakers need to be controlled remotely.
A SmartLight should have the ability to turn on, turn off, and adjust brightness.
A SmartSpeaker should have the ability to play music, stop music, and adjust volume.
A SmartDevice should have a connect() method to establish a connection.
Since Java does not support multiple inheritance with classes, we decide to use interfaces to achieve multiple inheritance behavior.
Question:
Design Java interfaces LightControl and SpeakerControl to define the functionalities of a SmartLight and SmartSpeaker, 
respectively. Then, implement a SmartLamp class, which acts as both a SmartLight and SmartSpeaker, by implementing both interfaces.
 Also, include a SmartDevice interface with a method for connecting the device.
Write a Java program that demonstrates multiple inheritance using interfaces to implement a SmartLamp, which has both lighting and 
speaker functionalities along with the ability to connect to a network.*/

interface LightControl{
    void turnon();
    void turnoff();
    void adjustb(int b);    
}
interface SpeakerControl{
    void playmusic();
    void stopmusic();
    void adjustvolume(int b);
}
interface SmartDevice{
    void connect();
}
class SmartLamp implements LightControl,SpeakerControl,SmartDevice{
    public void turnon(){
        System.out.println("Smart Light Turn on");
    }
    public void turnoff(){
        System.out.println("Smart Light Turn off");
    }
    public void adjustb(int b){
        System.out.println("Smart Light brightness is adjusted to:"+b);
    }
    public void playmusic(){
        System.out.println("Smart Speaker is Playing music");
    }
    public void stopmusic(){
        System.out.println("Smart Speaker is not playing music");
    }

    public void connect(){
        System.out.println("SmartLamp connected to network");
    }
    public void adjustvolume(int v){
        System.out.println("Smart Speaker volume adjusted to:"+v);
    }
}
class Smarthome{
       public static void main(String[] args){
        SmartLamp s=new SmartLamp();
        s.turnon();
        s.adjustb(7);
        s.playmusic();
        s.adjustvolume(5);
        s.connect();
        s.turnoff();
        s.stopmusic();
        }
    }