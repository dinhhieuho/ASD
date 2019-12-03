public class Lab3 {
    static public void main(String args[]) {
        Cabinet cab = new Cabinet();
        Board board = new Board();

        Drive dr1= new Drive();
        Drive dr2= new Drive();
        Drive dr3= new Drive();
        Bus bus = new Bus();

        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();

        cab.setBoard(board);
        cab.addDrive(dr1);
        cab.addDrive(dr2);
        cab.addDrive(dr3);

        board.setBus(bus);
        board.addCard(card1);
        board.addCard(card2);
        board.addCard(card3);
        
        System.out.println("Total price of computer is: "+ cab.computePrice());
    }
}
