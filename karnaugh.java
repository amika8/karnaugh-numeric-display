import java.util.Scanner;
import java.util.HashMap; // import the HashMap class


class karnaugh {

    private String binaryVal;

    public String getBinaryVal() {
        return binaryVal;
    }

    public void setBinaryVal(String binaryVal) {
        this.binaryVal = binaryVal;
    }


    public static void main(String[] args) {


        System.out.println("Karnaugh :");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an hexadecimal character (if letter make sure its in uppercase !)");

        String userInput = myObj.nextLine();  // Read user input
        System.out.println("Your character is: " + userInput);  // Output user input
    
        karnaugh karnaugh = new karnaugh(userInput);
        try {
            karnaugh.getLine();
        } catch (Exception e) {
            System.out.println("Error when issuing user input make sure it is an (Hexadecimal) uppercase character");
            System.exit(0);
        }
        karnaugh.printLine();     
        
    
    }

    public HashMap<String, String> getLine(){
        String userBinaryValue = this.getBinaryVal();
        //System.out.println("val : "+userBinaryValue);

        HashMap<String, String> combinations = new HashMap<String, String>();

        combinations.put("A", ( logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) ) || ( logic(Character.getNumericValue(userBinaryValue.charAt(1))) && logic(Character.getNumericValue((userBinaryValue.charAt(2))))  ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(1)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) ) ? "――":" ");
        combinations.put("B", ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) && logic(Character.getNumericValue(userBinaryValue.charAt(3))) ) ? "|":" ");
        combinations.put("C", ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3))))  ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(1)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) ) ? "|":" ");
        combinations.put("D", ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3))))) || ( logic(Character.getNumericValue((userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(1)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) ? "――":" ");
        combinations.put("E", ( logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(2)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(1)))) ) ? "|":" ");
        combinations.put("F", ( logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) ) ? "|":" ");
        combinations.put("G", ( logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) && logic(Character.getNumericValue((userBinaryValue.charAt(2)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(2)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(3)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(1)))) ) || ( logic(Character.getNumericValue((userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(3)))) ) || ( logic(Integer.parseInt(prime(userBinaryValue.charAt(0)))) && logic(Character.getNumericValue((userBinaryValue.charAt(1)))) && logic(Integer.parseInt(prime(userBinaryValue.charAt(2)))) ) ? "――":" ");

        return combinations;
    }

    public void printLine(){
        HashMap<String, String> line = this.getLine();

        System.out.println(" " + line.get("A") + "  ");
        System.out.println(line.get("F")  + "  " + line.get("B") );
        System.out.println(" " + line.get("G") + "  ");
        System.out.println(line.get("E")  + "  " + line.get("C") );
        System.out.println(" " + line.get("D") + "  ");

    }

    public boolean logic(int bit){
        return bit == 1 ? true:false;
    }

    public String prime(char bit){
        return String.valueOf(bit).equals("0")?"1":"0";
    }

    public karnaugh(String userInput){

        String binUserInput = hexToBin(userInput);
        this.setBinaryVal(binUserInput);
        //System.out.println(binUserInput); 
    }

    private String hexToBin(String hex){
        try {
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        }
        catch (Exception e) {
            System.out.println("error when converting userInput to binary");
        }
        return hex;
    }
}

