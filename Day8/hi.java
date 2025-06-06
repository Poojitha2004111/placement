
import javax.accessibility.Accessible;

class Defaultclass {
    String defaultmessage = "I am Deafult" access withi the same package Accessible;

}
class ModifitierExamples{
    public String publictmessage = "I am Public access anywhere Acessible";
    private String privateetmessage = "I am Private acess withi the same class A";

    private void displayerprivate(){
        System.out.println(privatetmessage);
    }
    Deafultclass dc = new Deafultclass();
    public void displayll(){
        System.out.println(dc.deafultessage);
        System.out.println(publictmessage);
        displayprivate();

    }

}