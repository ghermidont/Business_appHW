package social;

public class designer {
    private static byte age = 41;
    private static byte earn = 15; //per hour
    private static byte experience = 8;
    private static float salary = 1000f;

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
