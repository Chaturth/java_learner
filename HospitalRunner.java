class HospitalRunner{

public static void main(String... args)
{
	String[] departmentNames=new String[2];
	departmentNames[0]="cardiology";
	departmentNames[1]="neurology";
	
	Patient[] patients=new Patient[2];
	patients[0]=new Patient("richard",29,"feever");
	patients[1]=new Patient("antony",29,"caugh");
	
	Hospital hospital=new Hospital("Jaideva","bengaluru",100,departmentNames,patients);
	
	hospital.display();
}
}
