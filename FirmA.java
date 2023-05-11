public class FirmA extends Firm {
    FirmA(String n, int[] mat){
        super(n);
        int [] specifiedVal = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            if(i % 2 == 0){
                specifiedVal[i] = mat[i];
            }
        }
    }
}
