public class Main {
    public static void main(String[] args) {
        Theater theatre = new Theater("Olympian", 8, 12);
        theatre.getSeats();
        if(theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }
    }
}
