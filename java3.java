class pen{
    String color;
    String type;
    
    public void printpen(){
        System.out.println("color of the pen is" +this.color);
        System.out.println("type of the pen is" +this.type);

    }
}
public class java3{
    public static void main(String[] args){
        pen p1=new pen();
        p1.color="red";
        p1.type="gel";
        p1.printpen();
        pen p2=new pen();
        p2.color="blue";
        p2.type="ballpoint";
        p2.printpen();
        pen p3=new pen();
        p3.color="black";
        p3.type="fountain";
        p3.printpen();
        pen p4=new pen();
        p4.color="green";
        p4.type="marker";
        p4.printpen();
    }

} 

