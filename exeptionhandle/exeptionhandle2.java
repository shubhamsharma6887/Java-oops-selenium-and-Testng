public class exeptionhandle2 {
    public static void main(String[] args) {
        try{
        int [] listnum = {2,3,4,5,6,7};
        System.out.println(listnum[7]);}
        catch (ArrayIndexOutOfBoundsException r){
            System.out.println("indextion is out the list or the objext");
        }
    }
}
