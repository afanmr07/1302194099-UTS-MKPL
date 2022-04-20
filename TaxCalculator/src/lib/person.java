package lib;

public class person extends Employee {
    String employeeId, 
    String firstName,
    String lastName,
            String idNumber,
    String address,

    public String getemployeeId() {
        return employeeId;
    }

    public void setChildEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setChildfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setChildlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getidNumber() {
        return idNumber;
    }

    public void setChildIdNumbers(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getaddress() {
        return address;
    }

    public void setChildaddress(String address) {
        this.address = address;
    }

}
