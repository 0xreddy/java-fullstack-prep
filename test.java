
class Student2{
    String name="REDDY";
    int id;
    
    public String getName(){
    return name;
    }
    
    public static void main(String[] args){
    var s1=new Student2();
    String name=s1.getName();
    System.out.println(name+" In the main");
    
    }
    }