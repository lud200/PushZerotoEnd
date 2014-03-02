package pushzeroestoend;

public class pushtoend {
	public static void main(String args[]){
		int[] a={3, 0, 8, 0, 9};
		int[] b=new int[a.length];
		int i=0, n=0, count=0;
		while(i<a.length){
			if(a[i]==0){
				count=count+1;
			}
			else{
				b[n]=a[i];
				n=n+1;
			}
			i=i+1;
		}
		int j=0;
		while(count!=0){
			if(b[j]!=0){
				j=j+1;
			}
			else{
				b[j]=0;
				j=j+1;
				count=count-1;
			}
		}
		for(int k=0;k<b.length;k++){
			System.out.println(b[k]);
		}
	}
}
