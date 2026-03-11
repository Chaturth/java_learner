//Step 1: Declare Instance Variables

//Inside Hospital declare:
class Hospital
{
    String hospitalName;
    String city;
    int totalPatients;
    String[] departmentNames;
    Patient[] patients;

    Hospital(String hospitalName,String city,int totalPatients,String[] departmentNames,Patient[] patients)
    {
        this.hospitalName = hospitalName;
        this.city = city;
        this.totalPatients = totalPatients;
        this.departmentNames = departmentNames;
        this.patients = patients;
    }

    void display()
    {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("City: " + city);
        System.out.println("Total Patients: " + totalPatients);

        System.out.println("Departments:");
        if(departmentNames != null)
        {
            for(String d : departmentNames)
            {
                System.out.println(d);
            }
        }

        System.out.println("Patient Details:");
        if(patients != null)
        {
            for(Patient p : patients)
            {
                if(p != null)
                {
                    p.display();
                }
            }
        }
    }
}
