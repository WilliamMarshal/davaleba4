public class LiarsDice {
    public static void main(String[] args) {
        LiarsDice l = new LiarsDice();
        System.out.printf("ეს კომბინაცია %s", l.checkTwoPairCategory(new int[]{1, 1, 2, 2, 5})? "სწორია":"არასწორია");
    }

    private Boolean checkTwoPairCategory (int [] dice){
        int counter = 0;
        for (int i = 0; i < dice.length; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i] == dice[j]) {
                    counter++;
                }
            }
        }
        return counter == 2;
    }
}
