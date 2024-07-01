public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
//        for (int i = 1; i <= 5; i++) {
//            tree.insert(i);
//
//        }
        tree.insert(5);
        tree.insert(6);
        tree.insert(11);
        tree.insert(12);
        tree.insert(4);
        tree.insert(7);
        tree.insert(8);
        System.out.println(tree.find(1));
        System.out.println(tree.find(8));
    }
}

