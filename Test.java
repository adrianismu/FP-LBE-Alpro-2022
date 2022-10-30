class Test {
    public static void main(String[] args) {

        Telecommunication[] test = new Telecommunication[4];
        test[0] = new MobilePhone("+62-817-555-523", "+62-858-555-624", "iPhone 13 Pro Max");
        test[1] = new Telephone("479-208-1992", "479-215-3931");
        test[2] = new VOIP("410-331-9081", "561-364-6107", true);
        test[3] = new VOIP("919-239-4504", "760-398-8588", false);

        test[0].call();
        test[1].call();
        test[2].call();
        test[3].call();
    }
}