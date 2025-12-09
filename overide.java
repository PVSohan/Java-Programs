class Parent {
    public void show() {
        System.out.println("Parent's show");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("Child's show");
    }
}

class sohan {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.show();
        obj2.show();
    }
}