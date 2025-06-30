class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b && b==c && c==d){
            answer = 1111*a;
        }else if(a==b && b==c && c!=d){
            answer = (int)Math.pow(10*a+d,2);
        }else if(a==b && b==d && c!=d){
            answer = (int)Math.pow(10*a+c,2);
        }else if(a==c && c==d && c!=b){
            answer = (int)Math.pow(10*a+b,2);
        }else if(b==c && c==d && a!=b){
            answer = (int)Math.pow(10*b+a,2);
        }else if(a==b && c==d && a!=c){
            answer = (a+c) * Math.abs(a-c);
        }else if(a==c && b==d && a!=b){
            answer = (a+b) * Math.abs(a-b);
        }else if(a==d && b==c && a!=b){
            answer = (a+b) * Math.abs(a-b);
        }else if(a==b && c!=a && c!=d){
            answer = c*d;
        }else if(a==c && b!=d && b!=c){
            answer = b*d;
        }else if(a==d && b!=c && b!=a){
            answer = b*c;
        }else if(b==c && a!=d && a!=b){
            answer = a*d;
        }else if(b==d && a!=c && a!=b){
            answer = a*c;
        }else if(c==d && a!=b && a!=c){
            answer = a*b;
        }else{
            int limit = 6;
            if(limit >= a){
                limit = a;
            }
            if(limit > b){
                limit =b ;
            }
            if(limit > c){
                limit = c;
            }
            if(limit > d){
                limit = d;
            }
            answer = limit; 
        }
        return answer;
    }
}