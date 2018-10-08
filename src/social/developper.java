package social;

public class developper{
    private static byte age = 33;
    private static byte earn = 20; //per hour
    private static byte experience = 2;
    private static float salary = 1200f;

    public static void sayHi(int language){
        switch(language){
        case 1:
        System.out.println("Hi!!");
        break;
        case 2:
        System.out.println("Privet!!");
        break;
        case 3:
        System.out.println("Bonjour!!");
        break;
        default:
        System.out.println("please input a valid number...");
        }
    }

    public static void about(){
        System.out.println("Position: Developper. \n\n" +
                "\tAge: " + age + ".\n" +
                "\tPer hour earning: " + earn + ".\n"+
                "\tWork experience: " + experience + " years.\n"+
                "\tAverage monthly salary: " + (int)(salary) + " USD.");
    }
}