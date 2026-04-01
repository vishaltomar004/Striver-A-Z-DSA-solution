public class A {
    
    public static void main(String []args){
     X x1 =  X.getObject();
     System.out.println(x1.hashCode());
     X x2= new X();
     System.out.println(x2.hashCode());

       

    }
    }



class X{
 
private static X x = new X();
    private  X(){
           System.out.println("X called");
    }

    public synchronized X getObject(){
        if(x !=null){
            return x;
        }
        else {
            return new X();
        }
    }
}




