public class Seat {
    private int seatNumber;
    private boolean reserved;

    public Seat(int seatNumber) {
     this.seatNumber = seatNumber;
     this.reserved = false; // every new seat starts as available
    }
    public boolean reserve() {
        if (reserved) {
            return false;  
}
        reserved = true;
        return true;
}
    public boolean isReserved() {
return reserved;
 }

 public int getSeatNumber() {
  return seatNumber;
 }
 }
