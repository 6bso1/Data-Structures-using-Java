public class Driver {
    public static void main(String[] args) throws Exception {

        MyBST<String> mybinst = new MyBST<>();
        
        mybinst.add("burcu");
        mybinst.add("gizem");
        mybinst.add("alper");
        System.out.println("'burcu', 'gizem', 'alper' are added");
        mybinst.print();
        mybinst.add("ibrahim");
        mybinst.add("tutku");
        System.out.println("'ibrahim', 'tutku' are added");
        mybinst.print();
        mybinst.add("elif");
        mybinst.add("melissa");
        mybinst.add("enes");
        System.out.println("'elif', 'melissa', 'enes' are added");
        mybinst.print();
        mybinst.delete("alper");
        mybinst.add("sude");
        mybinst.add("bugra");
        System.out.println("'alper' is removed, 'sude', 'bugra' are added");
        mybinst.print();
        mybinst.add("emre");
        mybinst.remove("gizem");
        System.out.println("'gizem' is removed, 'emre' is added");
        mybinst.print();

    }
}
