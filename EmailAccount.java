import java.util.Scanner;

public class EmailAccount {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultpasswordLength = 10;
    private int mailboxCapacity = 500;
    private String altEmail;
    private String companyDoman = "gamble.com";
    private String alternateEmail;

    //RECEIVE FIRST & LAST NAME//
    public EmailAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName );
        //CALL METHOD FOR DEPARTMENT
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        //RANDOM PASSWORD
        this.password = randomPassword(defaultpasswordLength);
        System.out.println("Password: " + this.password);

        //CREATE EMAIL
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyDoman;
        System.out.println("Email: " + email);
    }

    //ASK FOR DEPARTMENT//
    private String setDepartment(){
        Scanner scan = new Scanner(System.in);
        System.out.println("DEPARTMENT CODE");
        System.out.println("0)Sales...1)Training... 2)Accounting");
        int departmentChoice = scan.nextInt();
        if(departmentChoice ==0){return "sales";}
        else if(departmentChoice ==1){return "Training";}
        else if(departmentChoice ==2){return "Accounting";}
        else{return "";}
    }

    //RANDOM PASSWORD
    public String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] password = new char[length];
        for(int i =0; i < length;i++){
         int rand = (int) (Math.random() * passwordSet.length());
         password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //MAIL CAPACITY
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //ALT EMAIL
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //CHANGE PASSWORD
    public void changePassword(String password){
        this.password = password;
    }
    //MAILBOX CAPACITY
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAltEmail(){return altEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName +
                "Company Email: " + email +
                "Mailbox Capacity: " + mailboxCapacity +"gb";

    }


}
