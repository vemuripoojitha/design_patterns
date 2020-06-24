package factorymethod;
import factorymethod.Get_Plan;


public class Create_Bill {
    public double Cost(String name,double Sqrfoot)

	{

  	  Get_Plan p = new Get_Plan(); 

  	  Cost c = p.plantype(name);  

		c.getRate();

		double d=c.calculateBill(Sqrfoot);

		return d;

	}

}
