public class Triangle {
        public int width;
        public String res = "";
        Triangle(int width)
        {
            this.width = width;
        }
        public String toString()
        {
            for(int i=1;i<=width;i++)
            {
                for(int j = 1;j<=i;j++)
                {
                    res+=" " + "[*]";
                }
                res+="\n";
            }
            return  res;
        }

    }

