public class Main{
    public static void main(String args[]){
        Employee e=new Employee();
        e.add(1,"Arjun ","HR          ",10);
        e.add(2,"John  ","Manager     ",10);
        e.add(3,"Kalyan","Team Lead   ",10);
        e.add(4,"David ","Data Analyst",10);
        e.search(4);
        e.search(9);
        e.traverse();
        e.delete(2);
        e.traverse();

    }
}