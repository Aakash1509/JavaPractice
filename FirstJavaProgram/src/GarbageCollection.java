public class GarbageCollection
{
    public void finalize(){System.out.println("object is garbage collected");}
    GarbageCollection i;
    public static void main(String args[]){
        /*
        GarbageCollection s1=new GarbageCollection();
        GarbageCollection s2=new GarbageCollection();
        s1=null;
        s2=null;
        System.gc();

         */
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();
        GarbageCollection g3 = new GarbageCollection();

        //For every object i value is there
        g1.i = g2;
        g2.i = g3;
        g3.i = g1;
        g1=null; //Still g1 can be accessed by g3.i
        g2=null; //Still g2 can be accessed by g3.i.i
        //Still no objects are available for garbage collection
        g3=null;
        //Now all objects are available for garbage collection
        System.gc();



    }
}
