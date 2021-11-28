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
        System.out.print("You can call me " + p.nickNameArray[0] + p.nickNameArray[1]+
                p.nickNameArray[2]+p.nickNameArray[3] + p.nickNameArray[4] +".");



    }
}
class Person{
    int Favenumber;
    String FaveCartChar;
    char in;
    char [] nickNameArray;








}







}
