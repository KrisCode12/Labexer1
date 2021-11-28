public class LabExer1A {

    public static void main(String[] args) {

        Person p = new Person();
        p.Favenumber = 12;
        p.FaveCartChar = "Sponge Bob";
        p.in = 'P';
        p.nickNameArray = new char[]{'C', 'o', 'j','h','e'};


        System.out.println(p.Favenumber + " is my favorite number");
        System.out.println("I love  " + p.FaveCartChar );
        System.out.println("My name is Kristian Cojhe " + p.in + "." + " Magalllanes."  );
        System.out.print("You can call me ");
        System.out.print(p.nickNameArray[0]);
        System.out.print(p.nickNameArray[1]);
        System.out.print(p.nickNameArray[2]);
        System.out.print(p.nickNameArray[3]);
        System.out.print(p.nickNameArray[4]);
        System.out.println(".");


    }
}
class Person{
    int Favenumber;
    String FaveCartChar;
    char in;
    char [] nickNameArray;








}
