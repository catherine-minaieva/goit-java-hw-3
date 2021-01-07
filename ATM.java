public class ATM {
    public int countBanknotes(int sum) {
        int banknotes = 0;
        int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int quantity;
        int i = 0;
        while (i < nominals.length){
            banknotes += sum / nominals[i];
            sum %= nominals[i];
            i++;
        }

        return banknotes;
    }
}
