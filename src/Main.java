public class Main {
    public static void main(String[] args){
        // create objects
        TruthObject rowOne = new TruthObject(true, true);
        TruthObject rowTwo = new TruthObject(true, false);
        TruthObject rowThree = new TruthObject(false, true);
        TruthObject rowFour = new TruthObject(false, false);


        // display chart header
        System.out.println("    +-------------------------------------------------------------+");
        System.out.printf("%5s%s%6s%4s%10s%10s%10s%10s%10s%s%n", '|','A', 'B',"||", "(A & B)", "(A | B)", "(A && B)", "(A || B)", "(A ^ B)",'|');
        System.out.println("    +---------||--------------------------------------------------+");

        // print out logic chart
        rowOne.printTruthTable(rowOne.getA(), rowOne.getB());
        rowTwo.printTruthTable(rowTwo.getA(), rowTwo.getB());
        rowThree.printTruthTable(rowThree.getA(), rowThree.getB());
        rowFour.printTruthTable(rowFour.getA(), rowFour.getB());
        System.out.print("    +-------------------------------------------------------------+");

        System.out.println();
        System.out.println();
        System.out.println();


// ================ LOOP VERSION ==========================

        // create and fill TruthObject array
        TruthObject[] truths = new TruthObject[4];
        truths[0] = rowOne;
        truths[1] = rowTwo;
        truths[2] = rowThree;
        truths[3] = rowFour;

        //Display Chart header
        System.out.println("    +-------------------------------------------------------------+");

        System.out.printf("%5s%s%6s%4s%10s%10s%10s%10s%10s%s%n", '|','A', 'B',"||", "(A & B)", "(A | B)", "(A && B)", "(A || B)", "(A ^ B)",'|');
        System.out.println("    +---------||--------------------------------------------------+");

        // print out logic chart
        for(int index = 0; index < truths.length; ++index) {
            System.out.printf("%5s%s","|",truths[index].makeChar(truths[index].getA()));
            System.out.printf("%6s",truths[index].makeChar(truths[index].getB()));
            System.out.printf("%4s", "||");
            System.out.printf("%7s",truths[index].makeChar(truths[index].aAndB(truths[index].getA(), truths[index].getB())));
            System.out.printf("%10s",truths[index].makeChar(truths[index].aOrB(truths[index].getA(), truths[index].getB())));
            System.out.printf("%10s",truths[index].makeChar(truths[index].aAndAndB(truths[index].getA(), truths[index].getB())));
            System.out.printf("%10s",truths[index].makeChar(truths[index].aOrOrB(truths[index].getA(), truths[index].getB())));
            System.out.printf("%10s%4s%n",truths[index].makeChar(truths[index].aXorB(truths[index].getA(), truths[index].getB())),'|');
        }

        System.out.print("    +-------------------------------------------------------------+");
    }
}
