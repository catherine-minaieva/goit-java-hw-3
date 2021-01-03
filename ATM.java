public class ATM {
    public int countBanknotes(int sum) {
        int banknotes = 0;
        int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int quantity;
        int i = 0;
        while (i < nominals.length){
            quantity = nominals[i];
            banknotes += sum / quantity;
            sum %= quantity;
            i++;
        }

        return banknotes;
    }
}
