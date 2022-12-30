public class Customer {

    int id;
    int iBAN;
    String firstName;
    String lastName;
    int dateOfBirth;
    String residence;
    String nationality;
    String eMail;
    int telNumber;
    String accountType;
    int balance;
    int transactions;


    public Customer(int neuid,int neuiBAN,String neufirstName,String neulastName,int neudateOfBirth,String neuresidence,String neunationality,String neueMail,int neutelNumber,String neuaccountType,int neubalance,int neutransactions){
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
        this.transactions =neutransactions;
    }

    public void objectmethode(int id, int iBAN){
        /*String i = String.valueOf(id);
        Customer i = new Customer(iBAN);*/
    }


}
