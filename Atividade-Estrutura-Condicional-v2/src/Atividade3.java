import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,c,x,y,z,aux;
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        x=a;y=b;z=c;
        //colocar o menor em a
        if(b < a || c < a){
            if(b < c){//menor em b
                aux=a;a=b;b=aux;
            }else{//menor em c
                aux=a;a=c;c=aux;
            }
        }
        //intermediário em b e maior em c
        if(c < b){
            aux=b;b=c;c=aux;
        }
        System.out.printf("%d\n%d\n%d\n",a,b,c);
        System.out.printf("\n%d\n%d\n%d\n",x,y,z);
    }
}
