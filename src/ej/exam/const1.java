package ej.exam;

public class const1 {
	
	int sid;
	String sname;
    String semail;
    
    const1()
    {
       System.out.println("Zero parameter constructor222");	
    }
    
    const1(int id,String sn,String em)
    {
     System.out.println("3 parameter constructor");
     sid = id;
     sname = sn;
     semail = em;
    }
    
    public void display()
    {
    System.out.println(sid);
    System.out.println(sname);
    System.out.println(semail);
    }
    
    

	public static void main(String[] args) {
      const1 cc = new const1();
      const1 bb = new const1(3,"santosh","abc@gmail.com");
      cc.display();
      bb.display();

	}

}
