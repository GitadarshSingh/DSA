class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       int x1 = coordinates[0][0]; 
       int y1 = coordinates[0][1]; 
       int x2 = coordinates[1][0]; 
       int y2 = coordinates[1][1]; 

       for(int i=2;i<coordinates.length;i++){
          if((y2 - y1) * (coordinates[i][0] - x2) != (coordinates[i][1] - y2) * (x2 - x1)){
            return false;
          }
       }
       return true;
    }
}