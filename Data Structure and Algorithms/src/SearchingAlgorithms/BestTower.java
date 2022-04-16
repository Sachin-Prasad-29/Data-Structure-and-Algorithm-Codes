package SearchingAlgorithms;

public class BestTower {
    public static void main(String[] args) {
        int[] house = {1,5,7,11,12};
        int[] tower = {1,3,5,7,9};
        int range = 3;
        int ans = untility(house, tower, range);
    }
    private static int untility(int[] h,int[] t, int r){
      int ans = 0;
      for(int i = 0; i< t.length; i++){
          ans = Math.max(binarySearch1(i-3,i+3,h),ans);
      }
      System.out.println(" ans = "+ ans);
      return ans;

    }
    private static int binarySearch1(int first, int last , int[] h){
        int utility = 0;
       for(int i= 0; i< h.length; i++){
           if(h[i]> last)
              break;
           if(h[i] <= last && h[i] >=first)
              utility++;

       }
       System.out.println(utility);
       return utility;
    }

}
