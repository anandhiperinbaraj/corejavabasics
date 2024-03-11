package Oops_anandhi;

public class customer {
	private int cid;
	private String cname;
	private String address;
	public customer()
	{
		this.cid=01;
		this.cname="unknown";
		this.address="somewhere";
	}
	public customer(int cid,String cname,String address)
	{
		this.cid=cid;
		this.cname=cname;
		this.address=address;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString()
	{
	return "customer [cid="+cid+",cname="+cname+",address="+address+"]";
	}
}
