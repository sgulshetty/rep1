import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ATest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = A.class;
		Method m = cls.getDeclaredMethod("m1", null);
		A aa = new A();
		m.invoke(aa, null);

	}

}