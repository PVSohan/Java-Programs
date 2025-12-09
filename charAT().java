public class char-example{
    public static void main(string args[]){
        string name="javapoint";
        char ch=name.charAt(4);
        System.out.println(ch);
    }}

public class getexample{
    public static void main(String args[]){
        String str = new String("Welcome to the java class:");
        char[]ch = new char[10];
    try{
        str.getChars(6,12,ch,0);
        System.out.println(ch);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
