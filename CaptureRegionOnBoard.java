public class Solution {
    public void dfs(ArrayList<ArrayList<Character>> a , int i , int  j , int r , int c)
    {
        if( a.get(i).get(j) == 'O')
        {
            a.get(i).set(j , 'U');
            if(i-1 > 0) dfs(a , i -1 , j , r , c);
            if( i+1 < r) dfs(a , i+1 , j , r ,c);
            if(j-1 > 0) dfs(a , i , j -1 , r , c);
            if( j+1 < c) dfs(a , i , j + 1 , r ,c);
        }
        else
         return;
    }
    
    public void solve(ArrayList<ArrayList<Character>> a) {
        int r = a.size();
        int c = a.get(0).size();
        int j = 0 , i = 0;
        for(j = 0 ; j < c ; j++)
        {
            if(a.get(0).get(j) == 'O')
            {
                //a.get(i).set(j , 'U');
                dfs( a , i , j , r , c);
            }
        }
        j = 0 ; i = r-1;
        
        for(j = 0 ; j < c ; j++)
        {
            if(a.get(i).get(j) == 'O')
            {
                //a.get(i).set(j , 'U');
                dfs( a , i , j , r , c);
            }
        }
        j = 0 ; i = 0;
        for( i = 0 ; i < r ; i++)
        {
            if(a.get(i).get(j) == 'O')
            {
                //a.get(i).set(j , 'U');
                dfs( a , i , j , r , c);
            }
        }
        i = 0 ; j = c-1;
         for( i = 0 ; i < r ; i++)
        {
            if(a.get(i).get(j) == 'O')
            {
                //a.get(i).set(j , 'U');
                dfs( a , i , j , r , c);
            }
        }
       for( i = 0 ; i < r ; i++)
        {
            for( j = 0 ; j < c ; j++)
            {
                if(a.get(i).get(j) == 'U')
                   a.get(i).set(j,'O');
               else if(a.get(i).get(j) == 'O')
                  a.get(i).set(j , 'X');
                   
            }
        }
    }
     
}
