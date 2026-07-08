public class SRP {

    public static void main(String[] args) {

        SalaryService salary = new SalaryService();
        salary.calculateSalary();

        EmailService email = new EmailService();
        email.sendEmail();

    }

}

class SalaryService {

    void calculateSalary() {
        System.out.println("Calculating salary");
    }

}

class EmailService {

    void sendEmail() {
        System.out.println("Sending email");
    }

}