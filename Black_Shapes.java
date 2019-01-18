public class Solution {
   public void dfs(boolean visited[][] , ArrayList <String> A , int i , int j , int n , int k)
   {
      if(A.get(i).charAt(j) == 'X' &&  !visited[i][j])
       {
           visited[i][j] = true;
           if(i+1 < n ) dfs(visited , A , i+1 , j , n , k);
           if(i-1 >=0) dfs(visited , A , i-1 , j , n , k);
           if(j+1 <k) dfs(visited, A , i , j+1 , n , k);
           if(j-1 >=0) dfs(visited , A , i , j-1 , n , k);
       }
       else return;
     
   }
    public int black(ArrayList<String> A) {
        int count = 0 ;
        boolean visited[][] = new boolean[A.size()][A.get(0).length()];
        int j = 0;
        int la = A.size();
        int sl = A.get(0).length();
        for( int i = 0 ; i < la ; i++)
        {
        
            for(j = 0 ; j < sl ; j++)
            {
                if( A.get(i).charAt(j) == 'X' && visited[i][j] == false)
                {   dfs(visited , A , i , j , la , sl );
                    count++;
                }
               
            }
        } 
        return count;
    }
}
