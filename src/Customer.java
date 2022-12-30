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

    private void sortByLastName(){
        //Bubblesort

    }

    private void sortByAccountType(){
        //Bubblesort

    }

    private void sortByBalance(){
        //Bubblesort

    }

    private void sortByAge(){
        //Bubblesort

    }

    private void getAccTypePercent(){
        int accTypeSmart = 0;
        int accTypePlus = 0;
        int accTypeMax = 0;

        for (int i = 0; i < 21; i++){ //TODO link to accountType
            if (accountType[i] = "Smart") {
                accTypeSmart++;
            }
            if (accountType[i] = "Plus") {
                accTypePlus++;
            }
            if (accountType[i] = "Max") {
                accTypeMax++;
            }

        }

        int percentSmart = 0;
        int percentPlus = 0;
        int percentMax = 0;

        percentSmart = accTypeSmart/21;
        percentPlus = percentPlus/21;
        percentMax = percentMax/21;

        System.out.println(percentSmart + "% has the Smart account type");
        System.out.println(percentPlus + "% has the PLus account type");
        System.out.println(percentMax + "% has the Max account type");
    }

    private void showCustomerACCType(String ACCType){

        for (int i = 0; i < 21; i++){ //TODO link to accountType
            if (ACCType = "Smart" && accountType[i] = "Smart") {
                System.out.println(Customer[i]); //TODO give out all customer info (Customer[i])
            }
            if (ACCType = "Plus" && accountType[i] = "Plus") {
                System.out.println(Customer[i]); //TODO give out all customer info (Customer[i])
            }
            if (ACCType = "Max" && accountType[i] = "Max") {
                System.out.println(Customer[i]); //TODO give out all customer info (Customer[i])
            }

        }
    }

    private void searchIBAN(int sIBAN){
        for (int i = 0; i < 21; i++){
            if (sIBAN == accountNumber[i]){ //TODO link accountNumber
                System.out.println("***IBAN found***");
                System.out.println("The IBAN belongs to ID: " + i + "\n This is " Customer[i]); //TODO give out all customer info (Customer[i])
                break;
            }
        }
    }


    private void searchLastName(String sLastName){
        for (int i = 0; i < 21; i++){
            if (sLastName == lastName[i]){ //TODO link lastName
                System.out.println("***lastName found***");
                System.out.println("The last name belongs to ID: " + i + "\n This is " Customer[i]); //TODO give out all customer info (Customer[i])
                break;
            }
        }
    }


*/}
