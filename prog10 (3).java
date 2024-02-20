class demo{
	public static void main(String[] args){
		int rows=4;
		int x=5;
		int y=0;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=x-i;j++){
				y++;
				System.out.print(y+" ");
			}
		y--;
		System.out.println();	
		}	
	}
}