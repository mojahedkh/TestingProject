import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
  import java.util.regex.Pattern;

class employee {
    private int EmployeeId ;
    private String EmployeeName;
    private int EmployeeNumber ;
    public employee() {
    }

    public employee(int employeeId, String employeeName, int employeeNumber) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EmployeeNumber = employeeNumber;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public void setEmployeeName(String employeeName)  throws Exception{

        Pattern patern = Pattern.compile("[a-z]*");
        boolean isMatch = patern.matcher(employeeName).matches();

        if ( !isMatch)
            throw new NotValidException();

        EmployeeName = employeeName;

    }

    public void setEmployeeNumber(int employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public String getEmployeeName() throws NotValidException{

        if ( this.EmployeeName.isEmpty())
             throw new NotValidException();

            return EmployeeName;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        employee emp = new employee();
        Logger logger = Logger.getLogger(Main.class.getName());

        logger.setLevel(Level.WARNING);

        System.out.println( " the level is "+logger.getLevel());
        System.out.println(  logger.getLevel().intValue() );
        logger.setLevel(Level.INFO);
        System.out.println();

        try{
            emp.setEmployeeName("56565");
        }

        catch (NotValidException e){
            logger.warning( " Invalid Name "+e );
        }

        int [] arr = new int[5];

        try{
            System.out.println( "the number " + arr[22] / 0 );
        }
        catch( ArrayIndexOutOfBoundsException e ){
        }

        catch (ArithmeticException e){
            System.out.println(" there is an Exception while arithmetic excpetion occur ::---->\n" + e);
        }


        System.out.println( " hello this is the programm here ");
        /// loging

        //-------------------------------   ( 2 )


        System.out.println("test by oraib");

        System.out.println("Test second modify");//oraib

    }

}