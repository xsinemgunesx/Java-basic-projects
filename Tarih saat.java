package tarihsaatjava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class tarihsaatjava {
	public static void main(String[] args) {
	     long bugunkuMilliSaniye=System.currentTimeMillis();
	     System.out.println("toplam milisaniye: "+bugunkuMilliSaniye);
	     
	    
	     Date bugun=new Date();
	     System.out.println("Bugün : "+bugun);
	     System.out.println("**");
	     Date bugun2=new Date(bugunkuMilliSaniye);
	     System.out.println(bugun2);
	     System.out.println("***");
	     
	     
	     Date date= new Date();
	     SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss ");
	     System.out.println(sdf.format(date));
	     SimpleDateFormat sdf1=new SimpleDateFormat("X");
	    		 System.out.println(sdf1.format(date));
	    		 
	    		 
	    			 
	                  String pattern = "dd-MM-yyyy";
	    			  SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	    			 
	    			  String datee = simpleDateFormat.format(new Date());
	    			  System.out.println(datee);
	    			  Date simdikiZaman=new Date();
	    			  System.out.println(simdikiZaman.toString());
	    			  
	    			  System.out.println("*********");
	    			  SimpleDateFormat sekil=new SimpleDateFormat("HH:mm:ss	");
	    			  Date clock=new Date();
	    			  System.out.println(sekil.format(clock));
	    			 
	     
	     
	     
	     
		}

}
