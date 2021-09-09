class Test {
    int x;
    static int y;

    void show() {
        System.out.println("Data: " + x + y);
    }
    static void display() {
        System.out.println("Data: " + y);
    }
}
class Testdrive {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.x = 40;
        ob.y = 30;
        ob.show();
        ob.display();
    }
}