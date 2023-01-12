import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Customer {

    String id;
    String iBAN;
    String firstName;
    String lastName;
    String dateOfBirth;
    String residence;
    String nationality;
    String eMail;
    String telNumber;
    String accountType;
    String balance;
    String transactions;


    public Customer(String neuid, String neuiBAN, String newfirstName, String newlastName, String neudateOfBirth, String neuresidence, String neunationality, String neueMail, String neutelNumber, String neuaccountType, String neubalance, String neutransactions){
        this.id = neuid;
        this.iBAN = neuiBAN;
        this.firstName = newfirstName;
        this.lastName = newlastName;
        this.dateOfBirth = neudateOfBirth;
        this.residence = neuresidence;
        this.nationality = neunationality;
        this.eMail = neueMail;
        this.telNumber = neutelNumber;
        this.accountType = neuaccountType;
        this.balance = neubalance;
        this.transactions = neutransactions;
    }

    int getAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthdate = LocalDate.parse(dateOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthdate, currentDate).getYears();
    }


}
