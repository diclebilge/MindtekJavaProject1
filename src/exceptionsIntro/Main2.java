package exceptionsIntro;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start...");
        String val = "w12";
        int[] arr =new int [] {11,12,13};

        try {

            arr[1] = 55;
            int num = 5/5;
            int num2 = Integer.parseInt("12");
            //System.out.println(s.charAt(4));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Hi from ArrayInd....  exc");
        }catch (ArithmeticException ex){
            System.out.println(ex);
            System.out.println("Hi from Arithmetic... exc");
        } catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Hi from NumberFormatException... exc");
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("Hi from Nullpointer... exc");

        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Hi from finally block");
        }

        System.out.println("End...");
    }
}
