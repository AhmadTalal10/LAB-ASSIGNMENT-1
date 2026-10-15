public class Bus {
    private String busNumber;
    private Seat[][] seats;

    public Bus(){
        this("DEFAULT-BUS", 2);
 }

    public Bus(String busNumber, int rows){
        this.busNumber = busNumber;
        seats = new Seat[rows][4];
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = new Seat(number);
                number++;
   }
   }
  }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    System.out.print("|| ");
     }
                int num = seats[i][j].getSeatNumber();
                if (num < 10) {
                    System.out.print("0");
     }
                System.out.print(num + ":");
                if (seats[i][j].isReserved()) {
                    System.out.print("X");
     } else{
                    System.out.print("O");
      }
                if (j != 3) {
                    System.out.print(" ");
        }
        }
            System.out.println();
    }
    }

    public void reserveSeat(int seatNumber) {
    for (int i = 0; i < seats.length; i++) {
     for (int j = 0; j < 4; j++) {
     if (seats[i][j].getSeatNumber() == seatNumber) {
     if (seats[i][j].reserve()) {
     System.out.println("Reserving Seat " + seatNumber + ": Successful");
     } else{
         System.out.println("Reserving Seat " + seatNumber + ": Already Reserved");
        }
       return;
     }
     }
     }
     System.out.println("Reserving Seat " + seatNumber + ": Invalid Seat Number");
    }

    public int countAvailableSeats() {
     int count = 0;
    for (int i = 0; i < seats.length; i++) {
     for (int j = 0; j < 4; j++) {
      if (!seats[i][j].isReserved()) {
       count++;
     }
     }
     }
   return count;
  }
}
