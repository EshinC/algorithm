package Test1;
/*2013 ccf 
 * ���ִ���������*/
import java.util.*;
public class Test3 {
	public static void main(String[] args) {
		int min = 0;		//���ִ�����ͬ����С����
		int max = 0;		//arr2����Ԫ��
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		int arr1[] = new int[n];		//arr1���ã�������������arr1
		int arr2[] = new int[n];		//arr2���ã���arr1Ԫ�س��ֵĴ�����Ϊarr2��Ԫ��
		for(int i=0;i<n;i++){
			arr1[i] = sc.nextInt();		
			arr2[i] = 0;			//��arr2Ԫ�ض���ʼ��
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){		//ÿ��arr1ÿ��Ԫ�ض��ó����Ƚ�
				if(arr1[j]==arr1[i]){	//�ж���ͬ��Ԫ�أ�arr2���Ԫ������
	        	   arr2[i]++;	
	        	}
			}
		}
		
		for(int i=0;i<n;i++){
		 if(arr2[i]>max){			//�ҳ�arr2������Ԫ��
	        
	        max = arr2[i];			        //��arr2������Ԫ�ظ�max
	        temp = i;				//��temp��ס���Ԫ�ص��±�λ��
	     
	        }
	       }
		
	 	min = arr1[temp];			//������arr1���ҵ����ִ��������Ǹ�Ԫ��
	 	for(int i = 0;i<n;i++){
	 		if(arr2[i] == max)	{	//�ж�arr2��Ԫ�ش��ڵ���max(max��arr2����Ԫ��)
	 		   if(arr1[i]<arr1[temp]){      //������ͬ������Ԫ�أ�ѡ����С��
	 			   min = arr1[i];
	 		   }
	 		}
	 	}
	 	System.out.println(min);		
	}
}