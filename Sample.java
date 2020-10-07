public class Sample {
    public int counter = 1;

    public void display() {
        System.out.println("display method");
    }

public static void main(String[] args) {
    Sample s = new Sample();
    System.out.println(s.counter);
}

}
