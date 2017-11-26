public class IsArrayAnObject {

    public static void main(String[] args) {
        //You can even assign null to an array!
        int[] arrayNull = null;
        System.out.println(arrayNull);//null
        System.out.println(arrayNull instanceof Object);//false

        int[] anArray = new int[2];
        System.out.println(anArray);//[I@15db9742
        System.out.println(anArray instanceof Object);//true
        System.out.println(anArray.length);//2
        //prints 0,0    
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("anArray[" + i + "] = " + anArray[i]);
        } 
    }
}
