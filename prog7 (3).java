class demo{
	public static void main(String[] args){
		int rows=6;
		for(int i=1;i<=6;i++){
			int ch=65+rows-i;
			for(int j=1;j<=i;j++){
				System.out.print((char)ch+" ");
				ch++;
			}
		
		System.out.println();	
		}
		
		
	}
}