package com.company;
    class Delat {
        public static double Summa(int k, double x)
        {
            double sum=0, slag=1;
            int n=-1, p=2;
            double exp=1/Math.pow(10,  k);
            while (Math.abs(slag)>=exp)
            {
                n+=2;
                slag= (Math.pow(x, n)/n)*Math.pow(-1, p);
                sum+=slag;
                p++;
            }
            return sum;
        }

        public static double Tangens(double x)
        {
            double tn = Math.atan(Math.tan(x));
            return tn;
        }
    }



