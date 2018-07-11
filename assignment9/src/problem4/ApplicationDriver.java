package problem4;

public class ApplicationDriver {

    public static void main(String[]args){
        Solution s = new Solution();
        int[] array1 = {3,4,71,6,99,21,43,23};
        System.out.print("Previous array is : ");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+",");
        }
        System.out.println();
        int[] newarray1 = s.solution(array1,4);
        System.out.print("New array is : ");
        for(int i=0;i<array1.length;i++){
            System.out.print(newarray1[i]+",");
        }

    }

    static class Solution{
        public static int[] solution(int[] array1, int K) {
            int[] newarray1 = new int[array1.length];
            for(int i=0;i<array1.length;i++){
                if(i+K>=array1.length){
                    newarray1[i+K-array1.length] = array1[i];
                } else {
                    newarray1[i+K] = array1[i];
                }
            }
            return newarray1;
        }
        }
    }