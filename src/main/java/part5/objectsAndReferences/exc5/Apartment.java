package part5.objectsAndReferences.exc5;

public class Apartment {
    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares < compared.getSquares()) {
            return false;
        }
        return true;
    }

    public int priceDifference(Apartment compared) {
        int cost = this.squares * this.princePerSquare;
        return Math.abs(cost - compared.getTotalPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getTotalPrice() > compared.getTotalPrice()) {
            return true;
        }
        return false;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public int getTotalPrice() {
        return this.squares * this.princePerSquare;
    }
}
