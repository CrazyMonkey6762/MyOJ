package cn.Fan.main2000_2100;

import java.util.Scanner;

public class Main2082 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N = scan.nextInt();
			if (N <= 0) {
				break;
			}
			for (int n = 0; n < N; n++) {
				int arr[] = new int[27];// 仅仅在开始的时候接受各种字母的个数，并在合并时，控制项的个数
				int result[] = new int[52];// 相乘之后的各个项的系数
				int temp[] = new int[52];// 在相乘时，暂时存储相乘时的系数
				// 接收每一种字母的个数
				for (int i = 1; i <= 26; i++) {
					arr[i] = scan.nextInt();
				}
				for (int i = 0; i <= arr[1]; i++) {//因为第一个括号内的项的个数由arr[1]来控制，所以初始化时，只需要初始化arr[1]个即可
					result[i] = 1;
				}

				// 开始合并每一个括号
				for (int i = 2; i <= 26; i++) {// 最多只能有26个括号，所以是限制在了26
					for (int j = 0; j <= 50; j++) {// j标识的是前面的括号内的第j次幂的项
						int s = 0;// s控制后面的括号内的项最大不能超过arr[i]因为字母的个数不够
						for (int k = 0; k + j <= 50 && s <= arr[i]; k += i, s++) {
	//k标识的是后面括号里的第k次幂的项，因为每个括号内项与项之间相差次幂不一样，所以k不是每次都自增1，而是自增一个与i有关的数，
	 //因為最大只要和為50以內的，所以次幂大于50的没有用
							temp[j + k] += result[j];//将第j项与第k项乘积的系数与第j+k项的系数相加，因为后面括号内的每一项的系数都是1，
					//所以相乘后的系数等于前面括号里的第j项的系数。也就是把前面括号第j项的系数与第j+k项的系数相加
						}
					}
					for (int j = 0; j <= 50; j++) {//把合并后的系数放在标志着前面括号里系数的数组里面，并把暂时存储乘积系数的数组初始化为0
						result[j] = temp[j];
						temp[j] = 0;
					}
				}
				int sum = 0;//总的可能数
				for (int i = 1; i <= 50; i++) {//把组成（1 2 3...50）的所有可能性都加起来
					sum += result[i];
				}

				System.out.println(sum);

			}
		}
	}
}
