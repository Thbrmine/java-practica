class op {
    public static void main(String[] args) {
System.out.println("///////ARITHMETIC///////");
        //ARITHMETIC OPERATORS
        int num1 = 10, num2 = 3;
        int res2;
        res2 = num1 + num2;
        System.out.println("num1 + num2 = " + res2);
        res2 = num1 - num2;
        System.out.println("num1 - num2 = " + res2);
        res2 = num1 * num2;
        System.out.println("num1 * num2 = " + res2);
        res2 = num1 / num2;
        System.out.println("num1 / num2 = " + res2);
        res2 = num1 % num2;
        System.out.println("num1 % num2 = " + res2);

        //INCREMENT AND DECREMENT
        double i = 5;
        System.out.println("i = " + i);
        i++;
        System.out.println("i++ = " + i);
        i--;
        System.out.println("i-- = " + i);
        i += 2; // i = i + 2
        System.out.println("i += 2 = " + i);
        i -= 3; // i = i - 3
        System.out.println("i -= 3 = " + i);
        i *= 4; // i = i * 4
        System.out.println("i *= 4 = " + i);
        i /= 2; // i = i / 2
        System.out.println("i /= 2 = " + i);

System.out.println("///////CASTING///////");
        //CASTING
        double a;
		a = 10 / 3;
		System.out.println("a=" + a );
		a = 10 / 3.0;
		System.out.println("a=" + a );
		a = (double) 10 / 3;
		System.out.println("a=" + a );
System.out.println("///////BOOLEANS///////");
        //BOOLEANS
        int v1 = 300, v2 = 200;
        //GREATER THAN
		boolean res;
		res = v1 > v2;
		System.out.println("v1 > v2 = " + res );

        //LESS THAN
		res = v1 < v2;
		System.out.println("v1 < v2 = " + res );

        //GREATER THAN OR EQUAL TO
		res = v1 >= v2;
		System.out.println("v1 >= v2 = " + res );
        // LESS THAN OR EQUAL TO
		res = v1 <= v2;
		System.out.println("v1 <= v2 = " + res );
        //EQUAL TO
		res = v1 == v2;
		System.out.println("v1 == v2 = " + res );
        //DIFFERENT
		res = v1 != v2;
		System.out.println("v1 != v2 = " + res );
System.out.println("///////LOGICAL OPERATORS///////");
        //LOGICAL OPERATORS
        // AND &&, OR ||, NOT !
        res= 5 >= 5 && true && 10 > 9;
        System.out.println("5 >= 5 && true && 10 > 9 = " + res);

        res= false || false || false|| true;
        System.out.println("false || false || false|| true = " + res);

        res= (5>= (2*3)|| true) && (true && 10 >5);
        System.out.println("(5>= (2*3)|| true) && (true && 10 >5) = " + res);
System.out.println("///////CONDITIONALS///////");
        //IF STATEMENT 
        int x = 10, y = 20;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is not greater than y");
        }
        // exp1 ? exp2 : exp3
    String res1= x > y ? "x is greater than y" : "x is not greater than y";
        System.out.println("Compared: " + res1);
    int enteros = true ? 1 : 0;
        System.out.println("enteros: " + enteros);
    }
}