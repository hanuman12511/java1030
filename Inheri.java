
class InfoTeam{
    private int id;
    private String name;
    void setId(int id){
        this.id =id;
    }
    void setName(String name){
        this.name =name;
    }

    int getId(){
        return id;
    }
    
    String getName(){
        return name;
    }
}
class Emp_Team1 extends InfoTeam
{
    void show_Info(){
        setId(10);
        setName("emp1");
        System.out.println(getId());
        System.out.println(getName());
    }
}
class Emp_Team2 extends InfoTeam
{
    void show_Info(){
         setId(11);
        setName("emp2");
        System.out.println(getId());
        System.out.println(getName());
    }
}
public class Inheri {
    public static void main(String...rr){
        Emp_Team1 et1=new Emp_Team1();
        et1.show_Info();
        Emp_Team2 et2=new Emp_Team2();
        et2.show_Info();
    }
}
