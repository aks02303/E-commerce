import java.util.*;
import java.io.*;
import demo.*;
import ecomm.Seller;
import ecomm.Product;
class PlatformMain{
    public static void main(String args[])throws IOException{
          DemoPlatform obj=new DemoPlatform();
          Seller1 s1=new Seller1("101");
          Seller3 s5=new Seller3("105");
          Seller2 s4=new Seller2("103");
          s1.addPlatform(obj);
          s4.addPlatform(obj);
          s5.addPlatform(obj);
          Product p1=new Mobile("Poco",10101,104,"1");
          //Product b1=new Book(100101,1010,"101","1221");
          Product p2=new Mobile("Vivo",10111,121,"234");
          Product p3=new Mobile("SamSung",2324,2332,"232");
          Product b1=new Book("Harry", 343, 343,"3432");
          Product b2=new Book("HarryMarry", 3234234, 3432323,"3432342");
          Product b3=new Book("HarryLarry", 3433432, 343434,"3434532");
          //price quantity productid
          s1.addproduct(b1);
          s1.addproduct(p2);
          s1.addproduct(b3);
          Seller1 s2=new Seller1("102");
          s2.addPlatform(obj);
          s4.addproduct(b2);
          s4.addproduct(p3);
          s4.addproduct(p1);
          Scanner sc=new Scanner(System.in);
          //System.out.println(b1.getQuantity());
          while(true){
              System.out.println("Enter Check to Check the requests \nOr Press END to exit");
              String enter=sc.next();
              if(enter.equals("Check")){
              obj.processRequests();
            }
            else if(enter.equals("END")){
                break;
            }
            else{
                System.out.println("Wrong Input");
            }
            
          }
          
    }     
}