package employee;

class employee {
	String name,surname,address;
	double basic_salary;
	public employee(String name,String surname,String address,double basic_salary) {
		this.name=name;
		this.surname=surname;
		this.address=address;
		this.basic_salary=basic_salary;
		
	}
	public void getBasic_salary() {
		System.out.println(basic_salary);
	}
	void display(){
		System.out.println(name);
		System.out.println(surname);
		System.out.println(address);
		System.out.println(basic_salary);
	}
}

class Temp_employee extends employee{
	
	Temp_employee(String name,String surname,String address,double basic_salary){
		super(name, surname, address, basic_salary);
	}
	void calculateNetSalary(int noofdays,int nodaysmonth) {
		System.out.println((noofdays * basic_salary)/nodaysmonth);
	}
}

class Fulltime_employee extends employee{
	Fulltime_employee(String name,String surname,String address,double basic_salary){
		super(name, surname, address, basic_salary);
		}
	
	void calculateNetamount(double pf) {
		System.out.println(( basic_salary +(basic_salary * pf/100)));
	}
}
class main{

	public static void main(String []args)
	{
		Temp_employee obj =new Temp_employee("nick","James","xyz street",12000);
		Fulltime_employee obj2=new Fulltime_employee("john","Mad","abc street",18000);
		obj.calculateNetSalary(28, 30);
		obj2.calculateNetamount(12.34f);
	}
}

		