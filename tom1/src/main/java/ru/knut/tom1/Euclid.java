package ru.knut.tom1;

public class Euclid {

    public static int nod(int m, int n){
        int r = 1;
        m = Math.max(m,n);
        n = Math.min(m,n);

        for(;;){
          r = m % n;
          if(r == 0) return n;
          m = n;
          n = r;
        }
    }
}
