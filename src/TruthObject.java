public class TruthObject {

        // ========== fields =========
        private Boolean a;
        private Boolean b;


        // ======== constructor ===============
	public TruthObject(Boolean a, Boolean b) {
        setA(a);
        setB(b);
    }

        // ========== getters / setters ===============
        public Boolean getA() {
        return a;
    }

        private void setA(Boolean a) {
        this.a = a;
    }

        public Boolean getB() {
        return b;
    }

        private void setB(Boolean b) {
        this.b = b;
    }



        public void printTruthTable(boolean a, boolean b) {

        System.out.printf("%5s%s%6s%4s%7s%10s%10s%10s%10s%4s%n","|",
                makeChar(a), makeChar(b),"||", makeChar((a & b)),
                makeChar((a | b)), makeChar((a && b)), makeChar((a || b)), makeChar((a ^ b)),"|");
    }
        public char makeChar(Boolean bool) {
        return Character.toUpperCase(Boolean.toString(bool).charAt(0));
    }

        public Boolean aOrB(Boolean a, Boolean b) {
        return (a | b);
    }
        public Boolean aAndAndB(Boolean a, Boolean b) {
        return (a && b);
    }
        public Boolean aOrOrB(Boolean a, Boolean b) {
        return (a || b);
    }
        public Boolean aAndB(Boolean a, Boolean b) {
        return (a & b);
    }
        public Boolean aXorB(Boolean a, Boolean b) {
        return (a ^ b);
    }



    }
