package pl.coderslab.sonarlint;

public class Person {
    private String firstName;
    private String lastName;


    public String getFirstName() {
        //System.out.println("Getting FirstName");
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        //System.out.println(this.firstName.charAt(0) + "." + this.lastName.charAt(0) + ".");
        return "";
    }

}

