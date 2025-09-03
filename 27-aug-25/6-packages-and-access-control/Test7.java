class AccessDemo {
    private int a=1; int b=2; protected int c=3; public int d=4;
    private void pri(){System.out.println("Private="+a);}
    void def(){System.out.println("Default="+b);}
    protected void pro(){System.out.println("Protected="+c);}
    public void pub(){System.out.println("Public="+d);}
}
public class Test7 {
    public static void main(String[] args){
        AccessDemo obj=new AccessDemo();
        obj.def(); obj.pro(); obj.pub(); 
        // obj.pri();  private not accessible
    }
}
