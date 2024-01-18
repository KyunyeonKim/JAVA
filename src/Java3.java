public class Java3 {
    public static void main(String [] args){
        String str_a1="슉-";
        String str_a2 = "슈슉-";
        String str_a3= "슈슈슉 -";

        String str_a4 = str_a1 + str_a2 + str_a3;

        String str_a5 = str_a1.concat(str_a2);

        String str_s6= str_a1
                .concat(str_a2)
                .concat(str_a3)
                .concat(str_a4)
                .concat(str_a5);
    }
}
