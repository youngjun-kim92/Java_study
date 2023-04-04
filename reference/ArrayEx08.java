package javapro.reference;

public class ArrayEx08 {

	public static void main(String[] args) {
		
		/**마방진 알고리즘

		1. 첫 행에 중간열에 1을 넣는다.
		2. 대각선 위로 이동한다.
		3. 행이 존재하지 않을 경우에는 마지막 행에 다음 값을 넣는다.
		4. 열이 존재하지 않을 경우에는 첫 열에 다음 값을 넣는다.
		5. 이미 값이 존재할 경우에는 행+2, 열-1 위치로 이동한후 다음 값을 넣는다.
		6. 행과 열이 둘다 존재하지 않을 경우 행+2, 열-1 위치로 이동한후 다음 값을 넣는다.
		7. 2번을 반복*/
		
		int[][] magic=new int[5][5];
		int row, col;													//row(행), column(열)
		int num=1;														//값
		row=0; 															//첫행
		col=magic[0].length/2;											//중간열
		magic[row][col]=num;											//최초 시작점에 1을 넣음
		
		for(num=2;num<=magic.length*magic[0].length;num++) {
			
			//대각선 위로 이동
			row--;
			col++;
			
			//***행과 열이 둘다 없을경우	<-- 묻는건 마지막이지만 둘다 조건이 만족해야하는 경우 제일 처음에 작성해야한다. 안그러면 중복으로 묻는 3,4번 조건에 걸려서 에러남..
			//어차피 처음에 작성해도 조건에 걸려서 묻는건 몇번 안됨 (굉장히 중요!!)
			if(row<0&&col==magic[0].length) {
				row+=2;
				col--;
			}
			
			//행이 없을경우
			if(row<0) {
				row=magic.length-1;										
			}
			
			//열이 없을경우
			if(col==magic[0].length) {
				col=0;
			}
			
			//**값이 존재할 경우
			if(magic[row][col]!=0) {
				row+=2;
				col--;
			}
			
			magic[row][col]=num;
		}
		
		//출력
		for(int i=0;i<magic.length;i++) {
			for(int j=0;j<magic[i].length;j++) {
				if(magic[i][j]<10) {
					System.out.print(" "+magic[i][j]+" ");
				}
				else {
					System.out.print(magic[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}

}
