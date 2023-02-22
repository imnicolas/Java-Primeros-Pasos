public class TestGetSet2 {

    public static void main(String[] args) {

        // por diversión, hago nuevo objeto de tipo TestGetterSetter. Para concatener caracteres testeando métodos

        TestGetterSetter test = new TestGetterSetter();
        test.setNombre("nicolas");
        test.agregarMarco("---------");

        System.out.println(test.getNombre());
    }
}
