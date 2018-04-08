import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class CTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = A.class;
		A aa = new A();
		String str[] = new String[3];
		str[0]="m1";
		str[1]="m2";
		str[2]="m3";
		for(int i=0;i<str.length;i++){
			Method m = cls.getDeclaredMethod(str[i], null);
			m.invoke(aa, null);
		}

	}

}
