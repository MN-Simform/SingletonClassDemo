class Parent {
    private static Parent parent;
    private Parent(){
        System.out.println(parent);
    }
    public static Parent getInstance(){
        if (parent == null) {
            parent = new Parent();
        }
        return parent;
    }
}

public class Main {
    public static void main(String[] args) {
            System.out.println(Parent.getInstance());
            System.out.println(Parent.getInstance());
    }
}

