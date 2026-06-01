public class StringHasher{
    public static void main(String[] args){
        String input="ImperialComputing";
        System.out.println("Input string: "+input);
        if(input!=null){
            long hashValue=computeDjb2Hash(input);
            System.out.println("Calculated djb2 Hash: "+hashValue);
        }
        else{
            System.out.println("Error: Input cannot be null.");
        }
    }
    public static long computeDjb2Hash(String str){
        long hash=5381;
        int len=str.length();
        for(int i=0;i<len;i++){
            hash=((hash<<5)+hash)+str.charAt(i);
        }
        return hash;
    }
}
