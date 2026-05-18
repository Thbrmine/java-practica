class conditionals {
    public static void main(String[] args) {
        int x = 3;
        int y = 21;
        String res1= x > y ? "y incremented to " + (y++) : "y decremented to " + (--y);
        System.out.println("X=" + x + ", Y=" + y + ", Result: " + res1);
        String res2= x < y ? "x incremented to " + (x++) : "x decremented to " + (--x);
        System.out.println("X=" + x + ", Y=" + y + ", Result: " + res2);
        
        // CODE BY PROFESSOR
        System.out.println("///////Code by professor///////");
        int a=1;
		int b=3;
		String res3= a > 2 ? "b++ to " + (b++) : "b-- to " + (--b);
		System.out.println("A=" + a + ", B=" + b + ", Result: " + res3);

		a = 3;
		b = 2;
		String res4= a < b ? "a++ to " + (a++) + " and b++ to " + (b++) : "a-- to " + (--a) + " and b-- to " + (--b);
		System.out.println("A1=" + a + ", B1=" + b + ", Result: " + res4);

		a = 3;
		b = 21;
		String res5= a < b ? "a++ to " + (a++) + " and b-- to " + (b--) : "a-- to " + (--a) + " and b++ to " + (b++);
		System.out.println("A2=" + a + ", B2=" + b + ", Result: " + res5);	

		a = 3;
		b = 21;
		String res6= a > b ? "a-- to " + (a--) + " and b++ to " + (b++) : "a++ to " + (a++) + " and b-- to " + (--b);
		System.out.println("A3=" + a + ", B3=" + b + ", Result: " + res6);

    }
}