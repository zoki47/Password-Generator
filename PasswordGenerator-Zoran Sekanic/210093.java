
public class PasswordGenerator {

    public static void main(String[] args) {
        String result = makePassword(20);//makePassword(20) velicina sifre tj. broj karatera
        System.out.println(result);;
    }

    //Generisanje Passworda
    public static String makePassword(int length){

String password ="" ;
    
    for (int i=0;i<length -2;i++){
password = password + randomCharacter("abcdefghijklmnopqrstuvwxyz");
    }
String randomDigit = randomCharacter("0123456789");
password = insertAtRandom(password, randomDigit);
String randomSymbol = randomCharacter("!@#$%&*()_+-=[]|,./?><");
password = insertAtRandom(password, randomSymbol);
return password;
    }
    //Uzimanje random karatera iz stringa
    public static String randomCharacter (String characters){
int n = characters.length();
int r = (int)(n*Math.random());
return characters.substring(r,r + 1);
}

   //string u string random pozicija
public static String insertAtRandom(String str,String toInsert){
int n = str.length();
int r = (int)((n + 1)*Math.random());
return str.substring(0,r )+ toInsert + str.substring(r);
}}



