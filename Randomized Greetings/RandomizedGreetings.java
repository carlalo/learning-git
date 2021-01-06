
public class RandomizedGreetings
{

    public RandomizedGreetings()
    {
        int random=Integer.parseInt(String.valueOf(Math.round(Math.random()*1)));
        start(random);      
        }
    
private void start(int random)
{
    if(random==0)
    {
        System.out.println("Hallo Timo");
    }else
    {
        System.out.println("Hallo Thorsten");
    }
}
}
