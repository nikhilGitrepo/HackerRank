package datastructures;

public class TwoDArray {

	public static void main(String[] args) {
		

		/*int arr[][] = {
				 {1, 1, 1,	 0, 0, 0} 
				,{0, 1, 0,	 0, 0, 0} 
				,{1, 1, 1,	 0, 0, 0}
				
				,{0, 0, 2,	 4, 4, 0} 
				,{0, 0, 0,	 2, 0, 0} 
				,{0, 0, 1,	 2, 4, 0}
		};*/
		
		/*int arr[][] = {
				{1,1,1,0,0,0} 
			   ,{0,1,0, 0, 0,0} 
			   ,{1, 1, 1, 0, 0, 0} 
			   ,{0, 9, 2, -4, -4, 0} 
			   ,{0, 0, 0, -2, 0, 0} 
			   ,{0, 0 ,-1 ,-2 ,-4, 0}
		};*/
		
		/*int arr[][] = {
				 {-1, -1, 0, -9, -2, -2}
				,{-2, -1, -6, -8, -2, -5} 
				,{-1, -1, -1, -2, -3, -4} 
				,{-1, -9, -2, -4, -4, -5} 
				,{-7, -3, -3, -2, -9, -9} 
				,{-1, -3, -1, -2, -4, -5}
				};*/
		
		int arr[][] = {{0, -4, -6, 0, -7, -6
		} 
		 ,{-1, -2, -6, -8, -3, -1
		} 
		 ,{-8, -4, -2, -8, -8, -6
		} 
		 ,{-3, -1, -2, -5, -7, -4
		} 
		 ,{-3, -5, -3, -6, -6, -6
		} 
		 ,{-3, -6, 0, -8, -6, -7}};
		
		/*for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }*/
         
		int greatest = 0;
		for(int arr_r=0; arr_r <= 3; arr_r++){
			for(int arr_c=0; arr_c <= 3; arr_c++){
				
				int rLimit = arr_r+3;
				int cLimit = arr_c+3;
				int sum = 0;
				int curr_ri = 0;
				
				for(int rowIndex = arr_r; rowIndex < rLimit; rowIndex++ ){
					
					int curr_ci = 0;
					
					for(int colIndex = arr_c; colIndex < cLimit; colIndex++ ){
						
						if( !((curr_ri == 1 && curr_ci == 0) || (curr_ri == 1 && curr_ci == 2) ) )
						sum += arr[rowIndex][colIndex];
						
						curr_ci++;

					}
					curr_ri++;
					
				}
				if(arr_r == 0 && arr_c == 0)
					greatest = sum;
				
				
				if(sum > greatest){
					greatest = sum;
				}
				
			}
		}
		System.out.println(greatest);
	}

}
