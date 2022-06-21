class Bus {
    final int speedlimit = 60;// final variable
	void run() {
        speedlimit = 90;
        System.out.println("Bus is running with speedlimit: " + speedlimit);
    }
}

// end of class

public class Final01 {
    public static void main(String args[]) {
        Bus obj = new Bus();
        obj.run();
    }

}
