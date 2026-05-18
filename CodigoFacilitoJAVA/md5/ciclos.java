class ciclos {
    public static void main(String[] args) {
	    int i= 0;
		while( i++ < 5 )
			System.out.println("ciclo while: " + i );

		i =1 ;
		while ( true ){
			if( i> 5 )
				break;
			System.out.println("ciclo while (true): " + i);
			i++;
		}
		 
		for( i = 1 ; i <= 5 ; i++ )
			System.out.println("ciclo for: " + i);
            	i = 1;
		for( ; i <= 5 ; i++ )
			System.out.println("ciclo for v2: " + i);
		
		i = 1;
		for( ; ; ){
			if( i> 5 )
				break;
			System.out.println("ciclo for v3: " + i);
			i++;
        }
    }
}