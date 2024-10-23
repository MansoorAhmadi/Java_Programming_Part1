package part4.oop.exc15;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        count++;
        this.sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        // write code here
        return sum;
    }

    public double average() {
        // write code here
        if (this.sum != 0 & this.count != 0) {
            return 1.0 * this.sum / this.count;
        }
        return 0.0;
    }
}
