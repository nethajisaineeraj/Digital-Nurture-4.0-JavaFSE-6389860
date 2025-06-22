public class SinglyLinkedList implements LinkedList {
    public static Node head = new Node(new Task(0,"",false));
    public void add(Task obj){
        Node newNode = new Node(obj);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Task search(int taskId){
        Node temp = head.next;
        while(temp!=null){
            if(temp.obj.taskId==taskId){
                System.out.println("Task with id "+taskId+" Found Successfylly...");
                return temp.obj;
            }
            temp = temp.next;
        }
        System.out.println("Error: No Such task found with Id "+taskId+"!");
        return null;
    }

    public void traverse(){
       Node temp=head.next;
       if(temp==null)
       {
        System.out.println("Error: No Tasks Found!");
        return;
       }
       System.out.println("Id     Name     Status");
       while(temp!=null)
       {
         System.out.println(temp.obj.taskId+"       "+temp.obj.taskName+"       "+temp.obj.status);
         temp=temp.next;
       }
    }

    public void delete(int taskId){
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.obj.taskId==taskId){
                temp.next = temp.next.next;
                System.out.println("Task with id "+taskId+" deleted successfully...");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Error: No Such task found with Id "+taskId+"!");
    }

}
