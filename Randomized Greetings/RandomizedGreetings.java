
public class RandomizedGreetings
{
    public static void main(String[] args) {
        String[] names = { "Timo", "Thorsten" };
        System.out.println(String.format("Hallo, %s!", names[Math.round((float)Math.random())]));    
    }
}
