public class Solution {
    
     class coordinates{
         int x;
         int y;
         coordinates(int x , int y)
         {
             this.x = x;
             this.y = y;
         }
         
     }
     public int knight(int A, int B, int C, int D, int E, int F)
     {
         int dir[][] = {
             {-1,-2},{1,-2},{1,2},{-1,2},{-2, -1}, 
                          {2, -1},
                          {-2, 1},
                          {2, 1} };
         boolean visited[][] = new boolean[A+1][B+1];
         Queue<coordinates> q = new LinkedList<coordinates>();
         q.add(new coordinates(C , D));
         int count = 0;
         visited[C][D] = true;
         while(!q.isEmpty())
         {
             int size = q.size();
             for(int j = 0 ; j < size ;j++){
                  coordinates obj = q.poll();
                  if(obj.x == E && obj.y == F)
                     return count;
                  for(int i = 0 ; i < 8 ; i++)
                  {
                     int newx = obj.x + dir[i][0];
                     int newy = obj.y + dir[i][1];
                     if(newx>=0 && newx <= A && newy>= 0 && newy <=B && (visited[newx][newy] == false))
                     {
                         visited[newx][newy] = true;
                         q.add(new coordinates(newx,newy));
                     }
                  }
                  
             }
             count++;
             
         }
         return count;
     }
}

