public class ArrayPractice {

    public static void sum(int[] a){
        for(int i : a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
    //int [] arr = new int[5]; //Declaration and memory allocation
        /*
        int [] marks;
        marks = new int[5]; //Declaration and then memory allocation
        */
        /*
        int [] marks = {10,20,30,40,50};
        System.out.println(marks.length);

        //for-each loop
        for(int element:marks){
            System.out.println(element);
        }

         */

        //Anonymous array : Used for 1 time usage
        //sum(new int[]{1,2,3});

        //2-D array
        /*
        int [][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
         */

        //Jagged array
        int [][] flats = new int[3][];

        flats[0] = new int[3];
        flats[1] = new int[4];
        flats[2] = new int[2];
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                flats[i][j] = (int)(Math.random()*10);
            }
        }

        for(int n[]:flats){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }




    }
}
