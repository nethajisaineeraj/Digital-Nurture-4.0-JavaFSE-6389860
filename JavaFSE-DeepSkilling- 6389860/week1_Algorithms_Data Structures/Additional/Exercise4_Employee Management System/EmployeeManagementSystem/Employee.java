public class Employee {
    public static Employee arr[] = new Employee[10];
    public static int idx = 0;
    int employeeId;
    String name;
    String position;
    double salary;
    void add(int employeeId, String name, String position, double salary){
        Employee obj = new Employee();
        obj.employeeId = employeeId;
        obj.name = name;
        obj.salary = salary;
        obj.position = position;
        arr[idx++] = obj;
    }
    int searchEmployee(int id){
        int i = 0;
        while(i<arr.length && arr[i]!=null){
            if(arr[i].employeeId == id){
                return i;
            }
            i++;
        }
        return -1;
    }
    Employee search(int id){
        int index = searchEmployee(id);
        if(index!=-1){
            System.out.println("Employee Found Sucessfully...");
            return arr[index];
        }
        System.out.println("Error: No Employee Found with the Id "+id+"!");   
        return null;
    }
    void traverse(){
        int i=0;
        if(arr[0]==null){
            System.out.println("Error: Employee List is Empty!");
        }
        System.out.println("Id       Name     Position     Salary");
        while(i<arr.length && arr[i]!=null){
            System.out.println(arr[i].employeeId+"        "+arr[i].name+"   "+arr[i].position+"   "+arr[i].salary);
            i++;
        }
    }
    void delete(int id){
        int index = searchEmployee(id);
        if(index==-1){
            System.out.println("Error: No Employee Found with the Id "+id+"!");
            return ;
        }
        while(index<arr.length-1 && arr[index]!=null){
            arr[index] = arr[index+1];
            index++;
        }
        arr[index] = null;
        idx--;
        System.out.println("Employee Deleted Successfully...");
    }
}
