import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try{
            bankApplication.process("accountId000", 50, "USD");
            bankApplication.process("accountId003", 250, "HRV");
            bankApplication.process("accountId001", 50, "EUR");
            bankApplication.process("accountId001", 50, "USD");
        }catch (WrongAccountException wrongAccountException){
            System.out.println("Account doesn't exist");
        }catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account contains different currency");
        }catch(WrongOperationException wrongOperationException) {
            System.out.println("Error. Try again later");
        }catch(Exception exception){
            System.out.println("There are no enough money on your account");
        }finally{
            System.out.println("Thanks for using our service");
        }
        }
}