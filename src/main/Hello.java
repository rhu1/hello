//$ javac --release 11 -d out src/main/Hello.java
//$ jar cvf dist/Hello.jar -C out .
//$ java -cp dist/Hello.jar main.Hello

package main;
class Hello {
    public static void main(String[] args) {
		System.out.println("Hello");
    }
}

