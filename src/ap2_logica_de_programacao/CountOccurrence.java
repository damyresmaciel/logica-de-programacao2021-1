package ap2_logica_de_programacao;

public class CountOccurrence {
	
	public static void main (String[]args) {
		int array[]= {1,2,3,4,5,6,7,8,9};
		CountOccurrence co = new CountOccurrence();
		System.out.println(co.count(5,array,0));
		
	}

	public boolean hasValue(int searchValue, int[] array, int i) {

		if (i >= array.length) {
			return false;
		}

		if (array[i] == searchValue) {
			return true;	
		} else {
			return hasValue(searchValue, array, i + 1);
		}

	}
	
	public int count(int countValue, int[] array, int i) {
		if(!hasValue(countValue, array, i)|| i>=array.length) {
			return 0;
		}
		
		int c=0;
		if(array[c]==countValue) {
			c++;
		}
		c+= count(countValue,array,i+1);
		return c;	
	}
	


}
