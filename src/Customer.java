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


    public Customer(String neuid,String neuiBAN,String neufirstName,String neulastName,String neudateOfBirth,String neuresidence,String neunationality,String neueMail,String neutelNumber,String neuaccountType,String neubalance,String neutransactions){
        this.id = neuid;
        this.iBAN = neuiBAN;
        this.firstName = neufirstName;
        this.lastName = neulastName;
        this.dateOfBirth = neudateOfBirth;
        this.residence = neuresidence;
        this.nationality = neunationality;
        this.eMail = neueMail;
        this.telNumber = neutelNumber;
        this.accountType = neuaccountType;
        this.balance = neubalance;
        this.transactions = neutransactions;
    }


}
