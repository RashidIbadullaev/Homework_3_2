public class BankAccount {

    private double amount;


    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {

        amount = amount + sum;


        return sum;
    }


    public void withDraw(double sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Ошибка. Остаток на счёту, меньше выбранной вами суммы.", amount);
        }
        System.out.println("сумма: " + amount + " вы сняли деньги со счёта " + sum);

        amount = amount - sum;

    }


}
