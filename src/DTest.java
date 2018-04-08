import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class DTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = A.class;
		A aa = new A();
		String str[] = new String[3];
		str[0]="m1";
		str[1]="m2";
		str[2]="m3";
		
		int str1[] = new int[3];
		str1[0]=5;
		str1[1]=10;
		str1[2]=15;
		
		for(int i=0;i<str.length;i++){
			Method m = cls.getDeclaredMethod(str[i], int.class);
			m.invoke(aa, str1[i]);
		}

	}

}
