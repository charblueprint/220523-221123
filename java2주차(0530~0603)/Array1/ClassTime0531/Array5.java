package ClassTime0531;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		//빈 배열 변수에 데이터가 있는 배열로 커스텀
		int a[] = new int[3];//3개의 공간만 제공함
		int b[] = {1,2,3,4,5,6,7};//7개의 객체가 있는 상황
		int ea = b.length;//b 배열 안에 몇개의 데이터 객체
		//System.out.println(a.length);
		int a_ea = a.length;
		int t = 0; //b배열의 증가 값
		int tt =0;//a배열의 증가 값
		do {
			if (b[t]%2==0 && tt < a_ea) { // if (b 배열의 값 중 짝수만 && 새로운 a배열에 전체 객체크기 만큼만
				a[tt] = b[t];
				tt++; //조건만 맞을시 인덱스 번호를 +1씩 증가시킴
			}
			t++;
		}while(t<ea);
		System.out.println(Arrays.toString(a));
		//Arrays.toString : 숫자,문자,소수[] 현재 배열 변수값을 출력하는 함수입니다.
	}

}
