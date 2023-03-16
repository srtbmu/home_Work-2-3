public class Main {
    public static void main(String[] args) {
        BankAccount visa = new BankAccount();
        visa.deposit(20000.00);
        while (true) {
            try {
                visa.withDraw(6000.00);
            } catch (LimitException e) {
                try {
                    visa.withDraw((Double) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
            }break;
        }

    }
}