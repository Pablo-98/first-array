public class firstArray{

    public static void main (String[] args) {

        //the Dr. presents us with two ways to initialize the arrays
        int [] a = new int[5]; // array with 5 VALUES (not indexes)

        int [] b = {1,2,3,4,5,6,7,8,9};

        a[0] = 1; //index 0
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;// index 4
        System.out.println(a); // prints [I@7ad041f3] after the @, we get a location in where this array is stored in memory

        for(int i=0; i<b.length; i++) {
            System.out.println(a[i]); // output a at index i;
        }
    }
}