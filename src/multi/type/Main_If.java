package multi.type;

public class Main_If {
    public static void main(String[] args) {
        System.out.println("hello");
        int x= 10;
        switch (x){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20...");
                break;
            default:
                System.out.println("other...");
                break;
        }

        String key ="java";
        switch (key){
            case "java":
                System.out.println("백앤드");
                break;
            case "html":
                System.out.println("프론트앤드");
                break;
            default:
                System.out.println("가타....");
        }



        int su1 = 10, su2= 20;
        char c = '-';
    }
}
