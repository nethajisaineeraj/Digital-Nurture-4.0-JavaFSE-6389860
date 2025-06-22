public class Main {
    public static void main(String[] args) {
        Task t1=new Task(1,"t1",true);
        Task t2=new Task(2,"t2",true);
        Task t3=new Task(3,"t3",false);
        Task t4=new Task(4,"t4",false);
        LinkedList list=new SinglyLinkedList();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        Task searchedTask = list.search(1);
        DisplayTask.display(searchedTask);
        // list.traverse();
        // list.delete(2);
        // list.traverse();
    }
}
