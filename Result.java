public class Result {

    private int cows;
    private int bulls;

    public Result(int cows, int bulls) {
        this.setCows(cows);
        this.setBulls(bulls);
    }

    public int getCows() {
        return cows;
    }

    private void setCows(int cows) {
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    private void setBulls(int bulls) {
        this.bulls = bulls;
    }

}
