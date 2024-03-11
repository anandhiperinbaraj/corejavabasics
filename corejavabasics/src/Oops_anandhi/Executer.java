package Oops_anandhi;

public class Executer {

	public static void main(String[] args) {
		customer c1=new customer();
		c1.setCid(219);
		c1.setCname("PERM");
		c1.setAddress("PONDICHERRY");
		System.out.println("CUSTOMER ID:"+c1.getCid()+"CUSTOMER NAME:"+c1.getCname()+"CUSTOMER ADDRESS:"+c1.getAddress());
		customer c2=new customer();
		c2.setCid(220);
		c2.setCname("SUNDARI");
		c2.setAddress("BANGALORE");
		System.out.println(c2);
		customer c3=new customer();
		System.out.println(c3);
		customer c4=new customer(221,"valarmathi","chennai");
		System.out.println(c4);
	}
}
