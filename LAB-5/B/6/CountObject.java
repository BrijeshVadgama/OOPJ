class CountObject {
    static int i;
    CountObject() {
        i++;
    }
    void CountPrint() {
        System.out.println("Count Of Object is: "+i);
    }

    public static void main(String[] args) {
        CountObject c1 = new CountObject();
        CountObject c2 = new CountObject();
        CountObject c3 = new CountObject();
        CountObject c4 = new CountObject();
        CountObject c5 = new CountObject();
        c1.CountPrint();
    }
}
