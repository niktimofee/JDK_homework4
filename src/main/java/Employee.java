public class Employee {
    private int personalNumber;
    private int phoneNumber;
    private String name;
    private int workExperience;

    public Employee(int personalNumber, int phoneNumber, String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
        this.phoneNumber = phoneNumber;
        this.personalNumber = personalNumber;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "\n" +
                "{" +
                "Personal number = " + personalNumber +
                ", Phone number = " + phoneNumber +
                ", Name = '" + name + '\'' +
                ", Work experience = " + workExperience +
                '}';
    }
}