public class IsItAHeap {

    public static void main(String[] args) {
        int[] A = {18,9,16,4,8,12,13,1,2};
        boolean checkForMax = true;

        int index = 0;
        if(checkForMax) {
            if(checkMaxHeap(A, index)){
                System.out.println("given array is a max heap");
            }else{
                System.out.println("given array is not a max heap ");
            }
        } else {
            if(checkMinHeap(A, index)){
                System.out.println("given array is a min heap");
            }else{
                System.out.println("given array is not a min heap ");
            }
        }
    }

    public static boolean checkMinHeap(int[] A, int i){
        if(2*i + 2 >A.length){
            return true;
        }
        boolean left = (A[i] <= A[2*i+1] && checkMinHeap(A, 2*i+1));
        boolean right = (2*i + 2 == A.length) || (A[i]<= A[2*i+2] && checkMinHeap(A, 2*i+2));

        return left && right;
    }

    public static boolean checkMaxHeap(int[] A, int i){
        if(2*i + 2 >A.length){
            return true;
        }
        boolean left = (A[i] >= A[2*i+1] && checkMaxHeap(A, 2*i+1));
        boolean right = (2*i + 2 == A.length) || (A[i]>= A[2*i+2] && checkMaxHeap(A, 2*i+2));

        return left && right;
    }
}
