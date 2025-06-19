class Logger{
    static Logger obj = new Logger();
    private Logger(){}
    public static Logger getInstance(){
        return obj;
    } 
    void printThis(){
        System.out.println(this);
    }
}
public class Main{
    public static void main(String args[]){
        Logger obj = Logger.getInstance();
        obj.printThis();
        Logger obj2 = Logger.getInstance();
        obj2.printThis();
        // this will create only one instance of the Logger class so Logger class 
        // is a singleton class even if we try to create another object it will not give 
        // a new one it only gives the existing object/instance
    }
}