class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n=coordinates.length;
        int x1,x2,y1,y2,count=1,lhs,rhs,m,x,y;
        int i;
        for(i=0;i<n-1;i++)
        {
            x1=coordinates[i][0];
            y1=coordinates[i][1];
            x2=coordinates[i+1][0];
            y2=coordinates[i+1][1];
            x=x2-x1;
            y=y2-y1;
            if(x==0||y==0)
            {
                m=0;
            }
            else
            {
                m=(y2-y1)/(x2-x1);
            }
            lhs=(y2-y1);
            rhs=m * (x2-x1);
            if(rhs==lhs)
            {
                count++;
            }
        }
        if(count==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}