public class ArrayMethods {
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (x >= ary.length){
      return sum;
    }
    for (int i=0; i<ary[x].length; i++){
      sum += ary[x][i];
    }
    return sum;
  }

  public static int columnSum(int[][] ary, int x){
    int sum = 0;
    for (int i=0; i<ary.length; i++) {
      if (x < ary[i].length) {
        sum += ary[i][x];
      }
    }
    return sum;
  }

  public static int[] allRowSums(int[][] ary){
    int[] ans = new int[ary.length];
    for (int i=0; i<ary.length; i++){
      ans[i] = rowSum(ary, i);
    }
    return ans;
  }

  public static int[] allColSums(int[][] ary){
    int longest = 0;
    for (int i=0; i<ary.length;i++){
      if (ary[i].length > longest){
        longest = ary[i].length;
      }
    }
    int[] ans = new int[longest];
    for (int i=0; i<longest; i++){
      ans[i] = columnSum(ary, i);
    }
    return ans;
  }

  public static boolean isRowMagic(int[][] ary){
    boolean magic = true;
    int[] kek = allRowSums(ary);
    int number = kek[0];
    for (int i=0; i<kek.length; i++){
      if (number != kek[i]){
        magic = false;
      }
    }
    return magic;
  }

  public static boolean isColumnMagic(int[][] ary){
    boolean magic = true;
    int[] kek = allColSums(ary);
    int number = kek[0];
    for (int i=0; i<kek.length; i++){
      if (number != kek[i]){
        magic = false;
      }
    }
    return magic;
  }
}
