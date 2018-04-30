package takeout;

import java.util.LinkedList;


interface Waiter
{
    void AddPatty(String s1);
    void AddSauce(String S2);
    void AddCheese(String S3);
    Burger getBurger();
}


class ChickenBurger implements Waiter
{
    private Burger burger= new Burger();

    @Override
    public void AddPatty(String S1) {
        //burger.Add("Chicken Patty");
        burger.Add(S1);
    }

    @Override
    public void AddSauce(String S2) {
        //burger.Add("Chili Sauce");
        burger.Add(S2);
    }

    @Override
    public void AddCheese(String S3) {
        //burger.Add("Ricotta Cheese");
        burger.Add(S3);
    }

    @Override
    public Burger getBurger() {
        return burger;
        
    }    
}


class BeefBurger implements Waiter
{
    private Burger burger= new Burger();

    @Override
    public void AddPatty(String S1) {
        //burger.Add("Beef Patty");
        burger.Add(S1);
    }

    @Override
    public void AddSauce(String S2) {
        //burger.Add("Tamato Sauce");
        burger.Add(S2);
    }

    @Override
    public void AddCheese(String S3) {
        //burger.Add("Stilton Cheese");
        burger.Add(S3);
    }

    @Override
    public Burger getBurger() {
        return burger;
        
    }
    
}

class Burger
{
    private LinkedList<String> types;
    Burger()
    {
        types=new LinkedList<String>();
    }
    
    public void Add(String type)
    {
        types.addLast(type);
    }
    
    public void Show()
    {
        System.out.println("Burger is ready as below: ");
        for(int i=0;i<types.size();i++)
        {
            System.out.println(types.get(i));
        }
    }
}


class Students
{
    Waiter mywaiter;
    String s1;
    String s2;
    String s3;
    
    public void Construct(Waiter waiter)
    {
        mywaiter=waiter;
        mywaiter.AddPatty(s1);
        mywaiter.AddSauce(s2);
        mywaiter.AddCheese(s3);
    }
}

public class TakeOut {
    
    public static void main(String[] args) {        
        Students students = new Students();
        students.s1="Chicken Patty";
        students.s2="Chili Sauce";
        students.s3="Ricotta Cheese";
        
        Students students2 = new Students();
        students2.s1="Beef Patty";
        students2.s2="Tomato Sauce";
        students2.s3="Stilton Cheese";
        
        Waiter chickenmaker = new ChickenBurger();
        Waiter beefmaker = new BeefBurger();
        
        // Making ChickenBurger
        students.Construct(chickenmaker);
        Burger chcknB = chickenmaker.getBurger();
        chcknB.Show();
        
        //Making BeefBurger
        students2.Construct(beefmaker);
        Burger beefB = beefmaker.getBurger();
        beefB.Show();
    }
    
}
