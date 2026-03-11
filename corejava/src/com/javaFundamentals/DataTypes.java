package com.javaFundamentals;

public class DataTypes {
	byte b = 127;
// 1byte -->8bits  --> range -2^7 to 2^7-1 --> 	 -128 to 127
	byte b1 = (byte) 256;
	short s = 32767;
//	2bytes -->16bits -->range -2^15 to 2^15-1 -->    -32,768 to 32,767
	short s1 = (short) 378905;

	int i = 2147483647;
//  4bytes -->32bits -->range -2^31 to 2^31-1 --> -2,147,483,648 to 2,147,483,647
	int i1 = 'A';

	long l = 9223372036854775807L;
//    8bytes -->64bits -->range -2^63 to 2^63-1 --> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	long l1 = 'y';

	float f = 456789890000F; // 4bytes
	double d = 45678900000D;// 8bytes

	char c = 'q';
//2bytes -->16bits -->range    0 to 65,535 
	char c1 = 549;

	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		System.out.println(dt.b);
		System.out.println(dt.b1);

		System.out.println(dt.s);
		System.out.println(dt.s1);

		System.out.println(dt.i);
		System.out.println(dt.i1);

		System.out.println(dt.l);
		System.out.println(dt.l1);

		System.out.println(dt.f);
		System.out.println(dt.d);

		System.out.println(dt.c);
		System.out.println(dt.c1);
	}

}
