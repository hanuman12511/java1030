import javax.xml.crypto.Data;

abstract class DataInfo{
    void display(){
        System.out.println("info");

    }
    abstract void show_Info();
}
class EmpTeamab1 extends DataInfo{
    private int id;
    void show_Info(){
        System.out.println("id"+id);
    }
    void setId(int id){
            this.id=id;
    }
}
public class AbClass {
     public static void main(String...rr){
     EmpTeamab1 etab1 = new EmpTeamab1();
     etab1.setId(100);  
     etab1.show_Info();  
     DataInfo din =new EmpTeamab1();
     //din.setId(30);
     din.show_Info();
    }
}
