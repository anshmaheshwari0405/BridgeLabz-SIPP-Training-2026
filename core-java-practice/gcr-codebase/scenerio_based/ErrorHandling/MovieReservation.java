class MovieReservation {

    int seats[] = {101, 102, 103, 104, 105};

    public int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position requested.");
            return -1;
        }
    }

    public static void main(String[] args) {
        MovieReservation mr = new MovieReservation();

        System.out.println("Seat Number: " + mr.getSeat(2));
        System.out.println("Seat Number: " + mr.getSeat(8));
    }
}